package producerconsumer;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Queue;

public class Producer implements Runnable{

    private static final int MAX_QUEUE = 5;
    private static final int DEFULT_DELAY = 10;
    private final Queue<String> messages = new LinkedList<>();
    private int messageCounter = 0;
    private final SecureRandom secureRandom = new SecureRandom();

    @Override
    public void run() {
        while (true){
            try {
                putMessage();
                messageCounter++;
                Thread.sleep(DEFULT_DELAY);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }

    public int getMessageCounter() {
        return messageCounter;
    }

    private void putMessage() throws InterruptedException {
        while (messages.size()>=MAX_QUEUE) {
            Thread.sleep(100);
        }
        messages.add(new BigInteger(130, secureRandom).toString());
    }

    public String getMessage() throws InterruptedException {
        while (messages.isEmpty()){
            System.out.println("Is empty");
            Thread.sleep(100);
        }
        return messages.poll();
    }
}
