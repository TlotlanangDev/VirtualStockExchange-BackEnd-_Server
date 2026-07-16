package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.repository;

import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemporaryBoardRepository extends JpaRepository<TemporaryBoardEntity, Integer> {
}
