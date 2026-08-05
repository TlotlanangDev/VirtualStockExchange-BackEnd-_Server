package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.domain.BankerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.domain.BankerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.entity.BankerRegisterEntity;

public interface BankerRegisterMapper {

    BankerRegisterRequest fromDto(BankerRegisterDto bankerRegisterDto);
    BankerRegisterResponseDto toDto(BankerRegisterEntity bankerRegisterEntity);

}
