package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.service;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.entity.BankerRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.repository.BankerRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankerRegisterServiceImplement implements BankerRegisterService {

    @Autowired
    private BankerRegisterRepository bankerRegisterRepository;


    @Override
    public BankerRegisterEntity createUser(BankerRegisterRequest bankerRegisterRequest) {

        BankerRegisterEntity bankerRegisterEntity = new BankerRegisterEntity(
                null,
                bankerRegisterRequest.name(),
                bankerRegisterRequest.surName(),
                bankerRegisterRequest.dateOfBirth(),
                bankerRegisterRequest.phoneNumber(),
                bankerRegisterRequest.emailAddress(),
                bankerRegisterRequest.passWord()
        );
        return bankerRegisterRepository.save(bankerRegisterEntity);
    }

}
