package com.binart.binartnotify.service;

import com.binart.binartnotify.handler.AlertHandler;
import com.binart.binartnotify.spec.ApiStatInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlertServiceV2 {
    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    public void rmAlertHandler (AlertHandler alertHandler) {
        this.alertHandlers.remove(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler alertHandler : this.alertHandlers) {
            alertHandler.check(apiStatInfo);
        }
    }
}
