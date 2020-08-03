package com.example.coupon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.coupon.entities.JsonResponseBody;
import com.example.coupon.services.CouponService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	private final Logger log = LoggerFactory.getLogger("RestController.class");
	
	@Autowired
    CouponService couponService;

    @CrossOrigin
    @RequestMapping("/findCoupon")
    public ResponseEntity<JsonResponseBody> findCoupons(@RequestParam (value = "jwt") String jwt){
        log.info("-->entrato in ResponseEntity!!<----");
    	try {
    		log.info("jwt-->"+jwt);
    		String coupons = couponService.getAvailableCoupons(jwt);
            log.info("coupons-->"+coupons);
            return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), coupons));
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new JsonResponseBody(HttpStatus.BAD_REQUEST.value(), "Error: " + e.toString()));
        }
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "RISPONDE CORRETTAMENTE!!!";
    }
	
}
