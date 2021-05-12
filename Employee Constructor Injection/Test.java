import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee obj =(Employee)factory.getBean("e");  
        Employee obj1 =(Employee)factory.getBean("f"); 
        Employee obj2 =(Employee)factory.getBean("e"); 
        Employee obj3 =(Employee)factory.getBean("h"); 
        
        
        obj.display();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}