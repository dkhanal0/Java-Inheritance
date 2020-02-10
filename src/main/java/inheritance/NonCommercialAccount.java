package inheritance;

public class NonCommercialAccount extends Account{


    public NonCommercialAccount(String accountNum, Customer customer, double balance) {
        super(accountNum, customer, balance);
    }
}
