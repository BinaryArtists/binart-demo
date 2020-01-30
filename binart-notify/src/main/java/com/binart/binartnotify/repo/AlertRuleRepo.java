package com.binart.binartnotify.repo;

import com.binart.binartnotify.entity.AlertRuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlertRuleRepo extends JpaRepository<AlertRuleEntity, Long> {

    Optional<AlertRuleEntity> findByKey(String key);
}
