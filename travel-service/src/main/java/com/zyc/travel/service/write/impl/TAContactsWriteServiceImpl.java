package com.zyc.travel.service.write.impl;

import com.zyc.travel.bpo.write.TAContactsWriteBPO;
import com.zyc.travel.client.vo.ErrorInfoEnum;
import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyContactsVO;
import com.zyc.travel.common.exception.TravelException;
import com.zyc.travel.common.util.Log;
import com.zyc.travel.model.dto.JTravelAgencyContacts;
import com.zyc.travel.service.convert.impl.TAContactsConvertService;
import com.zyc.travel.service.validate.TAContactsValidateService;
import com.zyc.travel.service.validate.impl.TAContactsValidateServiceImpl;
import com.zyc.travel.service.write.TAContactsWriteService;

/**
 * Created by zyc on 17/3/1.
 */
public class TAContactsWriteServiceImpl implements TAContactsWriteService{

    private TAContactsWriteBPO myTAContactsWriteBPO;

    private TAContactsConvertService myTAContactsConvertService = new TAContactsConvertService();

    private TAContactsValidateService myTAContactsValidateService = new TAContactsValidateServiceImpl();

    @Override
    public ResultVO saveContacts(TravelAgencyContactsVO travelAgencyContactsVO) {
        ResultVO returnValue = new ResultVO();

        long beginDate = System.currentTimeMillis();

        try {
            Log.APP.info("添加联系人开始, travelAgencyContactsVO"+travelAgencyContactsVO);

            returnValue = myTAContactsValidateService.foundationValidate(travelAgencyContactsVO);

            JTravelAgencyContacts jTravelAgencyContacts = myTAContactsConvertService.fromPO(travelAgencyContactsVO);

            Integer result = myTAContactsWriteBPO.addContacts(jTravelAgencyContacts);

            Log.APP.info("mysql保存完毕,result:"+result);
            if(result<=0)
                throw new TravelException(ErrorInfoEnum.SYS_ERROR);

        }catch (TravelException te){
            Log.APP.info("添加联系人业务异常 ,异常信息:"+te.getErrorInfo());
            returnValue = new ResultVO(te.getErrorEnum());
        }catch (Exception e){
            Log.APP.info("添加联系人系统异常 ,异常信息:"+e.getMessage());
            returnValue.setErrorCode(ErrorInfoEnum.SYS_ERROR.getCode());
            returnValue.setErrorInfo(ErrorInfoEnum.SYS_ERROR.getInfo());
        }finally {
            Log.APP.info("添加联系人完成,longtime:"+(System.currentTimeMillis()-beginDate));
            return returnValue;
        }
    }

    @Override
    public ResultVO updateContacts(TravelAgencyContactsVO travelAgencyContactsVO) {
        ResultVO returnValue = new ResultVO();
        long beginDate = System.currentTimeMillis();
        try{
            Log.APP.info("更新联系人开始 ");

            returnValue = myTAContactsValidateService.foundationValidate(travelAgencyContactsVO);
            JTravelAgencyContacts jTravelAgencyContacts = myTAContactsConvertService.fromPO(travelAgencyContactsVO);
            Integer result = myTAContactsWriteBPO.updateContacts(jTravelAgencyContacts);
            Log.APP.info("mysql保存完毕");
            if(result<=0)
                throw new TravelException(ErrorInfoEnum.SYS_ERROR);

        }catch (TravelException te){
            Log.APP.info("更新联系人业务异常 ,异常信息:"+te.getErrorInfo());
            returnValue = new ResultVO(te.getErrorEnum());
        }catch (Exception e){
            Log.APP.info("更新联系人系统异常 ,异常信息:"+e.getMessage());
            returnValue.setErrorCode(ErrorInfoEnum.SYS_ERROR.getCode());
            returnValue.setErrorInfo(ErrorInfoEnum.SYS_ERROR.getInfo());
        }finally {
            Log.APP.info("更新联系人完成,longtime:"+(System.currentTimeMillis()-beginDate));
            return returnValue;
        }
    }

    public TAContactsWriteBPO getMyTAContactsWriteBPO() {
        return myTAContactsWriteBPO;
    }

    public void setMyTAContactsWriteBPO(TAContactsWriteBPO myTAContactsWriteBPO) {
        this.myTAContactsWriteBPO = myTAContactsWriteBPO;
    }
}
