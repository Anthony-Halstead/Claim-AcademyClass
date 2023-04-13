package PhoneBookProject;
import java.util.Scanner;

public class Menu 
{
  Scanner scn = new Scanner(System.in);
  PhoneBook phoneBook = new PhoneBook();
  SearchContact searchContact = new SearchContact();
  public void menuDisplay(Menu activeMenu)
  {
        int choice = 0;
        
    do{
        System.out.println("*************************************************************");
        System.out.println("1. Add new contact");
        System.out.println("2. Remove contact");
        System.out.println("3. Update contacts");
        System.out.println("4. Search contacts");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = scn.nextInt();
        switch(choice)
        {
            case 1:
                phoneBook.addContact();
                break;
            case 2:
                phoneBook.removeContactByPhoneNumber();
                break;
            case 3:
                phoneBook.updateContact();
                break;
            case 4:
                searchContact.findContact(phoneBook, activeMenu);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }while(choice != 5);
  }
}
