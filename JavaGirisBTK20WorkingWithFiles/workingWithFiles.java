package JavaGirisBTK20WorkingWithFiles;

import java.io.*;
import java.util.Scanner;

public class workingWithFiles {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }
    public static void createFile(){
        File dosya = new File("C:\\Users\\maytemur\\Google Drive\\Java\\Kurs\\Hello\\src\\workingWithFiles\\students.txt");
        try {
            if (dosya.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File dosya = new File("C:\\Users\\maytemur\\Google Drive\\Java\\Kurs\\Hello\\src\\workingWithFiles\\students.txt");
        if (dosya.exists()){
            System.out.println("Dosya Adı "+dosya.getName());
            System.out.println("Dosya Yolu "+dosya.getAbsolutePath());
            System.out.println("Yazılabilir mi: "+dosya.canWrite());
            System.out.println("Okunabilir mi  "+dosya.canRead());
            System.out.println("Dosya Boyutu(byte) "+dosya.length());
        }
    }
    //bufferedreader - önce dosyayı belleğe alır sonra işlemi yapar, file nesnesi belleğe almadan direkt işlem yapar
    public static void readFile(){
        File dosya = new File("C:\\Users\\maytemur\\Google Drive\\Java\\Kurs\\Hello\\src\\workingWithFiles\\students.txt");
        try {
            Scanner myreader= new Scanner(dosya);
            while(myreader.hasNextLine()){
                String line = myreader.nextLine();
                System.out.println(line);
            }
            myreader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {
            FileWriter dosya = new FileWriter("C:\\Users\\maytemur\\Google Drive\\Java\\Kurs\\Hello\\src\\workingWithFiles\\students.txt",true);
            BufferedWriter writerDosya= new BufferedWriter(dosya);
            writerDosya.newLine();
            writerDosya.write("BufferedWriter'la gelen satır");
            System.out.println("Dosyaya yazıldı");
            writerDosya.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
