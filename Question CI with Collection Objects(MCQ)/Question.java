import java.util.*;

public class Question{
    private int id;
    private String ques;
    private List <String> answers;
    
    Question(){
        System.out.println("Object Created");
    }
    
    Question(int id, String ques, List <String> answers){
        this.id = id;
        this.ques = ques;
        this.answers = answers;
    }
    
    public void display(){
        System.out.println("Ques " + id + " : " + ques);
        System.out.println("Your options are : ");
        Iterator <String> itr = answers.iterator();
        int a = 1;
        while(itr.hasNext()){
            System.out.println(a + ". " + itr.next());
            a++;
        }
        
    }
}