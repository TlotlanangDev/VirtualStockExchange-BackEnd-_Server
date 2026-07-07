package com.tlotlanang.virtualstockexchangebackend.User.Broker.repository;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BrokerRepository extends JpaRepository<BrokerEntity, UUID> {

}
