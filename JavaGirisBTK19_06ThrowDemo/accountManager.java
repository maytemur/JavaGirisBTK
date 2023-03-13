package JavaGirisBTK19_06ThrowDemo;

public class accountManager {
    private double balance;

    public void deposit(double amount) { //para yatırmak -deposit
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficientException {
        if (balance >= amount) {
            balance = getBalance() - amount;
        } else {
           // System.out.println("hesaptan para çakilemedi Bakiye yetersiz");
            //throw new Exception("Bakiye yetersiz"); bunun yerine custom exception da yazabiliriz çok
            //yaygın olarak kullanıyor
            throw new BalanceInsufficientException("Bakiye yok");
        }
    }

    public double getBalance() {
        return balance;
    }
}
