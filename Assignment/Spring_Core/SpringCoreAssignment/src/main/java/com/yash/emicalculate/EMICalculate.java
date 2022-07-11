package com.yash.emicalculate;

import java.util.Scanner;

public class EMICalculate {

	double loanAmount;
	double numberOfMonths;
	double interestRate; // In applicationContext we are give interest rate 9.8 by SetterInjection

	public double emiCalculate(double interestRate) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount of Loan : ");
		loanAmount=sc.nextDouble();
		System.out.println("Enter Number of months : ");
		numberOfMonths=sc.nextDouble();
		
		interestRate=interestRate/(12*100);
		return (loanAmount * interestRate * Math.pow(1 + interestRate, numberOfMonths))
				/ (Math.pow(1 + interestRate, numberOfMonths) - 1);

	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(double numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
