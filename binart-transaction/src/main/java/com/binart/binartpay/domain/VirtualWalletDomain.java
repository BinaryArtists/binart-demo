package com.binart.binartpay.domain;

import lombok.Data;

import javax.naming.InsufficientResourcesException;
import javax.naming.InvalidNameException;
import java.math.BigDecimal;

@Data
public class VirtualWalletDomain {
    private Long id; // = preAllocatedId();
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;
    private boolean isAllowedOverdraft = true;
    private BigDecimal overdraftAmount = BigDecimal.ZERO;
    private BigDecimal frozenAmount = BigDecimal.ZERO;

    public void debit (BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
//            throw new InsufficientResourcesException("");
        }

        this.balance.subtract(amount);
    }

    public void credit (BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
//            throw new InvalidNameException("");
        }

        this.balance.add(amount);
    }


    /**
     * 冻结
     *
     * @param amount
     */
    public void freeze (BigDecimal amount) {

    }

    /**
     * 解冻
     *
     * @param amount
     */
    public void unfreeze (BigDecimal amount) {

    }

    /**
     * 透支
     *
     * @param amount
     */
    public void increaseOverdraftAmount (BigDecimal amount) {

    }

    /**
     *
     * @param amount
     */
    public void decreaseOverdraftAmount (BigDecimal amount) {

    }

    public void closeOverdraft () {

    }

    public void openOverdraft () {

    }

    public BigDecimal getAvaliableBalance () {
        BigDecimal totalAvaliableBalance = this.balance.subtract(this.frozenAmount);

        if (this.isAllowedOverdraft) {
            totalAvaliableBalance += this.overdraftAmount;
        }

        return totalAvaliableBalance;
    }

}
