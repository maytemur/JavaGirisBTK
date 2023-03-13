package JavaGirisBTK15Interfaces;

public class CustomerManager {
    /*ICustomerDal customerDal;     ilk durum için*/
    private final ICustomerDal customerDal;
    public CustomerManager (ICustomerDal customerDal){
        this.customerDal= customerDal;
    }
    public void add(){
        //iş kodları yazılır
        //OracleCustomerDal oracleCustomerDal= new OracleCustomerDal(); bunu yazarsak bağımlı oluruz
        customerDal.Add();
    }
}
