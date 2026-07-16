package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.service;

import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain.TemporaryBoardRequest;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.repository.TemporaryBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

public class TemporaryBoardServiceImpl implements TemporaryBoardService{

    @Autowired
    private TemporaryBoardRepository temporaryBoardRepository;

    @Override
    public TemporaryBoardEntity submitlisting(TemporaryBoardRequest temporaryBoardRequest, Pageable pageable) {
        TemporaryBoardEntity temporaryBoardEntity = new TemporaryBoardEntity(
                temporaryBoardRequest.Id(),
                temporaryBoardRequest.companyName(),
                temporaryBoardRequest.registrationNumber(),
                temporaryBoardRequest.registrationDate(),
                temporaryBoardRequest.telePhone(),
                temporaryBoardRequest.emailAddress(),
                temporaryBoardRequest.companyName(),
                temporaryBoardRequest.stockShare(),
                temporaryBoardRequest.pricePerShare());

        return temporaryBoardRepository.save(temporaryBoardEntity);
    }
}
