package thread;

public class Threads {
    public static void main(String[] args) {

        ChildThread c1 = new ChildThread("ilk");
        c1.start();//Thread is running




        RunnableImplement r1 = new RunnableImplement("son bir");
        RunnableImplement r2 = new RunnableImplement("son iki");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();//RunnableImplement is now thread ...
        t2.start();//RunnableImplement is now thread ...





    }//main sonu
}//class sonu

//1.yol : extends ile
 class ChildThread extends Thread {

    private String name;

    public ChildThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <4 ; i++) {
            System.out.println(name + " çalışıyor. "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " tamamlandı ...");
    }

}

//2.yol : Runnable interface ini implement ederek
class RunnableImplement implements Runnable {

    private String name;

    public RunnableImplement(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i <4 ; i++) {
            System.out.println(name + " çalışıyor" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " tamamlandı");

    }
}


