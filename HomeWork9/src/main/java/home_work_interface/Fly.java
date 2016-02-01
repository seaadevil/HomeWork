package home_work_interface;

/*
ок, начнем с интерфейса - это твоя спека, которая описывает, что должны уметь делать
твои будущие объекты классов, которые данный интерфейс имплементируют

для нас это следующие классы:
MilitaryPlane
and
PassengerPlane
-- оба будут уметь:

    getPassengerNumber(): int
    getSecurityLevel(): String
    getTransportMass(): double
    getTransportSpeed(): double
    printName(): void


 */
public interface Fly {
    String STANDARD_PLANE_NAME="TEST_PLANE_NAME";

    void printName ();

    double getTransportSpeed();

    double getTransportMass();

    int getPassengerNumber();

    String getSecurityLevel();

}
