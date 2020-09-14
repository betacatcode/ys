package com.betacat.ys.domain.alarm;

import com.betacat.ys.domain.Page;
import lombok.Data;

import java.util.List;

@Data
public class AlarmMsg {

    /**
     * page : {"total":9,"page":0,"size":3}
     * data : [{"alarmId":"24027912025633491","alarmName":"设备1","alarmType":10000,"alarmTime":4364654646485,"channelNo":1,"isEncrypt":0,"isChecked":0,"recState":1,"preTime":10,"delayTime":30,"deviceSerial":"427734888","alarmPicUrl":"https://wuhancloudpictest.ys7.com:8083/HIK_1455866402_724A2B55F5AFe741_06CE56000475452014644?isEncrypted=0&isCloudStored=0","relationAlarms":[],"customerType":null,"customerInfo":null},{"alarmId":"24027912025633469","alarmName":"设备2","alarmType":10000,"alarmTime":4364654646485,"channelNo":1,"isEncrypt":0,"isChecked":0,"recState":1,"preTime":10,"delayTime":30,"deviceSerial":"427734777","alarmPicUrl":"https://wuhancloudpictest.ys7.com:8083/HIK_1455865753_B2B20A0FB4B45da2_06CE56000475437014644?isEncrypted=0&isCloudStored=0","relationAlarms":[],"customerType":null,"customerInfo":null},{"alarmId":"24027912025633457","alarmName":"设备3","alarmType":10000,"alarmTime":4364654646485,"channelNo":1,"isEncrypt":0,"isChecked":0,"recState":1,"preTime":10,"delayTime":30,"deviceSerial":"427734666","alarmPicUrl":"https://wuhancloudpictest.ys7.com:8083/HIK_1455865563_0C0F2D84B18Ead68_06CE56000475431014644?isEncrypted=0&isCloudStored=0","relationAlarms":[],"customerType":null,"customerInfo":null}]
     * code : 200
     * msg : 操作成功!
     */

    private Page page;
    private String code;
    private String msg;
    private List<Alarm> data;


}
