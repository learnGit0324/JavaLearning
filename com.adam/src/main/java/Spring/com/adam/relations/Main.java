package Spring.com.adam.relations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.com.adam.autowire.Address;
import Spring.com.adam.autowire.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("bean-relation.xml");
		Address address = (Address) cxt.getBean("address");
		System.out.println(address);
		
		address = (Address) cxt.getBean("address2");
		System.out.println(address);
		
		address = (Address) cxt.getBean("address3");
		System.out.println(address);
		
		address = (Address) cxt.getBean("address5");
		System.out.println(address);
		
		Person person = (Person) cxt.getBean("person");
		System.out.println(person);
	}
}
