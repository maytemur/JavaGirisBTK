package JavaGirisBTK16staticDemo;

public class ProductManager {
    public void add(Product product) {
        //ProductValidator validator = new ProductValidator();
        //statik olarak yazıp utulity olarak kullanabiliyoruz yani nokta diyince çıkıyor herkes erişebiliyor
        //new denildiğinde kullanıldıktan sonra hafızadan siliniyor ama statik dendiğinde uygulama
        //sıfırlanana kadar hafızada kalıyor.
        //Kısaca statikler direkt class ismi ile çağrılır ve çağrıldığında da bellekde oluşturulur
        //if (validator.isValid(product)) {  bu satırada gerek kalmadı
        if(ProductValidator.isValid(product)) {
            System.out.println("veritabanı kodu burda çalıştı eklendi");
        }else {
            System.out.println("Eklenemedi geçersiz ürün bilgisi");
        }
        //ProductValidator productValidator= new ProductValidator();  yapıcı bloğu çalıştırmak için
        //productValidator.birsey();
    }

}
