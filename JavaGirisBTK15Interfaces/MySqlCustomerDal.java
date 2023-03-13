package JavaGirisBTK15Interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository{

    @Override
    public void Add() {
        System.out.println("MySql Eklendi");
    }
}
