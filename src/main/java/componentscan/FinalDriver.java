package componentscan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class FinalDriver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("component.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Trainer trainer=(Trainer) beanFactory.getBean("trainer");
	System.out.println(trainer);
	Student student=new Student();
	System.out.println(student);
}
}
