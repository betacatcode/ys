package com.betacat.ys.domain;

import lombok.Data;

import java.util.List;

/**
 * @author ruin
 * @date 2020/3/13-10:36
 */
@Data
public class LiveVideoMsg {
    private Page page;
    private List<LiveVideo> data;

}
