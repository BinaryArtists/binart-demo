package com.binart.binartnotify.service;

import com.binart.binartnotify.constant.EmergencyLevel;
import com.binart.binartnotify.repo.AlertRuleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertService {
    @Autowired
    private AlertRuleRepo ruleRepo;

    // 1. 假设这个方法已经运行在已有系统中，此时要增加检查规则, 请看AlertServiceV2
    public Integer check(String api, Long requestCount, Long errorCount, Long durationOfSeconds) {
        Long tps = requestCount / durationOfSeconds;
        if (tps > ruleRepo.findByKey(api).get().getMaxTps()) {
            return EmergencyLevel.URGENCY.getCode();
        }

        if (errorCount > ruleRepo.findByKey(api).get().getMaxErrorCount()) {
            return EmergencyLevel.SEVERE.getCode();
        }

        return EmergencyLevel.NONE.getCode();
    }

    // 2. 增加超时次数检测, 请看AlertServiceV2

}
