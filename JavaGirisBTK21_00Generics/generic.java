package JavaGirisBTK21_00Generics;

import java.util.ArrayList;

public class generic {
    public static void main(String[] args) {
        ArrayList sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("12"); //default arraylist parametre olarak obje alır hepsini farketmez
        //Generic lere tip güvenli çalışmak için ihtiyaç duyarız
        //arraylist<string> yaparsak generic class olmuş olur

        MyList<String> yeniSehirler = new MyList<>();
        yeniSehirler.add("Van");
        yeniSehirler.add("23"); //ancak string kabul eder

        MyList<musteriListesi> musteriler = new MyList<musteriListesi>();
        musteriListesi yeniMusteri= new musteriListesi();
        yeniMusteri.firstName= "Ahmet";
        yeniMusteri.id=36;
        musteriler.add(yeniMusteri); //generic MyList'ime yeni musteriListesi objesi ekledim
    }
}
