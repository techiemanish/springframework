public class User{
    private int id;
    private String name,email;
    
    User(){
        System.out.println("Default User Constructor is invoked");
    }
    
    User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public String toString(){
        return "User id: " + id + " User Name: " + name + " User Email:  " + email; 
    }
}