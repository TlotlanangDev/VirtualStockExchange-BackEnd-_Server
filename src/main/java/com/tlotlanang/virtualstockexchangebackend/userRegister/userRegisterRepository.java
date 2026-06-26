package com.tlotlanang.virtualstockexchangebackend.userRegister;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface userRegisterRepository extends JpaRepository<UserRegisterEntity, UUID> {
}
