public class User{
    private int id;
    private String name, email;
    
    public User(){
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
    public User(int id, String name, String email){
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public String toString(){
        return "User Details are: " + id + ". " + " Name: " + name + " Email ID: " + email;
    }
}