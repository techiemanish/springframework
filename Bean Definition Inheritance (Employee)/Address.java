public class Address{
    private String street;
    private String city;
    private String state;
    private String country;
    
    Address(){
        System.out.println("Address default Constructor is invoked");
    }
    
    Address(String street, String city, String state, String country){
        super();
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    
    public String toString(){
        return street + " " + city + " " + state + " " + country;
    }
}