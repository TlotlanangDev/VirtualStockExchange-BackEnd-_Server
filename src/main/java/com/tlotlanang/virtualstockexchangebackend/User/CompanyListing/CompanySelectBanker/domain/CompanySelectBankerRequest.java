package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.domain;

public record CompanySelectBankerRequest(
        String name,
        String surName,
        String phoneNumber,
        String emailAddress
) {}
