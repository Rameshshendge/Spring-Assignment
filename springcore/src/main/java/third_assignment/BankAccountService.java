package third_assignment;


public interface BankAccountService {
	public double withdraw(long accountId,double balance);
	public double deposit(long accountId,double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount,long toAccount,double amount);
	

}
abstract class BankAccountServiceImpl implements BankAccountService
{
	long accountId;
	double balance;
	long fromAccount;
	long toAccount;
	double account;
	
	public void  withdraw()
	{
		System.out.println("Account id = "+accountId +"balance= "+ balance);
	}
	public void balance()
	{
		System.out.println("AccountId="+accountId+"Balance="+balance);
	}
	public void deposit()
	{
		System.out.println("AccountId="+accountId+"Balance="+balance);
		
	}
	public void fundTransfer()
	{
		System.out.println("AccountId="+accountId+"Balance="+balance);
	}
}