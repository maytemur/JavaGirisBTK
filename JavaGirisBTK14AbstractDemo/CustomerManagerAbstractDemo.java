package JavaGirisBTK14AbstractDemo;

public class CustomerManagerAbstractDemo {
    BaseDatabaseManager databaseManager; //burada hangi database'i verirsek o çalışacak

    public void getCustomers(){
        databaseManager.getData();

    }
}
