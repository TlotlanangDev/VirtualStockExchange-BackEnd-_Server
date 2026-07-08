package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerRegisterEntity;

public interface BankerRegisterMapper {

    BankerRegisterRequest fromDto(BankerRegisterDto bankerRegisterDto);
    BankerRegisterResponseDto toDto(BankerRegisterEntity bankerRegisterEntity);

}
