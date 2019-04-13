/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.app.bank;

/**
 *
 * @author STUDENT
 */
public class BankAccount {
    
    String accountName;
    String accountNumber;
    double balance;
    
    
    BankAccount(String accountName,String accountNumber,double balance)
    {
        this.accountName =accountName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    
    void displayValues()
    {
        System.out.println("Account Name" + accountName);
        System.out.println("Account Number" + accountNumber);
        System.out.println("Account Balance" + balance);
    }
    
    void deposit(double amount)
    {
        balance= balance + amount;
    }
    
    void withdraw(double amount)
    {
        balance= balance - amount;
    }
    
    void balanceInquiry()
    {
       System.out.println("Account Balance" + balance);
    }
}
