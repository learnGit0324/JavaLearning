package Spring.com.adam.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) cxt.getBean("person3");
		System.out.println(person);
		
		NewPerson newPerson = (NewPerson) cxt.getBean("newPerson");
		System.out.println(newPerson);
	}
}
