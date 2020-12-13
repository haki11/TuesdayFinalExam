/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

/**
 *
 * @author haki
 */
public class Customer {

    private final String name;
    private final String address;
    private final int SIN;
    private final String accountType;

    public Customer(String name, String address, int SIN, String accoutType) {
        this.name = name;
        this.address = address;
        this.SIN = SIN;
        this.accountType = accoutType;
    }

    public void openAccount(String customerType) {
        if (customerType.equals("Chequing")) {
            Account account = new Account();
            account.setNumberOfFreeTransactions(4);
            account.setAccountType(customerType);
           
        } else {
            Account account = new Account();
            account.setInterestRate(2.50f);
             account.setAccountType(customerType);
        }
        
    }
    
    public String getAccount() {
        return accountType;
    }
    
     public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSIN() {
        return SIN;
    }
}
