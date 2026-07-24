package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.domain.BankerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.domain.BankerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.entity.BankerRegisterEntity;

public interface BankerRegisterMapper {

    BankerRegisterRequest fromDto(BankerRegisterDto bankerRegisterDto);
    BankerRegisterResponseDto toDto(BankerRegisterEntity bankerRegisterEntity);

}
