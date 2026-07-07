package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerEntity;

public interface BankerMapper {

    BankerRequest fromDto(BankerDto bankerDto);
    BankerResponseDto toDto(BankerEntity bankerEntity);

}
