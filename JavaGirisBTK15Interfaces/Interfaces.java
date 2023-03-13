package JavaGirisBTK15Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        //ICustomerDal iCustomerDal= new OracleCustomerDal();
        CustomerManager customerManager= new CustomerManager(new OracleCustomerDal() );
        //customerManager.add(); interface new lenemez çünkü içi boş null pointer exception fırlatır
        /*customerManager.customerDal = new OracleCustomerDal();  ilk durum için CustomerManager da kurucu
        yokken geçerli ve gerekli ama artık 2nci durum için ilk satırda parametreyi veriyoruz ,oracle,myswl
        hangi database ise*/
        customerManager.add();

    }

}
