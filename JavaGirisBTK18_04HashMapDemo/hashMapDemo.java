package JavaGirisBTK18_04HashMapDemo;

import java.util.HashMap;

public class hashMapDemo { //yapısal anlamda sözlüklere benzetebilirz bazı dillerde dictionary olarak geçer
    //çok kullanılmasada kullanıldığı yerler var bir ingilizce-sozluk yapalım
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        //sozluk.clear(); komple siler
        //sozluk.remove("table");
        System.out.println(sozluk);
        for (String eleman: sozluk.keySet()){ //sıralı değil pc kendine göre sıralıyor
            System.out.println("\n"+eleman);
            System.out.println("Eleman(Key) ->"+eleman+"\nDeğeri(Value)-> "+sozluk.get(eleman));//bu şekilde
            //değerlerini de alabiliriz
            //sozlük vari yapılarda bunu kullanabiliriz illa string-string olmak zorunda değil string-int
            //int-int vs olabilir
        }
    }
}
