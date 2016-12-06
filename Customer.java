
/**
 * Customer class to model a customer;
 * 
 * @author Krzysztof Szczuorowski 
 * @version 1.1
 * @since 11/16/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2111241/View
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private String drivingLicense;
    private String address;
    private String phoneNumber;
    
    /**
     * Default Customer constructor; <br>
     * Takes no parameters;<br>
     */
    public Customer()
    {
        this.firstName = "Joe";
        this.lastName = "Blogs";
        this.drivingLicense = "000001";
        this.address = "61 Java Street";
        this.phoneNumber = "555-55-055";
    }
    
    /**
     * Custom constructor for Customer class;<br>
     * @param First Name as String;
     * @param Last Name as String;
     * @param Driving License as String; 
     * @param Address as String;
     * @param Phone Number as String;
     */
    public Customer(String firstName, String lastName, String drivingLicense, 
                    String address, String phoneNumber)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setDrivingLicense(drivingLicense);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }
    
    /**
     * Public method to return First Name;<br>
     * @return returns First Name as String;
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    
    /**
     * Public method to set value of First Name;
     * @param value of First Name as String;
     */
    public void setFirstName(String value)
    {   
        if(value != null && value.length() > 0)
        {
           this.firstName = beautifyName(value);
        }
    }
    
    /**
     * Public method to return value of Last Name;
     * @return returns Last Name as String;
     */
    public String getLastName()
    {
        return this.lastName;
    }
    
    /**
     * Public method to set value of Last Name;
     * @param value of Last Name as String;
     */
    public void setLastName(String value)
    {
        if(value != null && value.length() > 0)
        {
           this.lastName = beautifyName(value); 
        }
    }
    
    /**
     * Public method to get value of address;
     * @return returns value of Address as String;
     */
    public String getAddress()
    {
        return this.address;
    }
    
    /**
     * Public method to set value of Address;
     * @param sets value of Address as String;
     */
    public void setAddress(String value)
    {
        if(value != null && value.length() > 0)
        {
           this.address = value;
        }
    }
    
    /**
     * Public method to return value of Driving License;
     * @return returns value of Driving License as String;
     */
    public String getDrivingLicense()
    {
        return this.drivingLicense;
    }
    
    /**
     * Public method to set value of Driving License;
     * @param value of phone number as String;
     */
    public void setDrivingLicense(String value)
    {
        if(value != null && value.length() > 0)
        {
           this.drivingLicense = value;
        }
    }
    
    /**
     * Public method to get value of Phone Number;
     * @return return value of Phone Number as String;
     */
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    /**
     * Public method to set value of Phone Number;
     * @param value of phone number as String;
     */
    public void setPhoneNumber(String value)
    {
        if(value != null && value.length() > 0)
        {
            this.phoneNumber = value;
        }
    }
    
    /**
     * Public method to print out First Name and Last Name; <br>
     * @return returns first name and last name as String;
     */
    public String fullNameTag()
    {
        return firstName + " " + lastName;
    }
    
    //private methods
    private String beautifyName(String name)
    {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase(); 
    }
}
