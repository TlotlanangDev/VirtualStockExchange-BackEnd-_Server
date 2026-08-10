package com.tlotlanang.virtualstockexchangebackend.Board.MainListingPending.repository;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingPending.Entity.MainListingPendingEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainListingPendingRepository extends JpaRepository<MainListingPendingEntity, Integer> {
    Slice<MainListingPendingEntity> findBy(Pageable pageable);
}
