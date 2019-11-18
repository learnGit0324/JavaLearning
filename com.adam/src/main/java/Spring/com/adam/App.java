package Spring.com.adam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        HelloWorld helloWorld = (HelloWorld) cxt.getBean("helloWorld");
        
        helloWorld.hello();
        
        Car car = (Car) cxt.getBean("car");
        System.out.println(car);
        
        car = (Car) cxt.getBean("car2");
        System.out.println(car);
        
        car = (Car) cxt.getBean("car3");
        System.out.println(car);
        
        
        Person person = (Person) cxt.getBean("person");
        System.out.println(person);

        person = (Person) cxt.getBean("person2");
        System.out.println(person);
    }
}
