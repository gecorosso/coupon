package com.example.coupon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.coupon.controllers.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@ComponentScan({"com.example.daos.CouponDao"})
@ComponentScan(basePackageClasses=RestController.class)
public class CouponApplication implements CommandLineRunner{
    private static final Logger log = LoggerFactory.getLogger(CouponApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CouponApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("INIZIO DI Coupon Application");
		
	}

}
