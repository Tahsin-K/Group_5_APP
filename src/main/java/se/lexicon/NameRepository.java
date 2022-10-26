package se.lexicon;

import java.util.ArrayList;

public class NameRepository {

    private static String[] names = new String[0];


    public static int getSize() {
        int size = names.length;
        return size;
    }

    public static void setNames(String[] names) {
        // todo: Esther
    }

    public static void clear() {
        // todo: tesfaldet
    }

    public static String[] findAll() {

        return new String[0];
    }
    public static String find(final String fullName){

        return fullName;
    }
    public static boolean add(final String fullName){

        return false;
    }
    public static String[] findByFirstName(final String firstName){

        return new String[0];
    }
    public static String[] findByLastName(final String lastName){

        return new String[0];
    }
    public static boolean update(final String original, final String updatedName) {

        return false;
    }
    public static boolean remove(final String fullName){

        return false;
    }
}
