package JavaGirisBTK21_02RepositoryDemo;

public class UrunDal implements IEntityRepository<Urun>{

    @Override
    public void add(Urun entity) {

    }

    @Override
    public void delete(Urun entity) {

    }

    @Override
    public void update(Urun entity) {

    }
}
//Generic Constrains - generic kısıtlaması- örneğin buraya sadece veritabanı nesnesi gelsin !
//bunu bir başka interface yaratarak ve urun ile musteriyi vs hangi class'ı istiyorsak ondan implement ederek
//ona bağımlı hale getirerek yapıyoruz
//IEntity- database nesnesi ve urun , musteri ondan implement eder diyoruz interface'in gruplama özelliğinden
//yararlanmış oluyoruz
