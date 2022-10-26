package se.lexicon;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = {};

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
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName);
        }
        return fullName;
    }

    public static boolean add(final String fullName) {
        return false;
    }

    public static String[] findByFirstName(final String firstName) {
        return new String[0];
    }

    public static String[] findByLastName(final String lastName) {
        return new String[0];
    }

    public static boolean update(final String original , final String updatedName) {
        return false;
    }

    public static boolean remove(final String fullName) {
        return false;
    }
}
