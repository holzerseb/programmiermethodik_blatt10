/**
 * Created by user on 19.06.2017.
 */
public class FactoryProducer
{
    public enum FactoryType
    {
        LAPTOP_FACTORY,
        PHONE_FACTORY
    }

    public static DeviceFactory getFactory(FactoryType factory)
    {
        switch(factory)
        {
            case LAPTOP_FACTORY:
                return new LaptopFactory();
            case PHONE_FACTORY:
                return new PhoneFactory();
            default:
                return null;
        }
    }
}
