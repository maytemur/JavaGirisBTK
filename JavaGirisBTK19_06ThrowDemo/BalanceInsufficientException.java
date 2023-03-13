package JavaGirisBTK19_06ThrowDemo;
public class BalanceInsufficientException extends Exception {
    String mesaj;
    public BalanceInsufficientException (String mesaj) {
        this.mesaj= mesaj;
    }
    @Override
    public String getMessage() {
        return this.mesaj;
    }
}
