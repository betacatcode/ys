package com.betacat.ys.domain.alarm;

import lombok.Data;

import java.util.List;

@Data
public class Alarm {
    /**
     * alarmId : 24027912025633491
     * alarmName : 设备1
     * alarmType : 10000
     * alarmTime : 4364654646485
     * channelNo : 1
     * isEncrypt : 0
     * isChecked : 0
     * recState : 1
     * preTime : 10
     * delayTime : 30
     * deviceSerial : 427734888
     * alarmPicUrl : https://wuhancloudpictest.ys7.com:8083/HIK_1455866402_724A2B55F5AFe741_06CE56000475452014644?isEncrypted=0&isCloudStored=0
     * relationAlarms : []
     * customerType : null
     * customerInfo : null
     */

    private String alarmId;
    private String alarmName;
    private int alarmType;
    private long alarmTime;
    private int channelNo;
    private int isEncrypt;
    private int isChecked;
    private int recState;
    private int preTime;
    private int delayTime;
    private String deviceSerial;
    private String alarmPicUrl;
    private Object customerType;
    private Object customerInfo;
    private List<?> relationAlarms;



}