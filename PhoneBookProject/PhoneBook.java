package PhoneBookProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PhoneBook{
    
    Scanner scn = new Scanner(System.in);
    List<Person> contacts = new ArrayList<Person>();


    public void searchByFirstName()
    {    
        System.out.println("To search for a person by first name follow the following instructions ");        
        System.out.println("Enter first name: ");
        String firstName = scn.next();
        for(Person person : contacts)
        {
            if(person.getFirstName().equals(firstName))
            {
                System.out.println("*************************************************************");
                System.out.println(person.getFullName()+", "+person.getAddress()+", "+person.getPhoneNumber());
            }
        }       
    }
    public void searchByLastName()
    {
        System.out.println("To search for a person by last name follow the following instructions ");        
        System.out.println("Enter last name: ");
        String lastName = scn.next();
        for(Person person : contacts)
        {
            if(person.getLastName().equals(lastName))
            {
                System.out.println("*************************************************************");
                System.out.println(person.getFullName()+", "+person.getAddress()+", "+person.getPhoneNumber());
            }
        }   
    }
    public void searchByFullName() 
    {
        System.out.println("To search for a person by full name follow the following instructions ");        
        System.out.println("Enter full name: ");
        String fullName = scn.nextLine();
        for(Person person : contacts)
        {
            if(person.getFullName().equals(fullName))
            {
                System.out.println("*************************************************************");
                System.out.println(person.getFullName()+", "+person.getAddress()+", "+person.getPhoneNumber());
            }
        }
    }

    public void searchByPhoneNumber()
    {
        System.out.println("To search for a person by phone number follow the following instructions ");        
        System.out.println("Enter phone number: ");
        long phoneNumber = scn.nextLong();
        for(Person person : contacts)
        {
            if(person.getPhoneNumber().equals(phoneNumber))
            {
                System.out.println("*************************************************************");
                System.out.println(person.getFullName()+", "+person.getAddress()+", "+person.getPhoneNumber());
            }
        }   
    }

    public void searchByState()
    {
        System.out.println("To search for a person by state follow the following instructions");        
        System.out.println("Enter state using its abbreviation: ");
        String state = scn.next();
        for(Person person : contacts)
        {   
            if(person.getStateName().equals(state))
            {
                System.out.println("*************************************************************");
                System.out.println(person.getFullName()+", "+person.getAddress()+", "+person.getPhoneNumber());
            }
        }
    }  

    public void addContact()
    {
        System.out.println("*************************************************************");
        System.out.println("To add a contact to the phone book follow the following instructions ");        
        System.out.println("Create an address to assign to the contact first");
        System.out.println("enter the house number: ");
        int houseNumber = scn.nextInt();
        System.out.println("enter the street name: ");
        String streetName = scn.next();
        System.out.println("enter the city: ");
        String city = scn.next();
        System.out.println("enter the state: ");
        String state = scn.next();
        System.out.println("enter the zip code: ");
        int zipCode = scn.nextInt();
        Address address = new Address(houseNumber, streetName, city, state, zipCode);
        System.out.println("Enter first name: ");
        String firstName = scn.next();
        System.out.println("Enter last name: ");
        String lastName = scn.next();
        System.out.println("Enter phone number: ");
        long phoneNumber = scn.nextLong();
        Person person = new Person(firstName, lastName, address, phoneNumber);   
        contacts.add(person);
        sortPerson(contacts);  
    }
       
        private static void sortPerson(List<Person> contacts) {
            // Sort the list in ASCII order based on full name
            contacts.sort((p1, p2) -> p1.getFullName().compareTo(p2.getFullName()));
        }
    
    
    public void removeContactByPhoneNumber()
    {
        Person personToRemove;
        System.out.println("To remove a contact you must enter the persons phone number ");        
        System.out.println("Enter phone number: ");
        personToRemove = searchList();
        System.out.println("Are you sure you want to remove this person?");
        System.out.println("Y/N:");
        String answer = scn.next();
        if(answer.equals("Y"))
            {
                contacts.remove(personToRemove);
                sortPerson(contacts);
            }
      
    }

    public Person searchList()
    {   Person noPerson = null;
        for(Person person : contacts)
        {   long phoneNumber = scn.nextLong();
            if(person.getPhoneNumber().equals(phoneNumber))
            {
                System.out.println("*************************************************************");
                System.out.println(person.getFullName()+", "+person.getAddress()+", "+person.getPhoneNumber());
                return person;
            }
        }   return noPerson;
    }
    public void updateContact() 
    {
        System.out.println("To update a contact you must enter the persons phone number ");        
        System.out.println("Enter phone number: ");
        long phoneNumber = scn.nextLong();
        for(Person person : contacts)
        {
            if(person.getPhoneNumber().equals(phoneNumber))
            {
                System.out.println("*************************************************************");
                System.out.println(person.getFullName()+", "+person.getAddress()+", "+person.getPhoneNumber());
                System.out.println("To update a contact in the phone book follow the following instructions ");        
                System.out.println("Create a new address to assign to the contact");
                System.out.println("enter the new house number: ");
                int houseNumber = scn.nextInt();
                System.out.println("enter the new street name: ");
                String streetName = scn.next();
                System.out.println("enter the new city: ");
                String city = scn.next();
                System.out.println("enter the new state: ");
                String state = scn.next();
                System.out.println("enter the new zip code: ");
                int zipCode = scn.nextInt();
                Address address = new Address(houseNumber, streetName, city, state, zipCode);
                System.out.println("Enter new first name: ");
                String firstName = scn.next();
                System.out.println("Enter new last name: ");
                String lastName = scn.next();
                System.out.println("Enter new phone number: ");
                long newPhoneNumber = scn.nextLong();
                Person newPerson = new Person(firstName, lastName, address, newPhoneNumber);                 
                contacts.set(contacts.indexOf(person), newPerson);
                sortPerson(contacts);
            }
        }

    }
      
}
