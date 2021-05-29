import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      Student s1 = (Student) context.getBean("s");
      System.out.println("Student Details are as follow: ");
      System.out.println("Student Id: " + s1.getId());
      System.out.println("Student Name: " + s1.getName());
      System.out.println("College: " + s1.getCollege());
    }
}