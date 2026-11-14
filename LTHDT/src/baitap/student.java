package baitap;

public class student {
    private String ID ;
    private String name;
    private int age;
    private double GAP;
    public student(String ID, String name, int age, double GAP){
       this.ID=ID;
       this.name=name;
       this.age=age;
       this.GAP=GAP;
    }
   public String getID(){
    return this.ID;
   }
   public void setID(String ID){
    this.ID=ID;
   }
   public String getname(){
    return this.name;
   }
   public void setname(String name){
    this.name=name;
   }
   public int getage(){
    return this.age;
   }
   public void setage(int age){
    this.age=age;
   }
   public double getGAP(){
    return this.GAP;
   }
   public void setGAP(double GAP){
    this.GAP=GAP;
   }

    public void printInfo(){
        System.out.println("ID :"+ID+"/  name :"+name+"/  age :"+age+"/  GAP :"+GAP);
    }
    public void checkScholarship(){
        if(GAP>=8.0){
            System.out.println("ban duoc hoc bong");
        }else{
            System.out.println("ban khong duoc hoc bong");
        }
    }
 
}
    
