package encapsulation;

public class Account {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBalance(2000);
        System.out.println("Your balance is : "+b.getBalance());

        b.deposit(3000);
        System.out.println("Your balance is : "+b.getBalance());

        b.withhdraw(4000);
        System.out.println("Your balance is : "+b.getBalance());
    }
}
