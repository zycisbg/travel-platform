package com.zyc.travel.service.write.impl;

import com.zyc.travel.bpo.write.TravelAgencyWriteBPO;
import com.zyc.travel.client.vo.ErrorInfoEnum;
import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyVO;
import com.zyc.travel.common.exception.TravelException;
import com.zyc.travel.common.util.Log;
import com.zyc.travel.service.convert.impl.TravelAgencyConvertService;
import com.zyc.travel.service.validate.TravelAgencyValidateService;
import com.zyc.travel.service.validate.impl.TravelAgencyValidateServiceImpl;
import com.zyc.travel.service.write.TravelAgencyWriteService;

/**
 * Created by zyc on 17/1/19.
 */
public class TravelAgencyWriteServiceImpl implements TravelAgencyWriteService{

    private TravelAgencyWriteBPO myTravelAgencyWriteBPO;

    private TravelAgencyValidateService myTravelAgencyValidateService = new TravelAgencyValidateServiceImpl();

    private TravelAgencyConvertService myTravelAgencyConvertService = new TravelAgencyConvertService();

    @Override
    public ResultVO saveTravelAgency(TravelAgencyVO travelAgencyVO) {
        ResultVO returnValue = new ResultVO();
        long beginDate = System.currentTimeMillis();

        try {
            Log.APP.info("添加旅行社开始 ");
            //验证
            returnValue = myTravelAgencyValidateService.foundationValidate(travelAgencyVO);

            boolean isSuccess = myTravelAgencyWriteBPO.addTravelAgency(myTravelAgencyConvertService.fromPO(travelAgencyVO));

            if(!isSuccess)
                throw new TravelException(ErrorInfoEnum.SYS_ERROR);

        }catch (TravelException te){
            Log.APP.info("添加旅行社异常 ,异常信息:"+te.getErrorInfo());
            returnValue = new ResultVO(te.getErrorEnum());
        }catch (Exception e){
            Log.APP.info("添加旅行社失败,失败原因:["+e.getMessage()+"]");
        }finally {
            Log.APP.info("添加旅行社完成,longtime:"+(System.currentTimeMillis()-beginDate));
            return returnValue;
        }
    }

    public TravelAgencyWriteBPO getMyTravelAgencyWriteBPO() {
        return myTravelAgencyWriteBPO;
    }

    public void setMyTravelAgencyWriteBPO(TravelAgencyWriteBPO myTravelAgencyWriteBPO) {
        this.myTravelAgencyWriteBPO = myTravelAgencyWriteBPO;
    }
}
