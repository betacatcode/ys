package com.betacat.ys.domain;

import lombok.Data;

/**
 * @author ruin
 * @date 2020/3/16-16:25
 */
@Data
public class AccessToken {
    public static String accessToken;
    private Long expireTime;
}
