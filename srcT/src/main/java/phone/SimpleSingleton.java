package phone;

public class SimpleSingleton {

    private static MobilePhone mobilePhone = new MobilePhone();


    private SimpleSingleton() {

    }
    public SimpleSingleton(String string){

    }

    public static MobilePhone getIstance(){
        return mobilePhone;
    }

}
