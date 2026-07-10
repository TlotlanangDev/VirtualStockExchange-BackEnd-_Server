package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.repository;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyLoginRepository extends JpaRepository<CompanyLoginEntity, String> {
}
