public class HelloWorld{
    private String msg1;
    private String msg2;
    
    public void setMessage1(String msg1){
        this.msg1 = msg1;
    }
    public void setMessage2(String msg2){
        this.msg2 = msg2;
    }
  
    
    public void getMessage1(){
        System.out.println("HelloWorld Message 1: " + msg1);
    }
    public void getMessage2(){
        System.out.println("HelloWorld Message 2: " + msg2);
    }
    
}