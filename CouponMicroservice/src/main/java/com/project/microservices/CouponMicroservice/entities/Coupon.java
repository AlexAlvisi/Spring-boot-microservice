package com.project.microservices.CouponMicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table (name="coupon")
@Entity

public class Coupon {

    @Id
    @Column(name="couponid")
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="couponcode")
    @Getter @Setter
    private String code;

    @Column(name="account")
    @Getter @Setter
    private String account;

    public Coupon() {
    }

    public Coupon(String code, String account) {
        this.code = code;
        this.account = account;
    }

    public String getCode() {
        return code;
    }
}
