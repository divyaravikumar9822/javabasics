package com.basic20;

public class SavingsAccount {
	static double annualInterestRate;
	static double savingsBalance;
	static double interest;
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public double setAnnualInterestRate(double annualInterestRate) {
		return SavingsAccount.annualInterestRate = annualInterestRate/100.0;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		SavingsAccount.savingsBalance = savingsBalance;
	}
	public double calculateMonthlyInterest()
	{
		interest=(savingsBalance*annualInterestRate)/12;
		savingsBalance=savingsBalance+interest;
		return savingsBalance;
	}
public static double modifyInterestRate()
{
	return annualInterestRate;
	
}
public static void main(String[] args) {
	SavingsAccount saver1=new SavingsAccount();
	SavingsAccount saver2=new SavingsAccount();
	saver1.setAnnualInterestRate(4);
	saver2.setAnnualInterestRate(4);
	saver1.setSavingsBalance(2000);
	System.out.println(saver1.calculateMonthlyInterest());
    saver2.setSavingsBalance(3000);
		System.out.println(saver2.calculateMonthlyInterest());
	saver1.setAnnualInterestRate(5);
	saver2.setAnnualInterestRate(5);
	saver1.setSavingsBalance(2000);
	System.out.println(saver1.calculateMonthlyInterest());
	saver2.setSavingsBalance(3000);
	System.out.println(saver2.calculateMonthlyInterest());
	
	
	
	
}
}
