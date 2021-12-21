package MessageConsumer;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Config.RabbitMQConfig;
import Receiver.MessageReceiver;

public class MessageConsumerApp {
	
	 final static String queueName = "message_queue";
	 
	 public static void main(String[] args) throws InterruptedException {
		
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RabbitMQConfig.class);
		 MessageReceiver receiver =(MessageReceiver) ctx.getBean("receiver");
		 receiver.getCountDownLatch().await(20000, TimeUnit.SECONDS);
	}

}
