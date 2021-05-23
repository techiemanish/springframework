import java.util.*;

public class Question{
    private int id;
    private String ques;
    private List<Answer> answers;
    
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
    
    public List<Answer> getAnswers(){
        return answers;
    }
    public void setAnswers(List<Answer> answers){
        this.answers = answers;
    }
    
    public void display(){
        System.out.println("Question Id: " + id + ". " + ques);
        System.out.println("Answers: ");
        Iterator<Answer> itr = answers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}