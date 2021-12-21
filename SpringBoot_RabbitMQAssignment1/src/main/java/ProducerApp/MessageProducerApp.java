package ProducerApp;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Config.RabbitMQConfig;


public class MessageProducerApp {
	
	  final static String queueName = "message_queue";
	  public static void main(String[] args) {
		
		  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RabbitMQConfig.class);
		  RabbitTemplate  rabbitTemplate = ( RabbitTemplate ) ctx.getBean( "rabbitTemplate");
		  
		  rabbitTemplate.convertAndSend(queueName, "Hello World");
		  System.out.println("Message has been sent successfully to queue");
	}
		
	}

