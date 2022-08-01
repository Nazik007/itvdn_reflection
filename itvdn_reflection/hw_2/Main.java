package itvdn_reflection.hw_2;

import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the class from the list we have - Cat or Bird: ");
        String choice = scanner.nextLine();
        switch (choice){
            case "Bird":
                try {
                    Bird b = new Bird();
                    Class obj = b.getClass();

                    String name = obj.getName();
                    System.out.println("Name: " + name);

                    int modifier = obj.getModifiers();
                    String mod = Modifier.toString(modifier);
                    System.out.println("Modifier: " + mod);

                    Class superClass = obj.getSuperclass();
                    System.out.println("Superclass: " + superClass.getName());
                    System.out.println("\n");
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case "Cat":
                try {
                    Cat c = new Cat();
                    Class obj = c.getClass();
                    String name = obj.getName();
                    System.out.println("Name: " + name);
                    int modifier = obj.getModifiers();
                    String mod = Modifier.toString(modifier);
                    System.out.println("Modifier: " + mod);
                    Class superClass = obj.getSuperclass();
                    System.out.println("Superclass: " + superClass.getName());
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }
}
