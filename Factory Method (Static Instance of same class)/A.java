public class A{
    private static final A obj = new A();
    
    private A(){
        System.out.println("Class A Private Construtor is invoked.");
    }
    
    public static A getA(){
        System.out.println("Hi Users! I have been set by Factory Method.");
        return obj;
    }
    
    public void display(){
        System.out.println("Class A display method is invoked.");
    }
}