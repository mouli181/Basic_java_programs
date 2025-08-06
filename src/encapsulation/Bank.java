package encapsulation;

public class Bank {
    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withhdraw(int amount){
        if(amount < balance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }

    }


}
