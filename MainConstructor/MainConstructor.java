class Employee{

 String name;
 int age;

 //No parameter Constructor
 Employee(){
  name = "Unknown";
  age = 0;
 }	
 
 //Parameter Constructor 
 Employee(String n, int a){
  name = n;
  age = a;
 }
 
 void display(){
  System.out.println("Name: " +name+ " Age:" +age);
 }
}

public class MainConstructor{
 public static void main(String args[]){

 //we are creating object for the class since constructor and class name are same, by mentioning the parameter, it will identity which method we are referring to..
 Employee emp1 = new Employee();
 emp1.display();
 Employee emp2 = new Employee("John",29);
 emp2.display();
 }
}