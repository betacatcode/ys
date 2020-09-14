package com.betacat.ys;

import com.betacat.ys.domain.LiveURLMsg;
import com.betacat.ys.domain.LiveVideoMsg;
import com.betacat.ys.domain.LiveVideo;
import com.betacat.ys.domain.alarm.Alarm;
import com.betacat.ys.domain.alarm.AlarmMsg;
import com.betacat.ys.service.AlarmService;
import com.betacat.ys.service.LiveService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YsApplicationTests {

	@Autowired
	LiveService liveService;

	@Autowired
	AlarmService alarmService;

	@Test
	void contextLoads() {
	}

	@Test
	void videoList(){
		LiveVideoMsg data=liveService.getLiveVideoMsgList();
		for(LiveVideo video:data.getData())
			System.out.println(video);
	}

	@Test
	void liveURLTest(){
		LiveURLMsg liveVideoMsgByChannel = liveService.getLiveVideoMsgByChannel(2);
		System.out.println(liveVideoMsgByChannel);
	}

	@Test
	void alarmList(){
		AlarmMsg data=alarmService.getAlarmMsg();
		for(Alarm alarm:data.getData())
			System.out.println(alarm);
	}


}
