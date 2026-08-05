package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.repository;

import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.entity.CompanyViewsBankersEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyViewsBankersRepository extends JpaRepository<CompanyViewsBankersEntity, String> {

    Slice<TemporaryBoardEntity> findBy(Pageable pageable);
}
