package home_work_abstract;

import java.util.Scanner;

public class Test_Car {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("please input name for car");


        Car[] cars = {new SportCar(), new Bus(), new AutoCar()};
        for (Car auto : cars) {
            auto.setNameTransport();
            System.out.println("maxPassengerNumber = " + auto.maxPassengerNumber);//почему ты обращаешься к константе как к методу? :)так будет гуд)
            System.out.println("maxSpeed = " + auto.maxSpeed);
            System.out.println("minPassengerNumber = " + auto.minPassengerNumber);
            System.out.println("speedInRealTime= " + auto.speedInRealTime);
            System.out.println("nameTransport= " + auto.nameTransport);//is it good? посмотришь? поковыряешь?окей
        }

    }
}
