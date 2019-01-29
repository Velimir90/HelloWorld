
public class Car {
    
    int maxSpeed = 180;
    double weight = 1340.43;
    boolean isTheCarOn = false;
    String model = "Audi";
    
    double maxFuel = 100;
    double currentFuel = 50;
    int consumption = 5; //per 100km
    double mileagePassed = 2000;
    
    public void printVariables() {
        System.out.println("Maksimalna brzina: " + maxSpeed);
        System.out.println("Tezina: " + weight);
        System.out.println("Da li je auto ukljucen: " + isTheCarOn);
        System.out.println("Model automobila: " + model);
        System.out.println("Maksimalna zapremina rezervoara: " + maxFuel);
        System.out.println("Trenutno stanje goriva: " + currentFuel);
        System.out.println("Potrosnja goriva: " + consumption);
        System.out.println("Predjena kilometraza: " + mileagePassed);
    }
    
    
    
}