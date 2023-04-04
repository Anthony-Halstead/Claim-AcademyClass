package WeekOne;

import java.util.Scanner;



public class LabOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //1.	Write a method called "max3" that finds the largest of THREE integers.
        System.out.println("type three seperate numbers");
        int numOne = scn.nextInt();
        int numTwo = scn.nextInt();
        int numThree = scn.nextInt(); 
        System.out.println(max3(numOne, numTwo, numThree)+" is the largest number"); 

        //2.	Write a method called "min3" that finds the smallest of THREE Integers. 
        System.out.println("type three seperate numbers");
        numOne = scn.nextInt();
        numTwo = scn.nextInt();
        numThree = scn.nextInt();        
        System.out.println(min3(numOne, numTwo, numThree)+" is the smallest number"); 

        //3.	Write a method called "middle3" that computes the MIDDLE value of THREE integers. 
        //Hint: for the case of three numbers, the middle is the value that is NOT the maximum NOR the minimum, 
        // so add the three values and subtract out the min and max, using the methods you wrote for problems #1 and #2.
        System.out.println("type three seperate numbers");
        numOne = scn.nextInt();
        numTwo = scn.nextInt();
        numThree = scn.nextInt();       
        
        System.out.println(middle3(numOne, numTwo, numThree)+" is the middle number"); 

        //4.	Write a method called "xor" that takes two boolean values (either true or false) and returns a boolean value which is 
        //true if EITHER of the values is true BUT NOT BOTH of them. This is called the "xor" function, or "eXclusive OR" 
        //(where we are excluding the case where both values are true).
        System.out.println("Enter two boolean values");
        boolean checkOne = scn.nextBoolean();
        boolean checkTwo = scn.nextBoolean();

        boolean isChecked = BoolChecker(checkOne, checkTwo);
        System.out.println("This is: "+isChecked);

        //5.	Write a method "isFactor" which takes two integers (k and n) and returns true if ("if and only if") k is a factor of n.
        System.out.println("type two seperate numbers to see if the second number is a factor of the first number");
        int k = scn.nextInt();
        int n = scn.nextInt();
        boolean checkFactor = GetIsFactor(k, n);

        System.out.println("is number a factor?: "+checkFactor);

        //6.	Write a method "isPerfect" which takes an integer and returns true if that integer is a perfect number 
        //Your method MUST call the "isFactor" method you wrote for problem #5.
        System.out.println("type a number to see if the number is a perfect number");
        k = scn.nextInt();
        boolean isNumberPerfect = GetIsPerfect(k);
        
        System.out.println("is number perfect?: "+isNumberPerfect);

        //7.	Write a method "isPrime" which takes an integer and returns true if it is a prime number. 
        //Your method MUST call the "isFactor" method you wrote for problem #5.
        System.out.println("type a number to see if the number is a prime number");
        k = scn.nextInt();
        boolean isNumberPrime = GetIsPrime(k);

        System.out.println("is number Prime?: "+isNumberPrime);
        scn.close();
    }  
    

    private static boolean GetIsPrime(int k) 
    {
        if(k <= 1){
            return false;
        }
       
        for(int i = 2; i <k / 2; i++)
        {
            if(GetIsFactor(k,i))
            {
               return false;
            }
        }return true;
        
    }


    private static boolean GetIsPerfect(int k) 
    {

        int sum = 0;        
        for(int i = 1;i < k;i++)
        {  
            if(GetIsFactor(k, i))
            {
                sum+=i;
            }
        }
        return sum == k;       
    }


    private static boolean GetIsFactor(int n, int k)
    {
       return n % k == 0;               
    }


    private static boolean BoolChecker(boolean checkOne, boolean checkTwo)
    {
        boolean isTrue = true;
        if(checkOne ^ checkTwo == true){
            return isTrue;
        }      
        else
        {
            return isTrue = false;
        }
        
    }


    private static int middle3(int numOne, int numTwo, int numThree)
    {                
        if(numOne != min3(numOne, numTwo, numThree)&& numOne != max3(numOne, numTwo, numThree))
        return numOne;
        else if(numTwo != min3(numOne, numTwo, numThree) && numTwo != max3(numOne, numTwo, numThree))
        return numTwo;
        else
        return numThree;      
    }


    private static int min3(int numOne, int numTwo, int numThree)
    {
        if(numOne < numTwo&&numOne < numThree)
        {
            return numOne;
        }       
        else if(numTwo<numOne && numTwo<numThree)
        {
            return numTwo;
        }        
        else
        {            
            return numThree;  
        }              
    }


    public static int max3(int numOne, int numTwo, int numThree) {
        if(numOne > numTwo&&numOne > numThree)
        {            
            return numOne;
        }       
        else if(numTwo>numOne && numTwo>numThree)
        {            
            return numTwo;
        }        
        else
        {            
            return numThree;  
        }    
 }
} 
    
  
