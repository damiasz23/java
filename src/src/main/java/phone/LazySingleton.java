package phone;

public class LazySingleton {

    private static MobilePhone instance;

    private LazySingleton() {
    }

    public static MobilePhone getIstance(){
        if(instance==null){
            instance = new MobilePhone();
        }
        return instance;
    }
}
