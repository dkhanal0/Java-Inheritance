package inheritance;

public abstract class Account{
    private String accountNum;
    private Customer customer;
    private double balance;

  // A constructor that initializes the account number and Customer, and sets the balance to zero.
    public Account( String accountNum, Customer customer, double balance){
        this.accountNum=accountNum;
        this.customer=customer;
        this.balance=0;
    }

    public Account(String s, Customer c1) {

    }

    // getAccountNumber() - Returns a String representing the account number.
    public String getAccountNumber(){
        return accountNum;
    }

  // getCustomer() - Returns a reference to the Customer object associated with this account

    public Customer getCustomer() {
        return customer;
    }

    // getBalance() - Returns the available balance (may be a decimal value)
    public double getBalance(){
        return balance;
    }

}
