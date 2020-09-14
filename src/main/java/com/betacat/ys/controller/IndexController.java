package com.betacat.ys.controller;

import com.betacat.ys.domain.LiveVideoMsg;
import com.betacat.ys.domain.LiveVideo;
import com.betacat.ys.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ruin
 * @date 2020/3/13-9:29
 */

@Controller
@PropertySource("classpath:yingshi.properties")
public class IndexController {

    @Autowired
    LiveService liveService;

    @Value("${app.accessToken}")
    String accessToken;

    @RequestMapping("/")
    public String goIndex(Model model){
        LiveVideoMsg liveVideoMsg = liveService.getLiveVideoMsgList();
        List<LiveVideo> data = liveVideoMsg.getData();

        model.addAttribute("data",data);
        return "/index";
    }
}
