package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.repository;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.entity.CompanyRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyRegisterRepository extends JpaRepository<CompanyRegisterEntity, UUID> {

}
