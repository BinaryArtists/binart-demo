package com.binart.binartnotify.handler;

import com.binart.binartnotify.notification.EmailNotification;
import com.binart.binartnotify.repo.AlertRuleRepo;
import com.binart.binartnotify.spec.ApiStatInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TpsAlertHandler extends AlertHandler {
    @Autowired
    protected AlertRuleRepo ruleRepo;

    // We need level mapping notification
    protected EmailNotification notification = new EmailNotification();

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        Long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();

        if (tps > ruleRepo.findByKey(apiStatInfo.getApi()).get().getMaxTps()) {
            notification.notify();
            return; /// TODO:
        }
    }
}
