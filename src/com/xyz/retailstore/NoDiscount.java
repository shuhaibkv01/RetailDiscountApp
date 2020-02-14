package com.xyz.retailstore;

public class NoDiscount implements iDiscount {

	@Override
	public double calculateDiscountAmount(double amount) {
		return 0;
	}
	
}
