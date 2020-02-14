package com.xyz.retailstore;

public class RetailApplication {

	public static void main(String[] args) {

		BillDetails billDetails = new BillDetails();

		billDetails.setUser(new User(1, UserType.EMPLOYEE, 2019));
		billDetails.setPurchaseType(PurchaseType.GARMENTS);
		billDetails.setTotalAmount(950);
		NetPayCalculatoror netPayCalculatoror = new NetPayCalculatoror();
		System.out.println(netPayCalculatoror.getNetPayAmount(billDetails));
		
	}

}
