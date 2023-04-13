package WeekTwo;

import java.util.Scanner;

public class LabFour {
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);

    //Given 2 non-negative ints, a and b, return their sum, 
    //so long as the sum has the same number of digits as a. If 
    //the sum has more digits than a, just return a without b. 
    System.out.println("Enter two integers");
    int a;
    int b;
    a = scan.nextInt();
    b = scan.nextInt();
    System.out.println(sumLimit(a,b));

    //The squirrels in Palo Alto spend most of the day playing. 
    //In particular, they play if the temperature is between 60 and 90 (inclusive). 
    //Unless it is summer, then the upper limit is 100 instead of 90. 
    //Given an int temperature and a boolean isSummer, 
    //return true if the squirrels play and false otherwise.
    System.out.println("Enter an integer and a boolean value");
    int temp = scan.nextInt();
    boolean isSummer = scan.nextBoolean();

    System.out.println("Do the squirells play?: "+ tempCheck(temp, isSummer));
    
    //You have a green lottery ticket, with ints a, b, and c on it. 
    //If the numbers are all different from each other, the result is 0. 
    //If all of the numbers are the same, the result is 20. 
    //If two of the numbers are the same, the result is 10.    
    System.out.println("Enter three integers");
    a = scan.nextInt();
    b = scan.nextInt();
    int c = scan.nextInt();
    System.out.println("The ticket result is: "+checkTicket(a,b,c));

    //Count the number of "xx" in the given string. 
    //We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    System.out.println("Enter a word");

    String xCount = scan.next();
    System.out.println("Number of xx's: "+ xxCount(xCount));

    //Given a string and a non-negative int n, 
    //return a larger string that is n copies of the original string.
    System.out.println("Enter an integer and a word");
    int num = scan.nextInt();
    String word = scan.next();

    System.out.println("Your new word is: "+wordDuplicator(num, word));

    scan.close();
    }


    private static String wordDuplicator(int num, String word) 
    {
        String newWord= "";
        for(int i = num; i>0; i--)
        {
            newWord+=word;
        }
        return newWord;
    }
    private static int xxCount(String xCount) 
    {
        int result = 0;
        String xWord = addXToString(xCount);
        for(int i = 0; i < xWord.length(); i++)
        {
            if(i >= 1)
            result++;
        }
        return result;
    }
    private static String addXToString(String xCount)
    {
        String allX = "";
        char x = 'x';
        for(int i = 0; i < xCount.length(); i++)
         {
            if(x == xCount.charAt(i))
            {
                allX+=x;
            }
         }
        return allX;
    }

    private static int checkTicket(int a, int b, int c)
    {
       int result = 0;

           if(a!=b&&a!=c&&c!=b)
           {
            result = 0;
            return result;
           }
           else if(a==b&&a==c&&c==b)
           {
            result = 20;
            return result;
           }
           else 
           result = 10;
        return result;
    }


    public static int sumLimit(int a, int b)
    {
        int sum = 0;
        sum = a+b;
        String aString = Integer.toString(a);
        String sumString = Integer.toString(sum);
        if(aString.length()<sumString.length())
        {
            return a;
        }else
        return sum;
    }

    public static boolean tempCheck(int temp, boolean isSummer)
    {
       boolean play =false;
       int tempCeiling = 90;
       if(isSummer == true )
       {
        tempCeiling = 100;
       }
       if(temp<tempCeiling&&temp>60)
       {
        play = true;
        return play;
       }
       else 
       return play;
    }
}
