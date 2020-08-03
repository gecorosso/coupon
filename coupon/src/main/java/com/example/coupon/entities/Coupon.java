package com.example.coupon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="coupon")
@Entity

@AllArgsConstructor
//NoArgsCostructor costruisce il costruttore senza argomenti
@NoArgsConstructor

public class Coupon {
	@Id
	@Column(name="couponid")
	@Getter @Setter
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Getter @Setter
	@Column(name="couponcode")
	private String code;
	
	@Getter @Setter
	@Column(name="account")
	private String account;
	
}
