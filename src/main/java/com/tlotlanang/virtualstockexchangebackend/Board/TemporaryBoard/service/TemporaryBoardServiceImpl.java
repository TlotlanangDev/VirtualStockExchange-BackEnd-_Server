package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.service;

import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity.TemporaryBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.repository.TemporaryBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TemporaryBoardServiceImpl implements TemporaryBoardService{

    @Autowired
    private TemporaryBoardRepository temporaryBoardRepository;

    @Override
    public Slice<TemporaryBoardEntity> getListings( Pageable pageable) {


        return temporaryBoardRepository.findBy(pageable);
    }

    @Override
    public TemporaryBoardEntity viewByCompanyName(Integer companyName) {
        return temporaryBoardRepository.findById(companyName).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Company not found with Email Address: " + companyName));
    }
}
