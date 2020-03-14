package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
//import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		
/*		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		Test t = (Test)context.getBean("t");
		t.Hello("Vishank");*/
		
		
		String[] files = {"resources/car.xml","resources/engine.xml","resources/collectionForSpecificCollection.xml", "resources/fruits.xml", "resources/collection.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(files);
		Car c = (Car) context.getBean("car");
		((ClassPathXmlApplicationContext) context).close();
		c.print();
	}

}
