package com.binart.binartmallmarket.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "t_mall_market_coupon_log")
public class CouponLog {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long userId; // 领取人
    private String userNickname; // 领取人昵称
    private Long couponId;
    private String couponCode;
    private Integer getType; // 获取类型：0->后台赠送；1->主动获取
    private Date createTime;
    private Integer useStatus; // 使用状态：0->未使用；1->已使用；2->已过期
    private Date useTime; // 使用时间
    private Long orderId; // 订单编号
    private String orderSn;// orderNo 订单号码

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", memberId=").append(userId);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", memberNickname=").append(userNickname);
        sb.append(", getType=").append(getType);
        sb.append(", createTime=").append(createTime);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", useTime=").append(useTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
