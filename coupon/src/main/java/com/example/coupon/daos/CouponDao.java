package com.example.coupon.daos;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.coupon.entities.Coupon;

public interface CouponDao extends JpaRepository<Coupon, Integer> {
	Optional<Coupon> findByAccount(String account);
}
