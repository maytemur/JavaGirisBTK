package JavaGirisBTK12InheritanceDemo;

public class InheritanceDemo {
    public static void main(String[] args) {
        //InheritanceDemo.OgretmenKrediManager ogretmenKrediManager= new InheritanceDemo.OgretmenKrediManager();
        //ogretmenKrediManager.Hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        //burada hata vermez çünkü referans var istersek tarımda gönderebiliriz
        //basekredi manager öğretmeninde tarımında referansını tutabilir
        //sıklıkla database geçişlerindede kullanılır bir bir proje yaptınız proje mysql,oracle,sqlserver
        //desteklesin istiyorsunuz. Kötü yazımda eğer mysql se şu oracle sa şu kod çalışsın yapılır
        //bu şekilde her biri ayrı yazılarak injection şeklinde yapılabilir ileride anlatılacak

    }
}
