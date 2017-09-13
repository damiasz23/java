package threding;

public class Start {

    public static void main(String[] args) {



        Thread t1 = new Thread(() -> {
            System.out.println("Nowy wątek");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("Koniec wątku");
        });

//        t1.setDaemon(true);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Watek main koniec");
    }
}
