package home_work_interface;

public class PassengerPlane implements Fly {
    String namePlane;
    double speed;
    double mass;
    int counter;
    String security;

    public PassengerPlane(int counter, double speed, String security, String namePlane, double mass) {
        this.counter = 15;
        this.speed = 180;
        this.security = "third level";
        this.namePlane = "Ruslan";
        this.mass = mass;
    }

    public PassengerPlane() {

    }

    @Override
    public void printName(String transportName) {

//        this.namePlane = "Ruslan";
        System.out.println("Passenger Plane - > " + namePlane);

    }

    @Override
    public double getTransportSpeed() {

        return speed;
    }

    @Override
    public double getTransportMass() {
        return mass;
    }

    @Override
    public int getPassengerNumber() {

        return counter;
    }

    @Override
    public String getSecurityLevel() {

        return security;
    }
}
