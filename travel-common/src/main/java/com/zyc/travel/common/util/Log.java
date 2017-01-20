package com.zyc.travel.common.util;

import org.apache.commons.logging.LogFactory;

/**
 * Created by songxinlei on 2016/1/11.
 */
public enum Log {

    APP("APP"), HB("APP");

    org.apache.commons.logging.Log sLog;


    Log(String s) {
        sLog = LogFactory.getLog(s);
    }

    public void info(String info) {
        sLog.info(info);
    }

    public void debug(String debug) {
        sLog.info(debug);
    }

    public void error(String error) {
        sLog.info(error);
    }

}
