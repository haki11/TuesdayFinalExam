package bankingsystem;

import java.util.ArrayList;

/**
 * Design of the banking system for customer to open an account
 * 
 * @author Haki
 */
public class BankingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Create a list of customers
        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer("John Smith", "500 King St", 123456, "Chequing");
        Customer c2 = new Customer("Nancy Peso", "700 Young St", 789011, " Saving");
        
        customers.add(c1);
        customers.add(c2);
        
        Account account = new Account();
        
        // print the two customers information
        
  
    }

}
