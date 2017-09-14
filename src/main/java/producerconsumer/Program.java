package producerconsumer;

public class Program {

    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();

        Consumer consumer = new Consumer(producer, "Consumer 1");

        Thread producerThred = new Thread(producer);
        Thread consumerThred = new Thread(consumer);

        producerThred.start();
        consumerThred.start();

        producerThred.join();
        consumerThred.join();
    }

}
