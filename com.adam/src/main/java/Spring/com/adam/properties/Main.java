package Spring.com.adam.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws SQLException {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans-properties.xml");
		
		DataSource datasource = (DataSource) cxt.getBean("dataSource");
		System.out.println(datasource.getConnection());
	}
}
