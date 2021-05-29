import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile{
    @Autowired 
    @Qualifier("student1")
    private Student student;
    
    public Profile(){
        System.out.println("User Profile is created.");
    }
    
    public void display(){
        System.out.println("Profile Details are as follow: ");
        System.out.println("Unique ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("College: " + student.getCollege());
    }
}