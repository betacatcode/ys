package com.betacat.ys.domain;

import lombok.Data;

/**
 * @author ruin
 * @date 2020/3/16-13:59
 */
@Data
public class LiveURL {
    private String deviceSerial;
    private Integer channelNo;
    private String deviceName;
    private String hls;
    private String hlsHd;
    private String rtmp;
    private String rtmpHd;
    private Integer status;
    private Integer exception;
    private String ret;
    private String desc;

}
