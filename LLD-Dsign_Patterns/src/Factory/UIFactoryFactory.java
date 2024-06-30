package Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.ANDROID)) return new AndroidUIFactory();
        else if(platform.equals(SupportedPlatform.IOS)) return new IosUIFactory();
        return null;
    }
}
