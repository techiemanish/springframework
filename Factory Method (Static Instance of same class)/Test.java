import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
      ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
      
      A a1 = (A) factory.getBean("q");
      a1.display();
    }
}