package com.binart.binartnotify.handler;

import com.binart.binartnotify.repo.AlertRuleRepo;
import com.binart.binartnotify.spec.ApiStatInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ErrorAlertHandler extends AlertHandler {
    @Autowired
    protected AlertRuleRepo ruleRepo;

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        super.check(apiStatInfo);

        if (apiStatInfo.getErrorCount() > ruleRepo.findByKey(apiStatInfo.getApi()).get().getMaxErrorCount()) {
            // TODO:
        }
    }
}
