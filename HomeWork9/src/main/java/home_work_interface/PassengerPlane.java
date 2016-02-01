package home_work_interface;

/**
 * у тебя здесь описан один из классов имплементаторов твоего интерфейса Fly ->
 * результат имплементации - ты должен дать возможность реализовать логику, указан. в спецификации классу PassengerPlane
 *
 */
public class PassengerPlane implements Fly {
    String namePlane = STANDARD_PLANE_NAME;
    double speed;
    double mass;
    int counter;
    String security;

    /**
     * тебе нужен конструктори именно для того, чтобы задавать значения для твоих полей в момент создания объекта
     * @param counter
     * @param speed
     * @param security
     * @param namePlane
     * @param mass
     */
    public PassengerPlane(int counter, double speed, String security, String namePlane, double mass) {
        this.counter = counter;
        this.speed = speed;
        this.security = security;
        this.namePlane = namePlane;//"Ruslan";//ты не должен хардкодить - эти параметры будут приходить от твоего юзера
        this.mass = mass;
    }

    public PassengerPlane() {

    }

    @Override
    public void printName() {
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
