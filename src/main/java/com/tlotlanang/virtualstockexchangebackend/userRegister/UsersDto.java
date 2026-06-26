package com.tlotlanang.virtualstockexchangebackend.userRegister;


import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
public record UsersDto(UUID Id, String name, String surName, LocalDate dateOfBirth,
                       Integer phoneNumber, String emailAddress, String passWord,
                       String physicalAddress) {}
