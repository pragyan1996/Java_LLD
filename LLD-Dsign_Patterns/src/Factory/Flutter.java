package Factory;

public class Flutter {
    void refreshUI(){
        System.out.println("refreshing UI.");
    }

    void setTheme(){
        System.out.println("Setting theme");
    }

    UIFactory createFactory(SupportedPlatform platform){
        return UIFactoryFactory.getUIFactory(platform);
    }
}
