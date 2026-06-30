package com.tlotlanang.virtualstockexchangebackend.homeLander;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeLandingRepository extends JpaRepository<HomeLandingEntity,String> {
}
