package com.betacat.ys.service;

import com.betacat.ys.domain.LiveURLMsg;
import com.betacat.ys.domain.LiveVideoMsg;

/**
 * @author ruin
 * @date 2020/3/13-9:47
 */
public interface LiveService {

    LiveVideoMsg getLiveVideoMsgList();

    LiveURLMsg getLiveVideoMsgByChannel(Integer channel);
}
