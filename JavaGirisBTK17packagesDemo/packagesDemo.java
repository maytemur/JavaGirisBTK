package JavaGirisBTK17packagesDemo;

import JavaGirisBTK17packagesDemo.matematik.*;

import java.util.Scanner;

public class packagesDemo {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Adınızı Giriniz:");

        String isim= data.nextLine();

        System.out.println("Merhaba "+isim);

        DortIslem dortIslem= new DortIslem();
        dortIslem.topla(4,6);

        Logaritma logaritma = new Logaritma();

    }
}
