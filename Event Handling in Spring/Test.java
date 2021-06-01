import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
     ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
     context.start();
     HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
     obj.getMessage();
     context.stop();
    }
}