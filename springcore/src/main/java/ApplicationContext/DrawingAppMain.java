package ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingAppMain {
	
	
	/**
	 * @author Dinesh Rajput
	 *
	 */
	
	 /**
	  * @param args
	  */
	 public static void main(String[] args) 
	 {
	ApplicationContext context = new ClassPathXmlApplicationContext("/ApplicationContext/NewFile.xml");
	Triangle triangle = (Triangle) context.getBean("Triangle");
	triangle.draw();
	 }
	}
