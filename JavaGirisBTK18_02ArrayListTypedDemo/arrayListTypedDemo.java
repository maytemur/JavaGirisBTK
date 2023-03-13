package JavaGirisBTK18_02ArrayListTypedDemo;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListTypedDemo {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();

        sehirler.add("Paris");
        sehirler.add("Londra");
        sehirler.add("Berlin");
        sehirler.add("Amsterdam");
        sehirler.add("Newyork");

        System.out.println(sehirler.get(2));
        //sehirler.sort(); denilebilir veya daha güzeli collections kullanmak
        Collections.sort(sehirler); //default olarak a-z ye sıralar
        //sehirler.remove(2); veya sehirler.remove("Berlin");

        for(String eleman: sehirler){
            System.out.println(eleman);
        }
    }
}