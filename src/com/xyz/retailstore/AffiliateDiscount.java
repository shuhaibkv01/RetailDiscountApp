package com.xyz.retailstore;

public class AffiliateDiscount implements iDiscount {

	@Override
	public double calculateDiscountAmount(double amount) {
		return amount * CommonConstants.AFFILIATE_DISCOUNT_PERC / 100;
	}
	
}
