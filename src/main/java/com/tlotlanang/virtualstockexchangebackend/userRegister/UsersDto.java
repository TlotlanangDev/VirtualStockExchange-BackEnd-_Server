package com.tlotlanang.virtualstockexchangebackend.userRegister;


import java.util.Date;
import java.util.UUID;
public record UsersDto(UUID Id, String name, String surName, Date dateOfBirth,
                       Integer phoneNumber, String emailAddress, String passWord,
                       String physicalAddress) {}
