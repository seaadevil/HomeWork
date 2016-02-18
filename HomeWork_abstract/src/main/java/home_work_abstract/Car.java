package home_work_abstract;

public abstract class Car implements Machine {

  /*  public home_work_abstract.Machine(String name, int speed) {

    }*/


    public Car() {

    }

    public Car(int maxPassengerNumber, String nameTransport, double speedInRealTime) {
        this.maxPassengerNumber = maxPassengerNumber;
        this.nameTransport = nameTransport;
        this.speedInRealTime = speedInRealTime;
    }

    final int maxSpeed = 320;
    final int minSpeed = 20;
    final int minPassengerNumber = 1;
    int maxPassengerNumber = 42;

    String nameTransport;
    double speedInRealTime;

    abstract public void setNameTransport(String newNameForCar);

    abstract public void setNameTransport();


    @Override
    public String toString() {
        return "Car{" +
                "maxPassengerNumber=" + maxPassengerNumber +
                ", maxSpeed=" + maxSpeed +
                ", minSpeed=" + minSpeed +
                ", minPassengerNumber=" + minPassengerNumber +
                ", nameTransport='" + nameTransport + '\'' +
                ", speedInRealTime=" + speedInRealTime +
                '}';
    }


}
