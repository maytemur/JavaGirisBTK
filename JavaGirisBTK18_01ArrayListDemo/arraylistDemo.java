package JavaGirisBTK18_01ArrayListDemo;

import java.util.ArrayList;

public class arraylistDemo {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3};
        //sayilar[3]=4;  //index ot of bound hatası firlatır

        //sayilar = new int[4]; // new dediğimiz an ilk dizi elemanları sıfırlanır dizi yeniden tanımlanır
        //bunun yerine dizileri arka planda çalıştıran ve yeni dizi elemanı tanımlandığında diziyi
        //sıfırlamadan ona ekleme yapabilen koleksiyonları kullanıyoruz ArrayList onlardan biri

        //önce diziler vardı sonra arraaylist ler geldi şimdi ise generic yapılar var
        System.out.println(sayilar[0]);

        ArrayList sayilar2 = new ArrayList(); //eleman sayısı belirsiz

        System.out.println(sayilar2.size());

        sayilar2.add(1);
        sayilar2.add(11);
        System.out.println(sayilar2.size());
        sayilar2.add("Ankara"); //integer olur string olur class olur içine herşeyi ekleyebiliriz
        System.out.println(sayilar2.size());
        System.out.println(sayilar2.get(1));
        sayilar2.set(0, 2345);
        System.out.println(sayilar2.get(0));
        sayilar2.remove(1); //diziden eleman silme ekleme dizi eleman sayısını otomatik güncelliyor
        //sayilar2.clear(); void birşey döndürmez yani bütün dizi elemanlarını siler
        for(Object i:sayilar){
            System.out.println(i);
        }
    }
}
