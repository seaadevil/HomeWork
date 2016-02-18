package home_work_abstract;

public class SportCar extends Car {


    public static final String IT_S_SPORT_CAR = " it's sport car ";

    public SportCar() {

    }

    public SportCar(int maxPassengerNumber, String nameTransport, double speedInRealTime) {
        super(maxPassengerNumber, nameTransport, speedInRealTime);
    }


    @Override
    public void setNameTransport(String newName) {
        nameTransport = newName;
        System.out.println(IT_S_SPORT_CAR);
    }

    @Override
    public void setNameTransport() {
        nameTransport = IT_S_SPORT_CAR;//то-есть у тебя будет определено 2 метода - один, принимающией аргумент, 2- не принимающий
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
