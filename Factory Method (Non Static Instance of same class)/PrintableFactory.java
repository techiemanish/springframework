public class PrintableFactory{
    public Printable getPrintable(){
        return new B();
        // We can also return class A instance
        // return new A();
    }
}