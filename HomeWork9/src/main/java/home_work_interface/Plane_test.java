package home_work_interface;

import java.util.Scanner;

public class Plane_test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         *
         String namePlane = STANDARD_PLANE_NAME;
         double speed;
         double mass;
         int counter;
         String security;
         то-есть ты у пользователя должен запросить все эти поля, и лишь после этого создать объект типа
         PassengerPlane, чтобы обойтись без хардкода)
         */

        System.out.println("please input name for passenger plane");
        String namePlane = scanner.nextLine();
        double speedForPassengerPlane = scanner.nextDouble();
        double massForPassengerPlane = scanner.nextDouble();
        int counter = scanner.nextInt();
        String securityType = scanner.nextLine();
        /**
         * создаешь объект с принятыми параметрами - используя не дефолтивный конструктор в сигнатуре у него определены
         * следующие параметры
         *
         * int counter, double speed, String security, String namePlane, double mass
         *
         * учитывая порядок - создаем объект типа PassengerPlane
         */
        PassengerPlane passengerPlane = new PassengerPlane(counter, speedForPassengerPlane, securityType, namePlane, massForPassengerPlane);

        //по-аналогии делаешь для MilitaryPlane -> смотри выше строчки [21 -35] хорошо?
        System.out.println("please input name for military plane");
        String nameMPlane = scanner.nextLine();
        double speedForMilitaryPlane = scanner.nextDouble();
        double massForMilitaryPlane = scanner.nextDouble();
        int counterMilitary = scanner.nextInt();
        String securityMilitaryType = scanner.nextLine();

        MilitaryPlane militaryPlane = new MilitaryPlane(counterMilitary, speedForMilitaryPlane, securityMilitaryType, nameMPlane, massForMilitaryPlane);

        Fly[] masplane = {passengerPlane,  militaryPlane};
        for (Fly plane : masplane) {

            plane.printName();
            plane.getTransportSpeed();
            plane.getTransportMass();
            plane.getPassengerNumber();
            plane.getSecurityLevel();
        }
    }
}
