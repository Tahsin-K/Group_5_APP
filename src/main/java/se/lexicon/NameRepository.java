package se.lexicon;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = { "Tanzeem Ahmed" , "Tanzeem Hussain" , "Nusayba Tanzeem" , "Ammaara Tanzeem" , "Lubna Farheen" };

    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] names) {
        NameRepository.names = names;
    }

    public static void clear() {
        names = new String[]{};
    }

    public static String[] findAll() {
        return names;
    }

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {

        return false;
    }


    public static String[] findByFirstName(final String firstName) {
        String[] temp = {};
        for (String name : names) {
            if (getFirstName(name).equalsIgnoreCase(firstName)) {
                temp = addToArray(temp , name);
            }
        }
        return temp;
    }

    public static String[] findByLastName(final String lastName) {
        String[] temp = {};
        for (String name : names) {
            if (getLastName(name).equalsIgnoreCase(lastName)) {
                temp = addToArray(temp , name);
            }
        }
        return temp;
    }

    public static boolean update(final String original , final String updatedName) {
        return false;
    }

    public static boolean remove(final String fullName) {
        return false;
    }

    private static String getFirstName(String name) {
        return name.split(" ")[0];
    }

    private static String getLastName(String name) {
        return name.split(" ")[1];
    }

    private static String[] addToArray(String[] array , String name) {
        array = Arrays.copyOf(array , array.length + 1);
        array[array.length - 1] = name;
        return array;
    }
}
