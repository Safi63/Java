public class AccountTest{
	public static void main(String[]args)
	{
		Account account = new Account("Safi Ullah", 50.00);
		
		System.out.printf("initial account balance: $%.2f%n",account.getBalance());
		
		double depositAmount = 25.0;
		
		System.out.printf("%nadding %.2f to account balance%n%n",depositAmount);
		account.deposit(depositAmount);
		
		System.out.printf("new account balance:$%.2f%n",account.getBalance());
	}
}