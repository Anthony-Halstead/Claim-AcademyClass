package WeekOne;

import java.util.Scanner;

public class LabThree 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);       
        int choice;
       //Bonus: Make a big, beautiful Menu, using a Switch Case and a Do While or a While loop that will allow a user 
       //to access each method, depending on the number selected. Allow for the program to repeat and quit when requested. 
       do{
         
       System.out.println("enter the following numbers to access each method:");
       System.out.println("removeCharacter = 0");
       System.out.println("removeDuplicate = 1");
       System.out.println("getVowelsAndConsonants = 2");
       System.out.println("diaplayNonRepeatedFirst = 3");
       System.out.println("exit = 4");
            
        choice = scan.nextInt();          
          switch(choice){
            case 0:
                //1. Write a method to remove a given character from a string.
                // E.g. remove all 'Aa' from Average should return verge (core logic only, no .replace or .replaceAll)
                // System.out.println("Your new word is: "+ GetRemoveLetter(removeLetters));        
                String input = "Average";
                char ch = 'a';
                char secondCh = 'A';
                String output = RemoveCharacter(input, ch, secondCh);
                System.out.println("Your new word is: " + output);  
                break;
            case 1:            
                //2. Write a method to remove duplicate characters from a string.
                String word = "Hello";
                String newWord = RemoveDuplicate(word);
                System.out.println("Your new word is: " + newWord);  
                break;
            case 2:
                //3. Write a method to count the number 
                //of vowels and consonants in a string. E.g. if the input is Java the result should be 2 vowels and 2 consonants .
                word = "Java";
                GetVowelsAndConsonants(word);
                break;
            case 3:           
                //4. Write a method to display first non repeated character 
                //of a string then the repeating characters. E.g. input morning should display morignn.
                input = "morning";
                output = displayNonRepeatedFirst(input);
                System.out.println(output);
                break;
            case 4: 
                System.out.println("Thank you for coming");              
                break;
            default:
                System.out.println("Invalid input");
          
          }
       }while(choice != 4);
       
       scan.close(); 
    }

    public static String displayNonRepeatedFirst(String input) {

        int[] charCount = new int[256];
        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i)]++;
        }

        String nonRepeated = "";
        String repeated = "";
        for (int i = 0; i < input.length(); i++) {
            if (charCount[input.charAt(i)] == 1) {
                nonRepeated += input.charAt(i);
            } else {
                repeated += input.charAt(i);
            }
        }

        return nonRepeated + repeated;
    }


    private static void GetVowelsAndConsonants(String word) 
    {       
        int vowels = 0;
        int cons = 0;
          for(int i = 0;i<word.length();i++)
          {
             if(word.charAt(i) == 'a'||word.charAt(i) == 'e'||word.charAt(i) == 'i'||word.charAt(i) == 'o'||word.charAt(i) == 'u'){
                vowels++;
             }
             else 
            cons++;             
          }
          System.out.println("number of vowels: "+vowels+" number of consonants: "+cons);      
    }

    private static String RemoveDuplicate(String word) 
    {      
            String result = "";
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (result.indexOf(c) < 0) {
                    result += c;
                }
            }
            return result;        
    }

    public static String RemoveCharacter(String str, char ch, char secondCh) 
    {
        char[] charArray = str.toCharArray();
        int index = 0;
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] != ch && charArray[i] != secondCh) 
            {
                charArray[index] = charArray[i];
                index++;
            }
        }
        return new String(charArray, 0, index);
    }   
}
