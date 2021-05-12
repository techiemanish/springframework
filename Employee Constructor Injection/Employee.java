public class Employee {
   private String name;
   private int id;

   public Employee (){
       System.out.println("Default Constructor");
   }
   public Employee (int id){
       this.id = id;
   }
   public Employee (String name){
       this.name = name;
   }
   public Employee (int id, String name){
       this.id = id;
       this.name = name;
   }
   
   void display(){
       System.out.println(id +" " + name);
   }
   
}