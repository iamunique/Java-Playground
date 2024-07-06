package com.sanket.kolte;

public class NullPointerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			User user = null;
			double orderPrice = 199.99;
			chargeUser(user, orderPrice);

		} catch (Exception e) {
			System.out.println("We are in catch block");
			e.getMessage();
		}
	}

	private static void chargeUser(User user, double orderPrice) {
		user.setAmountOfMoney(user.getAmountOfMoney() - orderPrice);
	}

}

class User {
	private double amountOfMoney;

	public double getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(double amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

}
