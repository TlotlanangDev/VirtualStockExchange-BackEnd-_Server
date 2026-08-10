package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.repository;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingPending.Entity.MainListingPendingEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.entity.CompanySelectBankerEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanySelectBankerRepository extends JpaRepository<CompanySelectBankerEntity, String> {

    Slice<MainListingPendingEntity> findBy(Pageable pageable);
}
