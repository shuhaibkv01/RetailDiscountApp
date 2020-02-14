package com.xyz.retailstore;

public class EmployeeDiscount implements iDiscount {

	@Override
	public double calculateDiscountAmount(double amount) {
		return amount * CommonConstants.EMP_DISCOUNT_PERC / 100;
	}
}
