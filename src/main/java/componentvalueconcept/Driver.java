package componentvalueconcept;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String[] args) {

//		Resource resource = new ClassPathResource("different.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		Mobile mobile=(Mobile) beanFactory.getBean("mobile");
//		System.out.println(mobile);

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("different.xml");
		Mobile mobile=applicationContext.getBean("mobile",Mobile.class);
		System.out.println(mobile);
	}
}
