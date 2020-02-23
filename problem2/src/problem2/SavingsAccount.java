package problem2;

public class SavingsAccount {

	private static double annualInterestRate = 0.0;
	private double savingsBalance;
	public static void main(String[] args) {

	}
	
	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}
	
	public double calculateMonthlyInterest()
	{
		savingsBalance += (savingsBalance * annualInterestRate) / 12;
		return savingsBalance;
	}
	
	public static void modifyInterestRate(double newAnnualInterestRate)
	{
		annualInterestRate = newAnnualInterestRate;
	}
	
	public double getSavingsBalance()
	{
		return this.savingsBalance;
	}
}
