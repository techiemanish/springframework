import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    TextEditor t1 =(TextEditor) context.getBean("t1");
    t1.display();
    }
}