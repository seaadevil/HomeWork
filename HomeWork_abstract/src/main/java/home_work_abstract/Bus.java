package home_work_abstract;

public class Bus extends Car {

    public static final String IT_S_BUS = " it's bus ";

    public Bus() {
    }

    public Bus(int maxPassengerNumber, String nameTransport, double speedInRealTime) {
        super(maxPassengerNumber, nameTransport, speedInRealTime);
    }

    @Override
    public void setNameTransport(String newNameForCar) {
        nameTransport = newNameForCar;
    }


    @Override
    public void setNameTransport() {
        nameTransport = IT_S_BUS;
        System.out.println(IT_S_BUS);

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
