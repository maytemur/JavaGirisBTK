package JavaGirisBTK15Interfaces;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void Add() {
        System.out.println("Oracle veri tabanına eklendi");
    }
}
