package JavaGirisBTK21_02RepositoryDemo;

public class repositoryDemo {   //repository design pattern
    public static void main(String[] args) {
        //repository design genelde veritabanı işlemlerinde kullanılır
        Onaylayici onaylayici= new Onaylayici();
        Musteri onaylanacakMusteri= new Musteri();
        onaylayici.onayla(onaylanacakMusteri);
    }
}
