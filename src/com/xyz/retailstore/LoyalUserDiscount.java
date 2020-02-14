package com.xyz.retailstore;

public class LoyalUserDiscount implements iDiscount {

	@Override
	public double calculateDiscountAmount(double amount) {
		return amount * CommonConstants.LOYAL_DISCOUNT_PERC / 100;
	}
}
