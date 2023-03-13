package JavaGirisBTK10EncapsulationProductMain;

public class Product {
    //attribute | fields da deniyor
    private int id; // normalde default olarak önünde public var yazmasakda
    //private-sadece tanlandığı block da geçerli - süslü parantezlerin arasında
    private String name;
    private String description;
    private double price;
    private int stockmount;
    private String renk;
    private String kod;

    //getter bloğu
    public int getId() {
        return id;
    }

    //setter bloğu
    public void setId(int id) {
        //this.id = id; //buradaki this benim içinde bulunduğum  class demek yani yukarıdaki id
        // ama yerine karışıklığı önlemek için ön ekli olarak kullanıcaz this unutulabilir diye
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockmount() {
        return stockmount;
    }

    public void setStockmount(int stockmount) {
        this.stockmount = stockmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return kod;
    }
    //kod için setter istemiyoruz
    /*public void setKod(String kod) {
        this.kod = kod;
    }*/
    //Yazım prensibi SOLID'in S'si derki "single responsibility princible" bir class sadece 1 iş
    //yapmalı. Yani aşağıdakini aynı Class'a eklersek 1 class hem attribute tutup hemde operasyon
    // içermiş olur bu uygun değil

    /*public void Add(ProductMain.Product product){
        //JDBC ye bağlanıp ürünleri kaydedicex sonra
        System.out.println("Ürün eklendi  "+ product.name);
    }*/
}
