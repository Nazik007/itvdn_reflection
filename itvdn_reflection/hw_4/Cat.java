package itvdn_reflection.hw_4;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException {
        try {
            Animal animal = new Animal();
            Class<?> cl = Animal.class;

            System.out.println("Old public field value: " + animal.getName());
            Field field1 = cl.getDeclaredField("name");
            field1.setAccessible(true);
            field1.set(animal, "Macy");
            String name = (String) field1.get(animal);
            System.out.println("New public field value: " + name);

            Field field = cl.getDeclaredField("age");
            field.setAccessible(true);
            System.out.println("\nOld private field value: " + field.getInt(animal));
            field.setInt(animal,10);
            System.out.println("New private field value: " + field.getInt(animal));

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
