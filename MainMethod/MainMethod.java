class Circle{
 double radius;
 double calculateRadiusOfCircle(){
  return Math.PI*radius*radius;	
 }
 double calculatePerimeter(){
  return 2*Math.PI*radius;
 }
}

public class MainMethod{
 public static void main(String args[]){
  Circle c = new Circle();
  c.radius = 5;
  System.out.println("Area of a Circle:" + c.calculateRadiusOfCircle());
  System.out.println("Perimeter of a Circle:" + c.calculatePerimeter());
 }
}