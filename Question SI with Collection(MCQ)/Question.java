import java.util.*;

public class Question{
    private int id;
    private String ques;
    private List<String> answers;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getQues(){
        return ques;
    }
    public void setQues(String ques){
        this.ques = ques;
    }
    
    public List<String> getAnswers(){
        return answers;
    }
    public void setAnswers(List<String> answers){
        this.answers = answers;
    }
    
    public void display(){
        System.out.println("Question Id: " + id + ". " + ques);
        System.out.println("Please select all applicable answers: ");
        Iterator<String> itr = answers.iterator();
        int i = 1;
        while(itr.hasNext()){
            System.out.println(i + ". " + itr.next());
            i++;
        }
        System.out.println();
        
    }
    
}