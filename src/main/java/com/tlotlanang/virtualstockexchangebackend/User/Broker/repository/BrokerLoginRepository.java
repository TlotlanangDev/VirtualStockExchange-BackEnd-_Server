package com.tlotlanang.virtualstockexchangebackend.User.Broker.repository;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrokerLoginRepository extends JpaRepository<BrokerLoginEntity, String> {
}
