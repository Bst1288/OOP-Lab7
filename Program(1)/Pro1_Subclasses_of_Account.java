public class Pro1_Subclasses_of_Account{
    public static void main(String[] args){
		//Account account = new Account(1122, 5000);
		//SavingAccount savings = new SavingAccount(1001, 5000);
		CheckingAccount checking = new CheckingAccount(0000,5000, 5000);
		
		//account.setAnnualInterestRate(4.5);
		//savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);

		System.out.println("------------------------------------------------------------");
		System.out.println("Checking Account");
		System.out.println("Overdraft Limit : " + checking.getOverdraftLimit());
		System.out.println("Balance is " + checking.getBalance());
		System.out.println("Withdraw: 10000.00");
		checking.withdraw(10000);
		System.out.println("Balance is " + checking.getBalance());
		System.out.println("This account was created at " + checking.getDateCreated());
		System.out.println("------------------------------------------------------------");
	}
}