package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.domain;

public record CompanyViewsBankersRequest(
        String name,
        String surName,
        String phoneNumber,
        String emailAddress
) {}
