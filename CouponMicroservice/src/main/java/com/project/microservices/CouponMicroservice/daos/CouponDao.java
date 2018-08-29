package com.project.microservices.CouponMicroservice.daos;

import com.project.microservices.CouponMicroservice.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CouponDao extends JpaRepository<Coupon, Integer> {

    Optional<Coupon> findByAccount(String account);
}
