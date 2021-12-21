package third_assignment;


public interface BankAccountRepository {
	public double getBalance(long accountId);
	public double updateBalance(long accountId,double newBalance);
	

}
abstract class BankAccountRepositoryImpl implements BankAccountRepository
{
	private void bankAccountRepositoryImpl()
	{
		BankAccount ba=new BankAccount();
		ba.setAccountHolderName("Ramesh Shendge");
		ba.setAccountBalance(1200);
		ba.setAccountType("Savings");
		ba.setAccountId(12345);
		
	}
	
	
}