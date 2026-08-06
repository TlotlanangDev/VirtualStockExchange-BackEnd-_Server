package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.repository;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.entity.BrokerRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BrokerRegisterRepository extends JpaRepository<BrokerRegisterEntity, UUID> {

}
