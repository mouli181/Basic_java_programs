package Encapsulationex;

public class Account {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBalance(5000);
        System.out.println("Balance is "+b.getBalance());
        b.deposit(2000);
        System.out.println(b.getBalance());
    }
}
