package JavaGirisBTK19_00ExceptionHandling;
//referans için exception resmine bak
//checked exceptionlar da IO,SQL,AWT,Interrupted kullanıcaya handle etmesi için uyarı verilmesi gerekiyor
public class exceptionHandling {
    public static void main(String[] args) {
        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[5]);
            //exception lar bir üstünden implement ediyor hiyerarşi şeklinde
            //error ler ise hata olarak engellenemiyor ve oluşuyor doğal olarak

        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
            //System.out.println("hata var");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("Loglandı: "+exception);
        } finally {
            System.out.println("\ntry catch haricinde her durumda burası çalışır");
            //örneğin veri tabanına bağlandık ve hata oluştu ama her durumda bu bağlantıyı kapatmamız gerekir
            //aynı şey dosyalar içinde geçerli-kapatmak gerekli ki hafızada durmasın
        }
    }
}
