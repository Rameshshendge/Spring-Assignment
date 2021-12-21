package SpringCoreMavenAssignment;


import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    
    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/SpringCoreMavenAssignment/Spring core Maven.xml");
	Adddress ad=(Adddress)context.getBean("Address");
	System.out.println(ad);
	Customer sc=(Customer)context.getBean("Customer");
	System.out.println(sc);
	
  } 
}