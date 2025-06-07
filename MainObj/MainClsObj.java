class Car{

 String brand;
 int year;

 void display(){
  System.out.println("Brand: "+ brand + "  Year: "+ year);
 }

} 
 
public class MainClsObj{

 public static void main(String args[]){

 Car myCar = new Car();
 myCar.brand = "Toyota";
 myCar.year = 2022;
 myCar.display();

 }

} 