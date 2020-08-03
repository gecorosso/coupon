package com.example.coupon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.coupon.services.*;

@SpringBootTest
class CouponApplicationTests {
	
	CouponService cs = new com.example.coupon.services.CouponServiceImpl();
	
	@Test
	void contextLoads() {
		System.out.println("CIAO");
	}
	
	@Test
	void getAvailableCoupons() {
		String jwt ="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJSR05MU044N0gxM0Q3NjFSIiwiZXhwIjoxNTg2NDQxNTgwLCJuYW1lIjoiQWxlc3NhbmRybyBBcmdlbnRpZXJpIiwic2NvcGUiOiJ1c2VyIn0.2x5M2urjt08SUSBhZ0q-DUreFIpzqmpiPZtT9RD1DdI";
		cs.getAvailableCoupons(jwt);
		
		
	}

}
