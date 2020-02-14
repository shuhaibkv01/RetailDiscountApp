package com.xyz.retailstore;

public class NetPayCalculatoror {

	public double getNetPayAmount(BillDetails billDetails) {
		iDiscount percDiscount = DiscountFactory.getDiscount(billDetails);
		double totalDiscountAmount = new TotalDiscount(percDiscount)
				.calculateDiscountAmount(billDetails.getTotalAmount());
		return (billDetails.getTotalAmount() - totalDiscountAmount);
	}

}
