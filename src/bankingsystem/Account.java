/*
 * Different types of acccounts to open
 */
package bankingsystem;

/**
 *
 * @author haki
 */
public class Account {
    
    private String accountType;
    private int numberOfFreeTransactions;
    private float interestRate;
    
    public Account() {
        
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    void setNumberOfFreeTransactions(int i) {
      numberOfFreeTransactions = i;  // this applicable only to chequing accounts
    }
    
    void setInterestRate(float interest) {
        interestRate = interest;  // this applicable only to saving accounts
    }
    
}
