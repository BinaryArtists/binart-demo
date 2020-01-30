package com.binart.binartnotify.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// 告警规则
@Data
@Entity
@Table(name = "t_notify_alert_rule")
public class AlertRuleEntity {
    @Id
    private Long id;

    private String key;

    private Long maxTps; // times per second

    private Long maxErrorCount;

    private Long maxTimeoutCount;
}
