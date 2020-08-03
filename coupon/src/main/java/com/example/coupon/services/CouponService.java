package com.example.coupon.services;

public interface CouponService {
	//prende in input il jwt
	//Ricavato dal primo microservizio
	//Richiami gli account e con gli account 
	//Tiriamo fuori i i coupons
	String getAvailableCoupons(String jwt);
	//repupera i dati per ottenere tutti i coupon 
	//disponibili
	
	
}
