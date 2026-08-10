package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.repository;

import com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.Entity.MainBoardEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainBoardRepository extends JpaRepository<MainBoardEntity,Integer> {

    Slice<MainBoardEntity> findBy(Pageable pageable);
}
