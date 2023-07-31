package org.example.podstawyRefleksji.zadanie1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Methods: ");
        Method[] methods = student.getClass().getMethods();
        System.out.println(Arrays.toString(methods));
        System.out.println("Fields: ");
        Field[] fields = student.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(fields));
        System.out.println("Constructors: ");
        Constructor[] constructors = student.getClass().getConstructors();
        System.out.println(Arrays.asList(constructors));

    }
}
