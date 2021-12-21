package third_assignment;


import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/third_assignment/Assign3Config.xml");
		BankAccount  bac=(BankAccount)context.getBean("BankAccount");
		System.out.println(bac);
		BankAccount  bac1=(BankAccount)context.getBean("BankAccount1");
		System.out.println(bac1);
		
	}

}