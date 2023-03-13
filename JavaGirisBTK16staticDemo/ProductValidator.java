package JavaGirisBTK16staticDemo;

public class ProductValidator { // javada ana classın staik olmasına izin verilmiyor inner class olarak
                                // olabilir. C# ana class da statik olabilir
    public ProductValidator() {
        System.out.println("yapıcı(constructor) blok çalıştı");
    }
    static { //statik blok statik isvalid class'ı çağrıldığında çalışır burada eğer yapıcı(constructor)
        //class yazmış olsaydık o ancak new'lediğimizde çalışır statik çağrıldığında çalışmaz
        //c# ise yapıcı blok statik tede çalışır parametresiz olarak
        System.out.println("statik blok çalıştı");
    }
    public static boolean isValid(Product product){ //statik ifadesi
        return product.price > 0 && !product.name.isEmpty();
    }
    public void birsey(){

    }
  /*  public static class BaskaBirClass{    //inner class
        public static void Sil(){

        }
    }
*/
}
