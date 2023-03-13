package JavaGirisBTK14AbstractDemo;

public class AbstractDemo {
    public static void main(String[] args) {
        CustomerManagerAbstractDemo customerManagerAbstractDemo= new CustomerManagerAbstractDemo();
        customerManagerAbstractDemo.databaseManager= new MySqlDatabaseManager(); //burada stratejiyi
        //çalışacağımız databasi bildiriyoruz
        customerManagerAbstractDemo.getCustomers();
        //solid- o harfinin anlamı open close açık ve kapalılık prensibi-bir sisteme yeni bir özellik
        //getirildiğinde mevcuttaki kodu değiştiremezsin değiştiriyorsan sıkıntı var demektir
    }
}
