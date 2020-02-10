package inheritance;

public class  CommercialAccount extends Account {

    private String taxIdNum;


    public CommercialAccount(String accountNum, Customer customer, double balance) {
        super(accountNum, customer, balance);

    }

    // Constructor
    public void CommercialAccount(String  taxIdNum) {
        this.taxIdNum = taxIdNum;
    }

  // getTaxId
    public String getTaxId(){
        return taxIdNum;
    }

}
