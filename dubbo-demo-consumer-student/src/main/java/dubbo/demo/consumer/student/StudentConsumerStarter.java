package dubbo.demo.consumer.student;

import dubbo.demo.consumer.student.service.StudentConsumer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentConsumerStarter {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dubbo-consumer.xml");
		context.start();
		System.out.println("dubbo consumer-student started successfully!");


		StudentConsumer studentConsumer = (StudentConsumer)context.getBean("studentConsumer");
		System.out.println(studentConsumer.getById(1L));
		System.out.println(studentConsumer.getList());
	}
}
