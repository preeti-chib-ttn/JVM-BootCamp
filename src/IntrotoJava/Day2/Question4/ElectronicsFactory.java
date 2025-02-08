package IntrotoJava.Day2.Question4;

// Library classes
abstract class Electronics{
    public abstract void printDetails();
}

class Laptop extends Electronics{
    @Override
    public  void printDetails(){
        System.out.println("This is a laptop with some details.");
    }
}

class Smartphone extends  Electronics{
    @Override
    public  void printDetails(){
        System.out.println("This is a smartphone with some details.");
    }
}

interface ElectronicsFactory {
    Electronics createElectronics();
}

class LaptopFactory implements ElectronicsFactory{
    @Override
    public Electronics createElectronics() {
        return new Laptop();
    }
}

class SmartphoneFactory implements ElectronicsFactory{
    @Override
    public Electronics createElectronics() {
        return new Smartphone();
    }
}

class Client{
    private Electronics electronics;
    public Client(ElectronicsFactory electronicsFactory){
        electronics=electronicsFactory.createElectronics();
    }

    public Electronics getElectronics(){
        return  electronics;
    }
}
