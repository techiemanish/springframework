import java.util.*;

public class Answer{
    private int id;
    private String answer;
    private Date date_posted;
    
    Answer(){
        System.out.println("Default Constructor is invoked");
    }
    
    Answer(int id, String answer, Date date_posted){
        super();
        this.id = id;
        this.answer = answer;
        this.date_posted = date_posted;
    }
    
    public String toString(){
        return "Answer id is " + id + ". " + answer + " Posted Date " + date_posted;
    }
}