package JavaGirisBTK08Methodlar;

public class JavaGirisBTK08Methodlar {
    public static void main(String[] args) {
        String mesaj= "Bugün hava güzel";
        String yeniMesaj= sehirVer();
        System.out.println(yeniMesaj);
        int sayiTopla= topla(34,6);
        System.out.println(sayiTopla);
        int toplamDizi= topla2(3,5,4,23,3,21,32);   //collections ve nesnel yapılar tercih ediliyor
                                                           //ama variablearguments de çok kullnılıyor
        System.out.println(toplamDizi);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static String sehirVer(){
        return "Istanbul";
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static void guncelle(){
        System.out.println("Guncellendi");
    }
    public static int topla2(int... sayilar){  //... ya variable argument deniyor sayıları arka
                                                // planda bunu diziye çeviriyor
        int toplamDizi=0;
        for(int sayi: sayilar){
            toplamDizi+=sayi;
        }
        return toplamDizi;
    }
}
