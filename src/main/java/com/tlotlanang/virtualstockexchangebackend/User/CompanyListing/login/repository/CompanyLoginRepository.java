package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.repository;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.entity.CompanyLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyLoginRepository extends JpaRepository<CompanyLoginEntity, String> {
}
