package BankManager;

public class BankAccount {

    double account,balance;

    public BankAccount(){ };


    public BankAccount (int account,int balance){
        this.account=account;
        this.balance=balance;

    }
    public String toString(){
        return ("Account Number "+account+"Account Balance "+balance);

    }

}
