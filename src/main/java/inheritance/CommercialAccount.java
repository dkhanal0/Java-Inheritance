package inheritance;

public class  CommercialAccount extends Account {

    private String taxIdNum;


    public CommercialAccount(String accountNum, Customer customer, double balance, String taxIdNum) {
        super(accountNum, customer, balance);
        this.taxIdNum = taxIdNum;

    }
  // getTaxId
    public String getTaxId(){
        return taxIdNum;
    }

}
