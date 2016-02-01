package home_work_interface;

public class MilitaryPlane implements Fly {
    String namePlane;
    double speed;
    double mass;
    int counter;
    String security;

    public MilitaryPlane() {
    }

    public MilitaryPlane(int counter, double speed, String security, String namePlane, double mass) {
        this.counter = 1;
        this.speed = 950;
        this.security = "first level";
        this.namePlane = "Gloster Javelin";
        this.mass = mass;
    }

    @Override
    public void printName(String transportName) {

        System.out.println("Military Plane - > " + namePlane);

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
