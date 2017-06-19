/**
 * Created by user on 19.06.2017.
 */
public class LaptopFactory extends DeviceFactory
{
    @Override
    public Phone getPhone(PhoneType phone)
    {
        return null;
    }

    @Override
    public Laptop getLaptop(LaptopType laptop)
    {
        switch(laptop)
        {
            case HP:
                return new HP();
            case LENOVO:
                return new Lenovo();
            default:
                return null;
        }
    }
}
