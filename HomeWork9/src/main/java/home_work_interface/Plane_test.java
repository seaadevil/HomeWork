package home_work_interface;

public class Plane_test {
    public static void main(String[] args) {
        PassengerPlane passengerPlane = new PassengerPlane();
        passengerPlane.getPassengerNumber();
        MilitaryPlane militaryPlane = new MilitaryPlane();
        System.out.println("" + passengerPlane.counter + "" + passengerPlane.security + "" + passengerPlane.speed + "" + passengerPlane.namePlane + "" + passengerPlane.getSecurityLevel() + "" + passengerPlane.getTransportMass() + "" + passengerPlane.getPassengerNumber());

    }
}
