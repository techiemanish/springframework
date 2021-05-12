public class Employee{
    private int id;
    private String name;
    private Address address;
    
    Employee(){
        System.out.println("Employee Entry Created");
    }
    
    Employee(int id, String name, Address address){
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    void show(){
        System.out.println("Employee Detail are as follows: ");
        System.out.println("Employee SAP ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address are as follows: ");
        System.out.print(address.toString());
        
    }
    
}