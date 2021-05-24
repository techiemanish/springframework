import java.util.*;
import java.util.Map.Entry;

public class Question{
    private int id;
    private String ques;
    private Map<Answer, User> answers;
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setQues(String ques){
        this.ques = ques;
    }
    
    public void setAnswers(Map<Answer, User> answers){
        this.answers = answers;
    }
    
    public void display(){
        System.out.println("Questions: ");
        System.out.println("Ques Id " + id + ". " + ques);
        
        Set<Entry<Answer, User>> set = answers.entrySet();
        Iterator <Entry<Answer, User>> itr = set.iterator();
        
        while(itr.hasNext()){
            Entry<Answer, User> entry = itr.next();
            Answer ans = entry.getKey();
            User user = entry.getValue();
            System.out.println("Answer: ");
            System.out.println(ans);
            System.out.println("Posted by: ");
            System.out.println(user);
        }
    }
}