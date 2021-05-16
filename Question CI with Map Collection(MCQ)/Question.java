import java.util.*;
import java.util.Map.*;

public class Question{
    private int id;
    private String ques;
    private Map<String, String> answers;
    
    Question(){
        System.out.println("Default Constructor is invoked.");
    }
    Question(int id, String ques, Map<String, String> answers){
        super();
        this.id = id;
        this.ques = ques;
        this.answers = answers;
    }
    
    public void display(){
        System.out.println("Question: ");
        System.out.println(id + ". " + ques);
        Set<Entry<String, String>> set=answers.entrySet();  
        Iterator<Entry<String, String>> itr=set.iterator();
        while(itr.hasNext()){
            Entry<String, String> entry = itr.next();
            System.out.println("Submitted Answers: " + entry.getKey() + " Posted by " + entry.getValue());
        }
    }
}