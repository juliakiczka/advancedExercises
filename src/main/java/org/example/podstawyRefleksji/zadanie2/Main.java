package org.example.podstawyRefleksji.zadanie2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationError, NoSuchFieldException, InstantiationException {
        StudentExt studentExt = (StudentExt)
                Class.forName("reflection_api.StudentExt")
                        .getConstructor(String.class, String.class,
                                Integer.class, String.class)
                        .newInstance("John", "Smith", 10, "It");
        System.out.println(studentExt);
        Field nameField =
                studentExt.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(studentExt, "Johnson");
        Field lastNameField =
                studentExt.getClass().getDeclaredField("lastName");
        lastNameField.setAccessible(true);
        lastNameField.set(studentExt, "Spring");
        String name = (String)
                studentExt.getClass().getMethod("getName").invoke(studentExt);
        System.out.println(name);
        String lastName = (String)
                studentExt.getClass().getMethod("getLastName").invoke(studentExt);
        System.out.println(lastName);
        String typeOfStudies = (String)
                studentExt.getClass().getMethod("getTypeOf5tudies").invoke(studentExt);
        System.out.println(typeOfStudies);
        int index = (Integer)
                studentExt.getClass().getMethod("getIndex").invoke(studentExt);
        System.out.println(index);
    }
}
