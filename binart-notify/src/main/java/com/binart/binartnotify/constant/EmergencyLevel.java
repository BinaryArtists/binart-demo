package com.binart.binartnotify.constant;

// 通知的紧急程度，不同紧急程度对应不同的发送渠道
public enum EmergencyLevel {
    NONE(0, "正常"),
    SEVERE(1, "严重"),
    URGENCY(2, "紧急"),
    NORMAL(3, "普通"),
    TRIVIAL(4, "无关紧要"),
    ;

    /// - 实现体

    private Integer code = 0;
    private String msg = "";
    EmergencyLevel(Integer code, String msg) {this.code = code; this.msg = msg;}
//    @Override
    public Integer getCode() { return code; }
//    @Override
    public String getMsg() { return msg; }
}
