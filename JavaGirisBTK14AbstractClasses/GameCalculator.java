package JavaGirisBTK14AbstractClasses;

public abstract class GameCalculator {
    public abstract void hesapla();  //bu yöntemi isteyen istediği gibi kullansın
//        System.out.println("Puanınız 100");
    public final void gameOver(){ //bu yöntemi kullanmak isteyen anca böyle kullanabilir
        System.out.println("Oyun Bitti");
    }
}
