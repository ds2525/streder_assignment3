package problem2;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1;
		SavingsAccount saver2;
		
		saver1 = new SavingsAccount(2000.00);
		saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(.04);
		
		double[] saver1MonthlyBalance = new double[12];
		double[] saver2MonthlyBalance = new double[12];
		double[] saver1MonthlyBalance2 = new double[12];
		double[] saver2MonthlyBalance2 = new double[12];
		
		for (int i = 0; i < 12; i++)
		{
			saver1MonthlyBalance[i] = saver1.calculateMonthlyInterest();
			saver2MonthlyBalance[i] = saver2.calculateMonthlyInterest();
			System.out.printf("Month: %d and the Savings in Account 1 with interest rate of 4%%: %6.2f\n", (i + 1), saver1MonthlyBalance[i]);
			System.out.printf("Month: %d and the Savings in Account 2 with interest rate of 4%%: %6.2f\n", (i + 1), saver2MonthlyBalance[i]);
		}
		
		System.out.println();
		SavingsAccount.modifyInterestRate(.05);
		
		for (int i = 0; i < 12; i++)
		{
			saver1MonthlyBalance2[i] = saver1.calculateMonthlyInterest();
			saver2MonthlyBalance2[i] = saver2.calculateMonthlyInterest();
			System.out.printf("Month: %d and the Savings in Account 1 with interest rate of 5%%: %6.2f\n", (i + 1), saver1MonthlyBalance[i]);
			System.out.printf("Month: %d and the Savings in Account 2 with interest rate of 5%%: %6.2f\n", (i + 1), saver2MonthlyBalance[i]);
		}
	}

}
