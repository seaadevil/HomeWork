package home_work_interface;

public class MilitaryPlane implements Fly {
    String namePlane = STANDARD_PLANE_NAME;
    double speed;
    double mass;
    int counter;
    String security;

    public MilitaryPlane() {
    }

    public MilitaryPlane(int counter, double speed, String security, String namePlane, double mass) {
        this.counter = counter;
        this.speed = speed;
        this.security = security;
        this.namePlane = namePlane;
        this.mass = mass;
    }

    @Override
    public void printName() {

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
