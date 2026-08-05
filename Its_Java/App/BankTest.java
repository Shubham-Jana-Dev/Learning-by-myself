//
//  BankTest.java
//  
//
//  Created by Shubham Jana on 31/07/26.
//
package App;
import BankingSystem.BankAccount;
public class BankTest{
    public static void main(String[] args){
//        double amount = 342200;
            BankAccount account1 = new BankAccount("Shubham Jana","2600Y47247HF",233500.98);

        
        System.out.println("---Account Holder Information---");
        System.out.println("Name: "+account1.getAccountHolder());
        System.out.println("Account Number: "+account1.getAccountNumber());
        System.out.println("Account Balance: "+account1.getBalance());
        


        account1.deposit(100);
        System.out.println("Current balance after depositing "+100+ " is "+account1.getBalance());
        
        account1.withdraw(900);
        System.out.println("Current balance after withdrawing "+900+ " is "+account1.getBalance());

    }
}
