public class Employee{
    private int id;
    private String name;
    private Address address;
    
    Employee(){
        System.out.println("Employee default Constructor is invoked");
    }
    
    Employee(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }
    
    Employee(int id, String name, Address address){
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    public void display(){
        System.out.println("Employee Details are as follow:");
        System.out.println("Employee id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee has Address: " + address);
    }
}