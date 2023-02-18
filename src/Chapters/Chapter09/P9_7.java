package Chapters.Chapter09;
import java.util.*;
public class P9_7 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("balance = " + account.getBalance());
        System.out.println("monthly interest = " + account.getMonthlyInterest());
        System.out.println("account was created on: " + account.getDateCreated());
    }
}
class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    Account() {
        dateCreated = new Date();
    }
    Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterest() {
        return ((annualInterestRate / 100) / 12.0) * balance;
    }
    public void withdraw(double num) {
        balance -= num;
    }
    public void deposit(double num) {
        balance += num;
    }
}

