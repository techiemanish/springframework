public class A{
    B b;
    public B getB(){
        return b;
    }
    public void setB(B b){
        this.b = b;
    }
    
    A(){
        System.out.println("A is created");
    }
    void print(){
        System.out.println("A method is invoked.");
    }
    
    void display(){
        print();
        b.display();
    }
}