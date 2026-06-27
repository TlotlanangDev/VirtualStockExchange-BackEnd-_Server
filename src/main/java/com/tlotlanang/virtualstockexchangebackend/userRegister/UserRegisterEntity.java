package com.tlotlanang.virtualstockexchangebackend.userRegister;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "userDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterEntity {
        @Id
        @GeneratedValue
        @UuidGenerator
        private UUID uuid;
        @NotBlank(message = "Name Cannot be Empty..")
        private String name;
        @NotBlank(message = "surName Cannot be Empty..")
        private String surName;
        @Past
        private LocalDate dateOfBirth;
        @Min(10)
        @Max(10)
        @Positive
        private Integer phoneNumber;
        @NotBlank(message = "emailAddress Cannot be Empty..")
        @Email(message = "Please Enter correct Email")
        private String emailAddress;
        @NotBlank(message = "passWord Cannot be Empty..")
        private String passWord;
        @NotBlank(message = "physicalAddress Cannot be Empty..")
        private String physicalAddress;
}
