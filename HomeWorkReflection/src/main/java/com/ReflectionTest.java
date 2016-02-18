package com;

import java.lang.reflect.*;

public class ReflectionTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Building building = new Building("two", "sea-side", "sky-scraper");
        System.out.println(building);

        Class buildingClass = Class.forName(Building.class.getName());
        Object o1 = buildingClass.newInstance();
        System.out.println("---->>" + o1);

        Constructor[] constructors = buildingClass.getDeclaredConstructors();
        int count = 0;
        for (Constructor constructor : constructors) {
            System.out.println("constructor number " + count++);
            System.out.println("name->" + constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType());
            }
            int modifiers = constructor.getModifiers();
            System.out.println(getAllModifiers(modifiers));
        }

        Constructor constructor = buildingClass.getConstructor(String.class, String.class);
        Object o = constructor.newInstance("age", "area", "type");
        System.out.println(o);
        if (o instanceof Building) {
            Building buildingTmp = (Building) o;
            System.out.println("getAreaOfBuilding --> " + buildingTmp.getAreaOfBuilding());

            invokePrivateUserMethod(buildingClass, buildingTmp);

        }
        System.out.println("->methods<-");
        Method[] methods = buildingClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    private static void invokePrivateUserMethod(Class buildingClass, Building buildingTmp) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method privateMethod = buildingClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(buildingTmp, null);
    }

    private static String getAllModifiers(int modifier) {
        StringBuilder answer = new StringBuilder();
        if (Modifier.isAbstract(modifier)) {
            answer.append(" abstract ");
        }
        if (Modifier.isPublic(modifier)) {
            answer.append(" public ");
        }
        if (Modifier.isFinal(modifier)) {
            answer.append(" final ");
        }
        if (Modifier.isStatic(modifier)) {
            answer.append(" static ");
        }

        if (Modifier.isPrivate(modifier)) {
            answer.append(" private ");
        }
        return answer.toString();
    }

    void printObjectInfo(Class class_) {


    }

}
