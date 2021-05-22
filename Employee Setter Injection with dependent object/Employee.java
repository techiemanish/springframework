public class Employee{
    private int id;
    private String name;
    private String designation;
    private Address address;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDesignation(){
        return designation;
    }
    
    public void setDesignation(String designation){
        this.designation = designation;
    }
    
    public Address getAddress(){
        return address;
    }
    
    public void setAddress(Address address){
        this.address = address;
    }
    
    public void display(){
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Address: " + address);
    }
}