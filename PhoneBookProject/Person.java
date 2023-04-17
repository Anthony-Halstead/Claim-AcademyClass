package PhoneBookProject;

public class Person{
    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;
    private Address address;
    private long phoneNumber;

    

    public Person(String firstName, String middleName, String lastName, Address address, long phoneNumber)
    {
        this.firstName = firstName;
        this.middleName = middleName;
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
    public String getMiddleName() {
        return middleName;
    }   
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName() {
        fullName = firstName+ " " +middleName+ " " +lastName;
        return fullName;
    }
    public String getStateName(){
        return address.getState();
    }
    public String getAddress() {
        return address.getHouseNumber()+" "+address.getStreetName()+", "+address.getCity()+", "+address.getState()+", "+address.getZipCode();
    }
    public String getPhoneNumber() { 
        String phoneNumber = String.valueOf(this.phoneNumber);
        //print phone number formatted like a phone number
        if(phoneNumber.length() == 10){
            phoneNumber = "("+phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10);
        }    
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }   
    
}
