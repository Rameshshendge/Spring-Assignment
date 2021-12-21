package third_assignment;


public class BankAccountC {
	BankAccountServiceImpl bai=new BankAccountServiceImpl() {
		
		public double withdraw(long accountId, double balance) {
			
			return withdraw(12345, 200);
		}
		
		public double getBalance(long accountId) {
			
			return getBalance(12345);
		}
		
		public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
			
			return false;
		}
		
		public double deposit(long accountId, double balance) {
			
			return deposit(12345, 18000) ;
		}
	


 };
}