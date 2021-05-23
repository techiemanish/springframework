public class Answer{
    private String id;
    private String name;
    private String by;
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getBy(){
        return by;
    }
    public void setBy(String by){
        this.by = by;
    }
    
    public String toString(){
        return "Answer id " + id + ". " + name + " " + "posted by " + by;
    }
}