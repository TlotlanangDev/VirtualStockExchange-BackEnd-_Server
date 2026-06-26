package com.tlotlanang.virtualstockexchangebackend.userRegister;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table(name = "userDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterEntity {
        @Id
        //@GeneratedValue(strategy = GenerationType.IDENTITY)
        private UUID uuid;
        private String name;
        private String surName;
        private LocalDate dateOfBirth;
        private Integer phoneNumber;
        private String emailAddress;
        private String passWord;
        private String physicalAddress;

        @PrePersist
    public void prePersist(){
            if (uuid == null){
                uuid = UUID.randomUUID();
            }
        }

}
