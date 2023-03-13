package JavaGirisBTK16staticDemo;

public class staticDemo { //buna dışarıdan hiç bir şekilde new leyerek ulaşamayız onun yerine
    //main.main diyerek ulaşabiliriz
    public static void main(String[] args) {
        ProductManager manager= new ProductManager();
        Product product= new Product();
        product.price =10;
        product.name= "mouse";

        manager.add(product);

/*        DatabaseHelper.Connection.createConnection(); //inner class larla ilgili bir kullanım
        DatabaseHelper.Crud.Delete();*/
        // solid in single için çok uygun olmadığından pek kullanılmıyor
        //bu yüzden crud ve connection'ı ayrı class larda yazmak daha mantıklı


    }
}
