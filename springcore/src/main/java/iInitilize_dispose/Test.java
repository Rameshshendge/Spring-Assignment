package iInitilize_dispose;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/iInitilize_dispose/NewFile.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaurant res=(Restaurant)context.getBean("restaurantBean");
	//System.out.println(res);
	res.greetCustomer();
	}

}