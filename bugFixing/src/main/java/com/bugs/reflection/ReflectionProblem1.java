package com.bugs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionProblem1 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {

        Class userClass =Class.forName(User.class.getName());



        Constructor constructor1 = userClass.getConstructor(String.class);
        Object object = constructor1.newInstance("testN");
        if (object instanceof User) {
            User user = (User) object;
            user.getName();
            user.getSurName();
            System.out.println(user.getName() + "     " + user.getSurName());

            invokePrivateUserMethod(userClass, user);

        }
        Method[] methods = userClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    private static void invokePrivateUserMethod(Class userClass, User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method privateMethod = userClass.getDeclaredMethod("verySecurityMethod");
        //verySecurityMethod.setAccessible(true);
        //verySecurityMethod.invoke(user, null);
    }

}




