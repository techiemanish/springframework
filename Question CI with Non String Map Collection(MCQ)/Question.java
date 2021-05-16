import java.util.*;
import java.util.Map.*;

public class Question{
    private int id;
    private String ques;
    private Map<Answer,User> answers;
    
    Question(){
        System.out.println("Default Constructor is invoked.");
    }
    Question(int id, String ques, Map<Answer,User> answers){
        super();
        this.id = id;
        this.ques = ques;
        this.answers = answers;
    }
    
    public void display(){
        System.out.println("Question: ");
        System.out.println(id + ". " + ques);
        System.out.println();
        Set<Entry<Answer,User>> set=answers.entrySet();  
        Iterator<Entry<Answer,User>> itr = set.iterator();
        while(itr.hasNext()){
            Entry<Answer,User> entry = itr.next();
            Answer ans = entry.getKey();
            User user = entry.getValue();
            
            System.out.print("Submitted Answers: ");
            System.out.println(ans);
            System.out.print("Posted by ");
            System.out.println(user);
            System.out.println();
            
        }
    }
}