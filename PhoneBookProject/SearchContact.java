package PhoneBookProject;
import java.util.Scanner;

public class SearchContact {

    Scanner scn = new Scanner(System.in);
    int choice; 

    public void findContact(PhoneBook phoneBook, Menu activeMenu)
 {     choice = 0;
       while(choice != 6){
        System.out.println("*************************************************************");
        System.out.println("Follow the instructions below to search for a contact");
        System.out.println("1. Search by first name");
        System.out.println("2. Search by last name");
        System.out.println("3. Search by full name");
        System.out.println("4. Search by phone number");
        System.out.println("5. Search by state");
        System.out.println("6. Back to main menu");
        choice = scn.nextInt();
        switch(choice)
        {
            case 1:
                phoneBook.searchByFirstName();
                System.out.println("*************************************************************");
                break;
            case 2:
                phoneBook.searchByLastName();
                System.out.println("*************************************************************");
                break;
            case 3:      
                phoneBook.searchByFullName();
                System.out.println("*************************************************************");
                break;
            case 4: 
                phoneBook.searchByPhoneNumber();  
                System.out.println("*************************************************************");   
                break;
            case 5: 
                phoneBook.searchByState();     
                System.out.println("*************************************************************");
                break;
            case 6: 
                activeMenu.menuDisplay(activeMenu);  
                System.out.println("*************************************************************");   
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    return;
 }
}

