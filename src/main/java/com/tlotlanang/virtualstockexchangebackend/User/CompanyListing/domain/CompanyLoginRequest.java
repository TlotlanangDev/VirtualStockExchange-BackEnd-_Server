package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain;

import lombok.Builder;

@Builder
public record CompanyLoginRequest(
        String emailAddress,
        String passWord
) {
}
