package JavaGirisBTK13PolymorphismDemo;

public class PolymorphismDemo {
    public static void main(String[] args) {
        EmailLogger emailLogger= new EmailLogger();
        emailLogger.Log("Email log mesajı");
        BaseLogger[] loglama = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger()};
        for(BaseLogger loglar:loglama){
            loglar.Log("Log mesajıııı");
        }
    }
}
