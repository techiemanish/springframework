import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class Test {
    public static void main(String args[]) {
      Resource r = new ClassPathResource("Beans.xml");
      BeanFactory factory = new XmlBeanFactory(r);
      Employee e1 = (Employee) factory.getBean("e");
      e1.show();
    }
}