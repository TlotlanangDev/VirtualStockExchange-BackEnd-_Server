package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.domain;

public record CompanyViewsBankersRequest(
        String name,
        String surName,
        String phoneNumber,
        String emailAddress
) {}
