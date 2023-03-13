package JavaGirisBTK19_04ReadingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readingFileDemo {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int toplam = 0; //text dosyasındaki sayıları toplayacağız
        try {
            //BufferedReader reader= new BufferedReader(new FileReader("sayilar.txt")); //otomatik dosya okumak için
            reader = new BufferedReader(new FileReader("C:\\Users\\maytemur\\Google Drive\\Java\\Kurs\\Hello\\src\\ReadingFileDemo\\sayilar.txt")); //otomatik dosya okumak için
            //ters slash ların 2 tane olmasının nedeni tek ters slashın \n \t gibi anlamları olmasından
            String line = null; //dosyadan okuma işlemleri satır satır olur
            while ((line = reader.readLine()) != null) {
                toplam+= Integer.valueOf(line);
            }
            System.out.println(toplam);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) { //filenotfound haricindeki bütün exceptionları bunun içine attık
            e.printStackTrace();
        } finally {
            try {
                reader.close(); //dosyayı bulamadığında kapatıcak birşeyde olmayacak o yüzden main'e throws exception
            } catch (IOException e) {
                e.printStackTrace();
            }
            //eklenebilir yani kullanacak kişiye bildiriyoruz veya bir tane daha try/catch içine de alabiliriz
        }
    }
}
