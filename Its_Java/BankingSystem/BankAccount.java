//
//  BankAccount.java
//  
//
//  Created by Shubham Jana on 31/07/26.
//
package BankingSystem;
public class BankAccount{
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    public void setBalance(double balance){
        if (balance < 0){
            System.out.println("Initial balance conanot be negative!");
            this.balance = 0.0;
        }else{
            this.balance = balance;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder(){
       return accountHolder;
    }
    public BankAccount(String accountHolder, String accountNumber, double balance){
        this.setAccountHolder(accountHolder);
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
    }
    public BankAccount(String accountHolder, String accountNumber) {
            this(accountHolder, accountNumber, 0.0);
        }
    public double deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            
        }else{
            System.out.println("Invalid deposit amount!");
        }
        return balance;
    }
    public double withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds!");
        }else if(amount <= 0){
        System.out.println("Invalid funds (amount should be graater then 0) :(");
        }else{
            balance = balance - amount;
        }
        return balance;
    }
}
