package JavaGirisBTK10EncapsulationProductMain;

public class ProductManager {
    public void Add(Product product){
        //JDBC ye bağlanıp ürünleri kaydedicez sonra
        System.out.println("Ürün eklendi  "+ product.getName());
    }
    public void Add2 (int id,String name,String description,int stockmount,double price){

    }
}
