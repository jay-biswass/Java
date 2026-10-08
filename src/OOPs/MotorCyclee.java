package OOPs;

public class MotorCyclee extends Vehiclee {
    public String handleBarStyle;
    public String suspensionType;

    MotorCyclee(String name, String model, int noOfTyres, String handleBarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

}
