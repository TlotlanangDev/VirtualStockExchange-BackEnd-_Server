package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.domain;

public record CompanyViewsBankersRequest(
        String name,
        String surName,
        String phoneNumber,
        String emailAddress
) {}
