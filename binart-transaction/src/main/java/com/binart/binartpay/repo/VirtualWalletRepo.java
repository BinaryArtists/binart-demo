package com.binart.binartpay.repo;

import com.binart.binartpay.entity.VirtualWalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirtualWalletRepo extends JpaRepository<VirtualWalletEntity, Long> {

}
