/**
 * Created by user on 19.06.2017.
 */
public abstract class DeviceFactory
{
    public enum PhoneType
    {
        APPLE,
        GOOGLE
    }

    public enum LaptopType
    {
        LENOVO,
        HP
    }

    abstract Laptop getLaptop(LaptopType laptop);
    abstract Phone getPhone(PhoneType phone);
}
