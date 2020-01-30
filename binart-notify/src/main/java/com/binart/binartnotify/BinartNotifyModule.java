package com.binart.binartnotify;

import com.binart.binartnotify.constant.EmergencyLevel;
import com.binart.binartnotify.notification.Notification;
import com.binart.binartnotify.handler.ErrorAlertHandler;
import com.binart.binartnotify.handler.TimeoutAlertHandler;
import com.binart.binartnotify.handler.TpsAlertHandler;
import com.binart.binartnotify.service.AlertServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BinartNotifyModule {
    @Autowired
    private AlertServiceV2 alertServiceV2;

    private Map<String, Notification> notificationMap = new HashMap<>();

    public void initialize () {
        notificationMap.put(EmergencyLevel.SEVERE.getMsg(), Notification.create("email"));

        alertServiceV2.addAlertHandler(new TpsAlertHandler());
        alertServiceV2.addAlertHandler(new ErrorAlertHandler());
        alertServiceV2.addAlertHandler(new TimeoutAlertHandler());
    }
}
