import org.springframework.beans.factory.annotation.Required;

public class Student{
    private int id;
    private String name;
    private String college;
    
    @Required
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    
    @Required
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    @Required
    public void setCollege(String college){
        this.college = college;
    }
    public String getCollege(){
        return college;
    }
}