package com.tlotlanang.virtualstockexchangebackend.userRegister.repository;

import com.tlotlanang.virtualstockexchangebackend.userRegister.entity.UserRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRegisterRepository extends JpaRepository<UserRegisterEntity, UUID> {

}
