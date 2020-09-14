package com.betacat.ys.domain;

import lombok.Data;

/**
 * @author ruin
 * @date 2020/3/13-10:37
 */
@Data
public class LiveVideo {
    private String deviceSerial;
    private Integer channelNo;
    private String deviceName;
    private String liveAddress;
    private String hdAddress;
    private String rtmp;
    private String rtmpHd;
    private Long beginTime;
    private Long endTime;
    private Integer status;
    private Integer exception;
}
