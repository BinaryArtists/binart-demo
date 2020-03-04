package com.binart.binartpay.service;

import com.binart.binartpay.domain.VirtualWalletDomain;
import com.binart.binartpay.entity.VirtualWalletEntity;
import com.binart.binartpay.repo.TransactionRepo;
import com.binart.binartpay.repo.VirtualWalletRepo;
import com.binart.binartutils.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class VirtualWalletService {
    @Autowired
    VirtualWalletRepo virtualWalletRepo;
    @Autowired
    TransactionRepo transactionRepo;

    public VirtualWalletDomain getVirtualWallet (Long walletId) {
        VirtualWalletEntity walletEntity = this.virtualWalletRepo.getOne(walletId);

        VirtualWalletDomain walletDomain = BeanUtil.copy(walletEntity, VirtualWalletDomain.class);

        return walletDomain;
    }

    public BigDecimal getBalance (Long walletId) {
        VirtualWalletEntity walletEntity =  this.virtualWalletRepo.findById(walletId).get();
        VirtualWalletDomain walletDomain = BeanUtil.copy(walletEntity, VirtualWalletDomain.class);
        return walletDomain.getBalance();
    }

    public void debit (Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity =  this.virtualWalletRepo.findById(walletId).get();
        VirtualWalletDomain walletDomain = BeanUtil.copy(walletEntity, VirtualWalletDomain.class);

        walletDomain.debit(amount);

        walletEntity.setBalance(walletDomain.getBalance());

        this.virtualWalletRepo.save(walletEntity);
    }

    public void credit (Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity =  this.virtualWalletRepo.findById(walletId).get();
        VirtualWalletDomain walletDomain = BeanUtil.copy(walletEntity, VirtualWalletDomain.class);

        walletDomain.credit(amount);

        walletEntity.setBalance(walletDomain.getBalance());

        this.virtualWalletRepo.save(walletEntity);
    }

    public void transfer (Long fromWalletId, Long toWalletId) {

    }

}
