package Singleton;

public class Eagerloading {
    private static Eagerloading eagerloading = new Eagerloading();
    private Eagerloading(){}

    public static Eagerloading getInstance(){
        if(eagerloading == null) eagerloading = new Eagerloading();
        return eagerloading;
    }
    //Will work in multithreaded env.

    //Issues
    //In case we have more singleton classes like this then app start up will increase.
    //We can't pass any attribute to the constructor.
}
