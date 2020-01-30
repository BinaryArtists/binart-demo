package com.binart.binartnotify.spec;

import lombok.Data;

@Data
public class ApiStatInfo {
    private String api;
    private Long requestCount;
    private Long errorCount;
    private Long durationOfSeconds;
    private Long timeoutCount;
}
