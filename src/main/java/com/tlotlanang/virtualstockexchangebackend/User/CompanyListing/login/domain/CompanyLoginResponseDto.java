package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain;

import lombok.Builder;

@Builder
public record CompanyLoginResponseDto(
        String emailAddress,
        String passWord
) {
}
