package com.binart.binartpay.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "t_transaction_virtual_wallet")
public class VirtualWalletEntity {

    @Id
    private Long id;

    private BigDecimal balance;
}
