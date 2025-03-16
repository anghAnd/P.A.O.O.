package com.example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            // Creăm un obiect Person
            Person person = new Person("John", 25);

            // Obținem clasa Person folosind Reflection
            Class<?> personClass = person.getClass();

            // Afișăm numele clasei
            System.out.println("Class Name: " + personClass.getName());

            // Obținem și afișăm toate câmpurile (fields)
            System.out.println("\nFields:");
            Field[] fields = personClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field: " + field.getName());
            }

            // Obținem și afișăm toate metodele
            System.out.println("\nMethods:");
            Method[] methods = personClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
            }

            // Modificăm câmpul 'name' utilizând Reflection
            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true); // Permite accesul la câmpurile private
            nameField.set(person, "Alice"); // Schimbăm valoarea câmpului 'name'

            // Invocăm metoda 'displayInfo' utilizând Reflection
            Method displayInfoMethod = personClass.getDeclaredMethod("displayInfo");
            displayInfoMethod.setAccessible(true); // Permite invocarea metodei private
            displayInfoMethod.invoke(person); // Afișează informațiile despre persoană

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}