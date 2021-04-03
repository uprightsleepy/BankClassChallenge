package academy.learnprogramming;

import java.text.DecimalFormat;

public class Bank {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accNum){
        this.accountNumber = accNum;
    }

    public int getAccountNumber(){
       return this.accountNumber;
    }

    public void setBalance(double accBal){
        this.balance = accBal;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String cusName){
        this.customerName = cusName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String cusEmail){
        this.email = cusEmail;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String cusPhone){
        this.phoneNumber = cusPhone;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(double depositAmount){
        System.out.println("Deposit of $"+ depositAmount + " accepted. New total = $" + (this.balance+= depositAmount));
    }

    public void withdrawFunds(double withdrawalAmount) {

        if(this.balance - withdrawalAmount <= 0 ){
            System.out.println("Only $" + this.balance + " available. Withdrawal not processed.");
        }
        else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining amount = $" + this.balance);
        }
    }
}


