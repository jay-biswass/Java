package OOPs;

public class Carr extends Vehiclee {
    public int noOfDoors;
    public String transmissionMedium;

    Carr(String name, String model, int noOfTyres, int noOfDoors, String transmissionMedium) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionMedium = transmissionMedium;

        super.startEngine();
        super.stopEngine();
    }

    public void startAC(){
        System.out.println("AC started of : " + name);
    }
}
