package WeekOne;

import java.util.Scanner;

public class Test{
public static void main(String[] args)
{
  Scanner scanner = new Scanner(System.in);
  System.out.println("Hello World");
//1.	Write a method to prompt the user to enter the radius of the circle then calculate the area and circumference of the circle.
   
System.out.println("Type in a radius that is a decimal or whole number");
  
  double radius = scanner.nextDouble();
  getAreaAndCircumference(radius);

  //2. Write a method to prompt the user for base-width and height of a triangle, then calculate the area of the Triangle.
System.out.println("Type in a width that is a decimal or whole number");
double width = scanner.nextDouble();
System.out.println("Type in a height that is a decimal or whole number");
double height = scanner.nextDouble();
getAreaOfTriangle(width, height);

//3. Write a method to prompt the user for a number then display check if the number is Even or Odd.
System.out.println("Type in a whole number to determine if it is even or odd");
int number = scanner.nextInt();
getEvenOrOdd(number);

//4. Write a method to prompt the user for an Integer then display the same value with 
//one decimal place. eg user enter "15 " result is: "You entered 15, the new value is 15.0".
System.out.println("Type in a whole number and i will send it back with a decimal");
int wholeNumber = scanner.nextInt();
getDecimalNumber(wholeNumber);

//5. Write a method to prompt the user for a letter of the alphabet and display it's ascii value.
System.out.println("Type in a letter and i will send it back as an ascii value");
char letterToChange = scanner.next().charAt(0);
getAsciiValue(letterToChange);

//6. Write a method to prompt the user for a double then display the value as a whole number. 
//eg user enter "15 .8" result is: "You entered 15.8, the new value is 16". eg user enter "15 .4" result is: 
//"You entered 15.4, the new value is 15".
System.out.println("Enter a number with a decimal and i will give you a rounded whole number back");
double numberToConvert = scanner.nextDouble();
getWholeNumber(numberToConvert);

//7. Write a method to prompt the user for 4 digits representing a year. Then determine If Year Is a Leap Year.
System.out.println("Enter a four digit number representing a year and I will will let you know if it is a leap year");
int yearToCheck = scanner.nextInt();
getLeapYearCheck(yearToCheck);

scanner.close();
}
private static void getLeapYearCheck(int yearToCheck) 
{
  if(yearToCheck % 400 != 0||yearToCheck % 4 != 0||(yearToCheck % 100 != 0 && yearToCheck % 400 != 0))
  {
    System.out.println(yearToCheck+" Is not a Leap Year");
    
  }   
  else
  System.out.println(yearToCheck+" Is a Leap Year");
}
private static void getWholeNumber(double numberToConvert) 
{
   int wholeNumber = (int)Math.round(numberToConvert);
   System.out.println("Your whole number is "+ wholeNumber);
}
public static void getAreaAndCircumference(double radius)
 {
   double circumference = 2*Math.PI*radius;
   double area = Math.PI * Math.pow(radius, 2);

   System.out.println("The Area is: "+area+" and the Circumference is: "+circumference);
 }

public static void getAreaOfTriangle(double width, double height)
{
        double area = 0.5*width*height;

        System.out.println("The area of the triangle is: "+ area);
}
public static void getEvenOrOdd(int number)
{
        if(number%2 == 0)
        System.out.println("number is even");              
        else
        System.out.println("number is odd");
}
public static void getDecimalNumber(int wholeNumber)
{
  float wholeToDecimalNumber = (float)wholeNumber;

  System.out.println("Your new number with a decimal is: "+ wholeToDecimalNumber);
}

public static void getAsciiValue(char letterToChange)
{
   int asciiValue = (int)letterToChange;
   System.out.println("The ASCII value is: "+ asciiValue);
}
}
