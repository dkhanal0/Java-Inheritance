package inheritance;

public class Customer {
    private String lName;
    private String fName;
    private String address;
    private String zipCode;
    private Account a;

    // A constructor that initializes the last name, first name, address, and zip code.
public Customer(String lName, String fName, String address, String zipCode){
    this.lName=lName;
    this.fName=fName;
    this.address=address;
    this.zipCode=zipCode;
}
  // getLastName() - Returns a String that is the customer’s last name
    public String getLastName(){
    return lName;
    }

  // getFirstName() - Returns a String that is the customer’s first name
    public String getFirstName(){
    return fName;
    }

  // getStreetAddress() - Returns a String indicating the customer’s street address
    public String getStreetAddress(){
    return address;
    }

  // getZipCode() - Returns a String indicating the customer’s zip code
    public String getZipCode(){
    return zipCode;
    }
  // setAccount(Account a) - Sets the Account for this customer
    public void setAccount(Account a){
    this.a=a;
    }

  // getAccount() - Returns a reference to the Account object associated with this customer
   public Account getAccount(){
    return this.a;
   }
}
