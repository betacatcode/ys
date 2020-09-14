package com.betacat.ys.domain;

import lombok.Data;

import java.util.List;

/**
 * @author ruin
 * @date 2020/3/16-13:59
 */
@Data
public class LiveURLMsg {
    private List<LiveURL> data;
    private String code;
    private String msg;
}
