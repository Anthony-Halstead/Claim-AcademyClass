package WeekTwo;

import java.util.Arrays;

public class LabFive 
{    
    public static void main(String[] args) 
    {
        char[] ogCharArray = {'a','a',' ','r','o','n'};
       
        //1. Write a method to count the number of occurrences of the letter ‘a’ in a char array?
        charCount(ogCharArray);
        
        //2. Write a method to remove all white spaces from a char array?
        removeWhiteSpace(ogCharArray);
        
        //3. Write a method to find duplicate characters in a char array?
        findDuplicates(ogCharArray);
        
        //4. Write a method to display the words in reverse order.  “How are you” should be displayed “you are How”
        reverseWords(ogCharArray);
    }
    private static void reverseWords(char[] ogCharArray) {
        String result = "";
       
        for (int i = ogCharArray.length - 1; i >= 0; i--) {
            result += ogCharArray[i];
        } 
        System.out.println(result);
    }
    private static void findDuplicates(char[] ogCharArray) 
    {
        int[] charCount = new int[256];
        for (int i = 0; i < ogCharArray.length; i++) {
            charCount[ogCharArray[i]]++;
        }

        String result = "";
       
        for (int i = 0; i < ogCharArray.length; i++) {
            if (charCount[ogCharArray[i]] != 1) {
                result += ogCharArray[i];
            }
        } 
        System.out.println(result);  
    
    }
    public static void charCount(char[] array)
    {
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 'a')
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void removeWhiteSpace(char[] array)
    {
        char[] newArray = new char[5];
        char ch = ' ';
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {         
            if(array[i]!=' ')
            {
                ch = array[i];
                newArray[count] = ch;
                count++;
            }                      
        }
        System.out.println(Arrays.toString(newArray));
    }
}