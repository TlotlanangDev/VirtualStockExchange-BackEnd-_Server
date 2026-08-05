package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain;

import lombok.Builder;

@Builder
public record CompanyLoginRequest(
        String emailAddress,
        String passWord
) {
}
