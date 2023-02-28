package Chapters.Chapter10;

import java.util.*;

public class P10_7 {
    public static void main(String[] args) {

        Account accounts[] = new Account[10];


        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }


        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.print("Enter an id: ");
            int id = in.nextInt();

            if (id >= 0 && id <= 10) {
                boolean x = true;
                while (x) {
                    System.out.println("===================================");
                    System.out.println("Main Menu");
                    System.out.println("1: Check Balance");
                    System.out.println("2: Withdraw");
                    System.out.println("3: Deposit");
                    System.out.println("4: Exit");
                    System.out.print("Enter a choice now:");
                    int choice = in.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("The balance is: " + accounts[id].getBalance());
                            break;
                        case 2:
                            System.out.println("Enter an amount to withdraw: ");
                            accounts[id].withdraw(in.nextDouble());
                            break;
                        case 3:
                            System.out.println("Enter an amount to Deposit: ");
                            accounts[id].deposit(in.nextDouble());
                            break;
                        case 4:
                            x = false;

                    }
                    System.out.println("===================================");

                }


            } else {
                System.out.println("Invalid input!");
            }

        }

    }
}


class Account {

    private int id;

    private double balance;

    private double annualInterestRate;

    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;

    }

    public Account(int newId, double newBalance) {

        this.id = newId;
        this.balance = newBalance;
        dateCreated = new Date();
        annualInterestRate = 0;
    }

    public int getID() {

        return id;
    }

    public void setID(int newID) {

        this.id = newID;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double newBalance) {

        this.balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newInterestRate) {

        this.annualInterestRate = newInterestRate;
    }

    public Date getDateCreated() {

        Date startDate = dateCreated;

        return startDate;
    }

    public double getMonthlyInterestRate() {

        double InterestRatePerMonth = (annualInterestRate / 12);

        return InterestRatePerMonth;
    }

    public double getMonthlyInterest() {

        double monthlyInterest = balance * (this.getMonthlyInterestRate() / 100);

        return monthlyInterest;
    }

    public void withdraw(double amount) {

        balance -= amount;
    }

    public void deposit(double amountDeposit) {

        balance += amountDeposit;

    }

    @Override
    public String toString() {

        return "\nAccount ID: " + getID() + "\nBalance: " + getBalance() +
                "\nDate created " + getDateCreated();
    }

}