package com.binart.binartwallet.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "t_wallet_transaction_log")
public class TransactionLog implements Serializable {

    public static final String TYPE_CHONGZHI = "0";
    public static final String TYPE_tixian = "1";
    public static final String TYPE_ZHIFU = "2";

    @Id
    private Long id; // 交易流水ID
    private String vid; // 虚拟钱包交易流水ID

    private BigDecimal amount; // 交易金额

    private String inNo; // 入账钱包账号
    private String outNo; // 出账钱包账号

    private Date createTime; // 交易时间
    private Date modifyTime;

}
