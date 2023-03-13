package JavaGirisBTK22ThreadingDemo;

public class KronometreThread implements Runnable { //runnable implement eden class multithread şeklinde çalışacaktır
    private Thread thread;
    //thread lerin ayrı ayrı çalışabilmesi için onları ayırmamız gerekiyor java bunu bizden talep ediyor
    //bunun için threadlere isim veriyoruz
    private final String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Oluşturuluyor Lifecyle göstermek için:  " + threadName);
    }

    @Override
    public void run() { //burası hariç diğer kodlar standarttır, burada thread'e konu olan operasyonu yazmalıyız        System.out.println("Çalıştırılıyor : "+threadName);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i); //çok hızlı sayacak thread olup olmadığını anlayamayabiliriz

                Thread.sleep(1000); //1000 milisaniye bekle- kronometre oldu
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Kesildi :" + threadName);
        }
        System.out.println("Thread in işi bitti : " + threadName);
    }

    //thread operasyonunu hayata geçirmemiz gerekiyor
    public void start() {
        System.out.println("Thread nesnesi oluşuyor");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
