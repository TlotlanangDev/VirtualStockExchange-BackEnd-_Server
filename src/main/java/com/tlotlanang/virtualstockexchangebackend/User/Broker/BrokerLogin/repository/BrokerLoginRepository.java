package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.repository;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.entity.BrokerLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrokerLoginRepository extends JpaRepository<BrokerLoginEntity, String> {

}
