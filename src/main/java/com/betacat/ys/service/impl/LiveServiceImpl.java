package com.betacat.ys.service.impl;

import com.betacat.ys.domain.LiveURLMsg;
import com.betacat.ys.domain.LiveVideoMsg;
import com.betacat.ys.service.LiveService;
import com.betacat.ys.utils.HttpUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ruin
 * @date 2020/3/13-9:48
 */
@Service
@PropertySource("classpath:yingshi.properties")
public class LiveServiceImpl implements LiveService {

    @Value("${app.accessToken}")
    String accessToken;

    @Value("${app.videoListURL}")
    String videoListURL;

    @Value("${app.videoURL}")
    String videoURL;

    @Override
    public LiveVideoMsg getLiveVideoMsgList() {
        Map map=new HashMap();
        map.put("accessToken",accessToken);
        map.put("pageSize",20);
        String result = null;
        try {
            result = HttpUtil.post(videoListURL,map);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson=new Gson();
        LiveVideoMsg liveVideoMsg=gson.fromJson(result,LiveVideoMsg.class);
        return liveVideoMsg;
    }

    @Override
    public LiveURLMsg getLiveVideoMsgByChannel(Integer channel) {

        String deviceSerial=getLiveVideoMsgList().getData().get(0).getDeviceSerial();
        Map map=new HashMap();
        map.put("accessToken",accessToken);
        map.put("source",deviceSerial+":"+channel);

        String result = null;
        try {
            result=HttpUtil.post(videoURL,map);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson=new Gson();
        LiveURLMsg liveVideoMsg=gson.fromJson(result,LiveURLMsg.class);

        return liveVideoMsg;
    }
}
