package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.service;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.entity.BankerLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.repository.BankerLoginRepository;
import com.tlotlanang.virtualstockexchangebackend.globalExceptionHandler.exception.EmailPassException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankerLoginServiceImpl implements BankerLoginService {

    @Autowired
    private BankerLoginRepository bankerLoginRepository;

    @Override
    public BankerLoginEntity loginUser(BankerLoginRequest bankerLoginRequest) {

        BankerLoginEntity bankerLoginEntity = new BankerLoginEntity(
                         bankerLoginRequest.emailAddress(),
                         bankerLoginRequest.passWord());
        return bankerLoginRepository.
               findById(bankerLoginEntity
               .getEmailAddress()).map(bankerEntity ->
               {if(bankerEntity.getPassWord().equals(bankerLoginEntity.getPassWord())){return bankerEntity;}
               throw new EmailPassException("PassWord and Email do not match.");})
               .orElseThrow(() -> new EmailPassException("Email not found"));
    }
}
