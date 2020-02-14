package com.xyz.retailstore;

import java.time.LocalDate;

public class DiscountFactory {

	public static iDiscount getDiscount(BillDetails billDetails) {
		
		if (PurchaseType.GROCERIES.equals(billDetails.getPurchaseType())) {
			return new NoDiscount();
		} else if(UserType.EMPLOYEE.equals(billDetails.getUser().getUserType())) {
			return new EmployeeDiscount();
		}else if(UserType.AFFILIATE.equals(billDetails.getUser().getUserType())) {
			return new AffiliateDiscount();
		} else if((billDetails.getUser().getJoinedYear() - LocalDate.now().getYear()) >2) {
			return new LoyalUserDiscount();
		} else {
			return new NoDiscount();
		}
	}

}
