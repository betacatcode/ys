package com.betacat.ys.domain;

import lombok.Data;

/**
 * @author ruin
 * @date 2020/3/13-10:36
 */
@Data
public class Page {
    private Integer total;
    private Integer page;
    private Integer size;

}
