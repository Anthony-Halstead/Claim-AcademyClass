package WeekOne;

import java.util.Scanner;

public class Test{
public static void main(String[] args)
{
  System.out.println("Hello World");

  System.out.println("Type in a radius that is a decimal or whole number");
  Scanner scanner = new Scanner(System.in);
  double radius = scanner.nextDouble();
  getAreaAndCircumference(radius);

 
}
public static void getAreaAndCircumference(double radius){
   double circumference = 2*Math.PI*radius;
   double area = Math.PI * Math.pow(radius, 2);

    System.out.println("The Area is: "+area+" and the Circumference is: "+circumference);
    }
}
