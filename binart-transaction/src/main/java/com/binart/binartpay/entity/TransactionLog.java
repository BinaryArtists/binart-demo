package com.binart.binartpay.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "t_transtion_log") // t_transaction_transaction_log -> t_transaction_log 前缀去冗，这样可以
public class TransactionLog {
    // 虚拟钱包交易流水

    private Long id; // 交易流水号

    private BigDecimal amount; // 交易金额

    private String type; // 交易类型: 加、减

    private String vno; // 虚拟钱包账号

    private Long walletTid; // tid 代表交易流水ID，tno 代表交易流水号

    private Date createTime; // 交易时间
    private Date modifyTime;
}
