package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("companytrainer.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Company company=(Company) beanFactory.getBean("comp");
	System.out.println(company);
	Trainer trainer=(Trainer)beanFactory.getBean("trainer");
	System.out.println(trainer);
}
}
