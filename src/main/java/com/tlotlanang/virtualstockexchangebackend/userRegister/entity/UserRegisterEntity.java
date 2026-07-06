package com.tlotlanang.virtualstockexchangebackend.userRegister.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "UserInfo")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterEntity {
        @Id
        @GeneratedValue
        @UuidGenerator
        private UUID uuid;
        private String name;
        private String surName;
        private LocalDate dateOfBirth;
        private String phoneNumber;
        private String emailAddress;
        private String passWord;

}
