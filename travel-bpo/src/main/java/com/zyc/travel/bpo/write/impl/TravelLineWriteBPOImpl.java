package com.zyc.travel.bpo.write.impl;

import com.zyc.travel.bpo.write.TravelLineWriteBPO;
import com.zyc.travel.model.dto.JTravelLine;
import com.zyc.travel.model.dto.JTravelLineDetail;
import com.zyc.travel.model.dto.JTravelLineExt;
import com.zyc.travel.model.mapper.JTravelLineDetailMapper;
import com.zyc.travel.model.mapper.JTravelLineExtMapper;
import com.zyc.travel.model.mapper.JTravelLineMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zyc on 17/3/2.
 */
public class TravelLineWriteBPOImpl implements TravelLineWriteBPO {

    private JTravelLineMapper myJTravelLineMapper;

    private JTravelLineDetailMapper myJTravelLineDetailMapper;

    private JTravelLineExtMapper myJTravelLineExtMapper;
    @Override
    public Integer addTravelLine(JTravelLine jTravelLine) {
        int count;
        jTravelLine.setCreateDate(new Date());
        jTravelLine.setUpdateDate(new Date());
        count = myJTravelLineMapper.insertSelective(jTravelLine);

        if(count < 1){
            return count;
        }

        for(JTravelLineDetail temp : jTravelLine.getjTravelLineDetailList()){
            temp.setLineId(jTravelLine.getId());
            count = myJTravelLineDetailMapper.insertSelective(temp);
            if(count < 1){
                return count;
            }
        }
        JTravelLineExt jTravelLineExt = jTravelLine.getjTravelLineExt();
        jTravelLineExt.setId(jTravelLine.getId());
        count = myJTravelLineExtMapper.insertSelective(jTravelLineExt);

        return count;
    }

    @Override
    public List<Integer> addTravelLines(JTravelLine jTravelLine,List<Date> dateList) {
        int count;
        List<Integer> idList = new ArrayList<>();
        for(Date goDate:dateList){
            jTravelLine.setGoDate(goDate);
            count = this.addTravelLine(jTravelLine);
            if(count < 1){
                return null;
            }
            idList.add(jTravelLine.getId());
            jTravelLine.setId(null);
        }
        return idList;
    }

    @Override
    public Integer updateTravelLine(JTravelLine jTravelLine) {
        int count;
        jTravelLine.setUpdateDate(new Date());
        count = myJTravelLineMapper.updateByPrimaryKeySelective(jTravelLine);
        if(count < 1){
            return count;
        }

        if(jTravelLine.getjTravelLineDetailList()!=null && jTravelLine.getjTravelLineDetailList().size()>0){

            for(JTravelLineDetail temp: jTravelLine.getjTravelLineDetailList()){
                count = myJTravelLineDetailMapper.updateByPrimaryKeySelective(temp);
                if(count < 1){
                    return count;
                }
            }
        }

        if(jTravelLine.getjTravelLineExt()!=null){

            count = myJTravelLineExtMapper.updateByPrimaryKeySelective(jTravelLine.getjTravelLineExt());
        }

        return count;
    }

    @Override
    public Integer updateOutDateLine() {
        return myJTravelLineMapper.updateOutDateLine();
    }

    public JTravelLineMapper getMyJTravelLineMapper() {
        return myJTravelLineMapper;
    }

    public void setMyJTravelLineMapper(JTravelLineMapper myJTravelLineMapper) {
        this.myJTravelLineMapper = myJTravelLineMapper;
    }

    public JTravelLineDetailMapper getMyJTravelLineDetailMapper() {
        return myJTravelLineDetailMapper;
    }

    public void setMyJTravelLineDetailMapper(JTravelLineDetailMapper myJTravelLineDetailMapper) {
        this.myJTravelLineDetailMapper = myJTravelLineDetailMapper;
    }

    public JTravelLineExtMapper getMyJTravelLineExtMapper() {
        return myJTravelLineExtMapper;
    }

    public void setMyJTravelLineExtMapper(JTravelLineExtMapper myJTravelLineExtMapper) {
        this.myJTravelLineExtMapper = myJTravelLineExtMapper;
    }
}
