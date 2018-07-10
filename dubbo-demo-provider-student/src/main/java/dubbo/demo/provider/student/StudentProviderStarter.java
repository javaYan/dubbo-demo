package dubbo.demo.provider.student;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentProviderStarter {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dubbo-provider.xml");
		context.start();
		System.out.println("dubbo provider-student started successfully!");
		System.in.read();
	}
}
