package com.binart.binartpoints.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "t_credit_transaction")
public class CreditTransaction {
    private Long id;
    private Long userId;
    private Long chanId; // 赚取或消费渠道ID
    private Long eventId; // 相关事件ID比如订单ID、评论ID、优惠券换购交易ID
    private Long credit; // 积分（赚取为正，消费为负）
    private Date createTime;
    private Date expiredTime;
}
