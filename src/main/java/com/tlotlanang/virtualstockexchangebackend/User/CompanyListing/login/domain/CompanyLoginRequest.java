package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain;

import lombok.Builder;

@Builder
public record CompanyLoginRequest(
        String emailAddress,
        String passWord
) {
}
