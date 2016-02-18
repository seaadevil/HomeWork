package com;

public class Building {


    private String age;
    private String area;
    private String type;
    public Double height;
    public Double width;


    public Building() {
        System.out.println("Введите имя здания");
    }

    public Building(Double width, String type, Double height, String area, String age) {
        this.width = width;
        this.type = type;
        this.height = height;
        this.area = area;
        this.age = age;
    }

    public void checkAgeOfBuilding() {
        int ageParse = Integer.parseInt(age);
        if (ageParse > 100) {
            System.out.println(" Ваше здание имеет историчискую ценность ");
        } else {
            System.out.println(" Ваше здание ничего не представляет для истории ");
        }
    }

    private  String getAreaOfBuilding() {
        return (" Место нахождения здания " + area);
    }

    private  String getTypeOfBuilding() {
        return (" Ваше здание из   " + type);
    }

    private Double getHeightOfBuilding() {
        return Double.valueOf((" Введите высоту здания " + height));
    }

    private Double getWidthOfBuilding() {
        return Double.valueOf(((" Введите ширину  здания " + width)));
    }

    @Override
    public String toString() {
        return "Building{" +
                "age='" + age + '\'' +
                ", area='" + area + '\'' +
                ", type='" + type + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
