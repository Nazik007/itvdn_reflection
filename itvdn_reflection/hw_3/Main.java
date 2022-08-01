package itvdn_reflection.hw_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";

        Class<?> cl = Teacher.class;
        System.out.println(s + "Public Reflection Fields: ");

        Field[] fields = cl.getFields();
        for (Field field: fields) {
            Class<?> fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s + field.getName());
            System.out.println(s2 + "\tType: " + s + fieldType.getName());
        }

        System.out.println(s + "All Modifiers Reflection fields: ");
        fields = cl.getDeclaredFields();

        for (Field field: fields) {
            Class<?> fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s + field.getName());
            System.out.println(s2 + "\tType: " + s + fieldType.getName());
        }

        System.out.println(s + "Constructors: " + s1);
        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor<?> ctr: constructors) {
            System.out.print(s + "\tConstructor " +(++i) + ": ");
            Class<?> [] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType: paramTypes) {
                System.out.print(s1 + paramType.getName() + " ");
            }
            System.out.println();
        }

        Method [] methods = cl.getMethods();
        for (Method method: methods) {
            System.out.println(s + "Name: " + s2 + method.getName());
            System.out.println(s + "\tReturn type: " + s1 + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            for (Class<?> paramType: paramTypes) {
                System.out.println(" " + paramType.getName());
            }
        }
    }
}
