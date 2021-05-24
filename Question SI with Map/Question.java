import java.util.*;
import java.util.Map.Entry;

public class Question{
    private int id;
    private String ques;
    private Map<String, String> answers;
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setQues(String ques){
        this.ques = ques;
    }
    
    public void setAnswers(Map<String, String> answers){
        this.answers = answers;
    }
    
    public void display(){
        System.out.println("Questions: ");
        System.out.println("Ques Id " + id + ". " + ques);
        
        Set<Entry<String, String>> set = answers.entrySet();
        Iterator <Entry<String, String>> itr = set.iterator();
        
        while(itr.hasNext()){
            Entry<String, String> entry = itr.next();
            System.out.println("Answer: " + entry.getKey() + " by "+  entry.getValue());
        }
    }
}