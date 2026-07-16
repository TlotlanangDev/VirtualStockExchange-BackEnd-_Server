package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.service;

import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardRequest;
import org.springframework.data.domain.Pageable;

public interface TemporaryBoardService {

    TemporaryBoardEntity submitlisting(TemporaryBoardRequest temporaryBoardRequest, Pageable pageable);
}
