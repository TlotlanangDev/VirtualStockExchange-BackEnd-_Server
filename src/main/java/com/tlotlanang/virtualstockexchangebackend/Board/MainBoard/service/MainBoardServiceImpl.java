package com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.service;

import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.Entity.MainBoardEntity;
import com.tlotlanang.virtualstockexchangebackend.Board.MainBoard.repository.MainBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
public class MainBoardServiceImpl implements MainBoardService{

    @Autowired
    private MainBoardRepository mainBoardRepository;


    @Override
    public Slice<MainBoardEntity> getListings(Pageable pageable) {
        return mainBoardRepository.findBy(pageable);
    }
}
