package com.betacat.ys.service.impl;

import com.betacat.ys.domain.LiveVideoMsg;
import com.betacat.ys.domain.alarm.AlarmMsg;
import com.betacat.ys.service.AlarmService;
import com.betacat.ys.utils.HttpUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@PropertySource("classpath:yingshi.properties")
public class AlarmServiceImpl implements AlarmService {

    @Value("${app.accessToken}")
    String accessToken;

    @Value("${app.alarmURL}")
    String alarmURL;

    @Value("${app.alarmByDeviceSerialURL}")
    String alarmByDeviceSerialURL;

    @Value("${app.deviceSerial}")
    String deviceSerial;

    @Override
    public AlarmMsg getAlarmMsg() {
        Map map=new HashMap();
        map.put("accessToken",accessToken);
        map.put("status",2);
        String result = null;
        try {
            result = HttpUtil.post(alarmURL,map);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson=new Gson();
        AlarmMsg alarmMsg=gson.fromJson(result,AlarmMsg.class);
        return alarmMsg;
    }


}
