import java.util.Date;

public class Answer{
    private int id;
    private String answer;
    private Date postedDate;
    
    public Answer(){
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    public void setPostedDate(Date postedDate){
        this.postedDate = postedDate;
    }
    
    public Answer(int id, String answer, Date postedDate){
        super();
        this.id = id;
        this.answer = answer;
        this.postedDate = postedDate;
    }
    
    public String toString(){
        return "Answer id " + id + ". " + answer + " is posted on " + postedDate;
    }
}