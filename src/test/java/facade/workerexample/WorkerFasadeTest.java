package facade.workerexample;


import org.junit.Test;

public class WorkerFasadeTest {
    @Test
    public void test() throws Exception {
        InternWorker internWorker = new InternWorker();
        AssistantWorker assistantWorker = new AssistantWorker();
        DirectorWorker directorWorker = new DirectorWorker();

        WorkerFasade fasade = new WorkerFasade();
        fasade.addWorker(internWorker);
        fasade.addWorker(assistantWorker);
        fasade.addWorker(directorWorker);

//        internWorker.startWork();
//        assistantWorker.startWork();
//        directorWorker.startWork();
//        na dole uproszczona wersja tego co do góry, design pattern fasada - jedna metoda mozemy rozpoczac prace wszystkich pracowników
//        jezeli mamy jedna metode dla wielu obiektów to fasada mozemy wywolac jedna metoda dla wielu obiektow
        fasade.startWorkingDay();

        internWorker.preperDocuments();
        assistantWorker.konfid();
        directorWorker.raiseMoney();


    }
}