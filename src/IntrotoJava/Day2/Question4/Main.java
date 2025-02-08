package IntrotoJava.Day2.Question4;

public class Main {
    public static void main(String[] args) {
        // First we create a factory of the type we need
        ElectronicsFactory laptopFactory= new LaptopFactory();
        // Then client is passed that factory instance
        Client laptopClient= new Client(laptopFactory);
        // the client instance passed as reference to the Electronics
        Electronics laptop= laptopClient.getElectronics();
        System.out.println("We have created a laptop client from laptop factory:");
        // now we can access it by using that reference
        laptop.printDetails();

        ElectronicsFactory smartphoneFactory= new SmartphoneFactory();
        Client smartphoneClient = new Client(smartphoneFactory);
        Electronics smartphone= smartphoneClient.getElectronics();
        System.out.println("We have created a smartphone client from smarphone factory:");
        smartphone.printDetails();
    }
}
