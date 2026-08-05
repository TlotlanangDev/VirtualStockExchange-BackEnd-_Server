package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.repository;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.entity.CompanyListingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyListingRepository extends JpaRepository<CompanyListingEntity, UUID> {
}
