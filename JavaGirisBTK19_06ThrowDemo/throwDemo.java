package JavaGirisBTK19_06ThrowDemo;

public class throwDemo {
    public static void main(String[] args) {
        accountManager hesap = new accountManager();
        System.out.println(hesap.getBalance());
        hesap.deposit(1200);
        System.out.println(hesap.getBalance());
        try {
            hesap.withdraw(234);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(hesap.getBalance());
        hesap.deposit(25);
        System.out.println(hesap.getBalance());
        try {
            hesap.withdraw(3500); //burada parayı vermeyip hata vermesi gerekiyor
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(hesap.getBalance());
    }
}
