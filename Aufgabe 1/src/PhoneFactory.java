/**
 * Created by user on 19.06.2017.
 */
public class PhoneFactory extends DeviceFactory
{
    @Override
    public Phone getPhone(PhoneType phone)
    {
        switch(phone)
        {
            case APPLE:
                return new Apple();
            case GOOGLE:
                return new Google();
            default:
                return null;
        }
    }

    @Override
    public Laptop getLaptop(LaptopType laptop)
    {
        return null;
    }
}
