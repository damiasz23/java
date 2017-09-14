package producerconsumer;

public class Consumer implements Runnable{

    private static final long DEFULT_DELAY = 50;
    private final Producer producer;
    private final String name;
    private int messageCounter = 0;

    public Consumer(Producer producer, String name) {
        this.producer = producer;
        this.name = name;
    }

    public int getMessageCounter() {
        return messageCounter;
    }

    @Override
    public void run() {
        while (true){
            try {
                String message = producer.getMessage();
                if(message!=null){
                    System.out.println("Recivent message: " + message);
                }
                else {
                    System.out.println("Faild to recive message");
                }
                Thread.sleep(DEFULT_DELAY);
            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
