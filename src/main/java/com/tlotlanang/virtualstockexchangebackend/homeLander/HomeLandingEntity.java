package com.tlotlanang.virtualstockexchangebackend.homeLander;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeLandingEntity {

    @Id
    private String loginLink;
    private String registerlink;

}
