package home_work_abstract;

public class AutoCar extends Car {

    public static final String IT_S_AUTO_CAR = " it's auto car ";

    public AutoCar() {
    }

    public AutoCar(int maxPassengerNumber, String nameTransport, double speedInRealTime) {
        super(maxPassengerNumber, nameTransport, speedInRealTime);
    }

    @Override
    public void setNameTransport(String newNameForCar) {
        //TODO
    }

    @Override
    public void setNameTransport() {
        nameTransport = IT_S_AUTO_CAR;
        System.out.println(IT_S_AUTO_CAR);

    }

    @Override
    public String name() {
        return nameTransport;
    }

    @Override
    public double speed() {
        return speedInRealTime;
    }
}
