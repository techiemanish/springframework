import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      Profile p1 = (Profile) context.getBean("p1");
      p1.display();
    }
}