package procon.chap01;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import procon.chap01.bean.Apple;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

	      ApplicationContext context = new ClassPathXmlApplicationContext("./procon/chap01/Beans.xml");
	      Apple obj = (Apple) context.getBean("apple1");
	      System.out.println(obj.getPrice());

	      int a = 1;
	      int b = 1;
	      int sum = new DemoApplication().add(a,b);

	}

	int add(int a, int b) {
		return a + b;
	}

}
