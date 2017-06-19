/**
 * Created by user on 19.06.2017.
 */
public class Aufgabe1
{
    public static void main(String[] args) {

        //get laptop factory
        System.out.println("[INFO] Creating Laptop-Factory");
        DeviceFactory factory = FactoryProducer.getFactory(FactoryProducer.FactoryType.LAPTOP_FACTORY);

        //get an object of Lenovo-Laptops
        System.out.println("[INFO] Creating Lenovo-Laptop");
        Laptop laptop = factory.getLaptop(DeviceFactory.LaptopType.LENOVO);

        //call print method for this laptop
        System.out.println("[INFO] Printing information of just created laptop.");
        laptop.print();

        //get an object of HP Laptops
        System.out.println("[INFO] Creating HP-Laptop");
        laptop = factory.getLaptop(DeviceFactory.LaptopType.HP);

        //call print method for this laptop
        System.out.println("[INFO] Printing information of just created laptop.");
        laptop.print();

        //get Phone factory
        System.out.println("[INFO] Creating Phone-Factory");
        factory = FactoryProducer.getFactory(FactoryProducer.FactoryType.PHONE_FACTORY);

        //get an object of Apple Phone
        System.out.println("[INFO] Creating Apple-Phone");
        Phone phone = factory.getPhone(DeviceFactory.PhoneType.APPLE);

        //call print method of apple phone
        System.out.println("[INFO] Printing information of just created phone.");
        phone.print();

        //get an object of Google Phone
        System.out.println("[INFO] Creating Google-Phone");
        phone = factory.getPhone(DeviceFactory.PhoneType.GOOGLE);

        //call print method of google phone
        System.out.println("[INFO] Printing information of just created phone.");
        phone.print();
    }
}
