package com;

public class UserTest {
    public static void main(String[] args) {
        Emotions happy = Emotions.HAPPY;
        Emotions sad = Emotions.SAD;
        switch (happy) {
            case HAPPY:
                System.out.println("i's happy emotions -> " + Emotions.HAPPY.ordinal());
                break;
            case SAD:
                System.out.println("it's sad emotions ->" + Emotions.SAD.ordinal());
                break;
            case ANGRY:
                System.out.println("it's angry emotions ->" + Emotions.SCARED.ordinal());
                break;
            case SCARED:
                System.out.println("it's scared emotions -> " + Emotions.SCARED.ordinal());
                break;
            case TENDER:
                System.out.println(" it's tender emotions -> " + Emotions.TENDER.ordinal());
                break;
        }
        for (Emotions emotions : Emotions.values()) {
            System.out.println(emotions.toString());
        }
    }
}
