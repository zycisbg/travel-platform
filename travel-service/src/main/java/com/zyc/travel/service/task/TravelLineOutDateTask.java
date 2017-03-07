package com.zyc.travel.service.task;

import com.zyc.travel.bpo.write.TravelLineWriteBPO;
import com.zyc.travel.common.util.Log;

/**
 * Created by zyc on 17/3/7.
 */
public class TravelLineOutDateTask {

    TravelLineWriteBPO myTravelLineWriteBPO;

    public void doJob(){
        Integer result = null;
        Log.TASK.info("定时任务：修改过期线路的状态开始！");
        long beginDate = System.currentTimeMillis();
        try{
            result = myTravelLineWriteBPO.updateOutDateLine();
        }catch (Exception e){
            Log.TASK.info("定时任务：修改过期线路的状态异常！e:"+e.getMessage());
        }finally {
            Log.TASK.info("定时任务：修改过期线路的状态完成,修改条数:" + result);
            Log.TASK.info("定时任务：修改过期线路的状态完成,longtime:" + (System.currentTimeMillis() - beginDate));
        }
    }

    public TravelLineWriteBPO getMyTravelLineWriteBPO() {
        return myTravelLineWriteBPO;
    }

    public void setMyTravelLineWriteBPO(TravelLineWriteBPO myTravelLineWriteBPO) {
        this.myTravelLineWriteBPO = myTravelLineWriteBPO;
    }
}
