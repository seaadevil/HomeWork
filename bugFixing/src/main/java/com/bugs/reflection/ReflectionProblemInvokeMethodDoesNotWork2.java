package com.bugs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblemInvokeMethodDoesNotWork2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException, ClassNotFoundException {
        Class userClass = Class.forName(User.class.getName());
        /*Object o = userClass.newInstance();
        System.out.println(0);*/
        Constructor constructor = userClass.getConstructor(String.class);
        //Object o1 = userClass.newInstance();//ты здесь дергаешь конструктор по-умолчанию, если уже пробуешь использовать
        //конструктор вида userClass.getConstructor(String.class);, немного перепиши
        Object o1 = constructor.newInstance("test");
        if (o1 instanceof User) {

            User user = (User) o1;
            Field field = userClass.getDeclaredField("veryImportantField");
            field.setAccessible(true);
            field.set(user, "newValueForVeryImportantField");
            System.out.println("after changes --->>>> " + user.getVeryImportantField());


        }


    }
}
