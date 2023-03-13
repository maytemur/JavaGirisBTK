package JavaGirisBTK10EncapsulationProductMain;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("Asus laptop");
        product.setPrice(5000);
        product.setId(1);
        product.setStockmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

//        System.out.println(product.name);
        //hatalı kullanım bir değişiklik için bütün ekranları hepsini değiştirmek gerekecek
/*        productManager.Add2(2, "asus", "monitör", 3, 2450);//1nci elran
        productManager.Add2(2, "asus", "monitör", 3, 2450);//2nci ekran
        productManager.Add2(2, "asus", "monitör", 3, 2450);//3ncü ekran
        productManager.Add2(2, "asus", "monitör", 3, 2450);//4ncü ekran
        productManager.Add2(2, "asus", "monitör", 3, 2450);//5nci ekran*/

    }
}
