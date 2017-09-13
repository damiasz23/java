package threding;

public class Zadanie1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Countdown("Wątek 1", 50));
        Thread t2 = new Thread(new Countdown("Wątek 2", 50));
        Thread t3 = new Thread(new Countdown("Wątek 3", 50));
        t1.start();
        t2.start();
        t3.start();
//        while (t1.isAlive()){
//            System.out.println("co robisz????");
//        }

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Koniec main");


    }
}
