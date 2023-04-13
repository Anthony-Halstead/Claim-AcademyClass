package PhoneBookProject;

public class Person{
    private String firstName;
    private String lastName;
    private String fullName;
    private Address address;
    private long phoneNumber;

    

    public Person(String firstName, String lastName, Address address, long phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName() {
        fullName = firstName+ " " + lastName;
        return fullName;
    }
    public String getStateName(){
        return address.getState();
    }
    public String getAddress() {
        return address.getHouseNumber()+" "+address.getStreetName()+", "+address.getCity()+", "+address.getState()+", "+address.getZipCode();
    }
    public Long getPhoneNumber() {    
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }   
    
}
