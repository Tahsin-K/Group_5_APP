package se.lexicon;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

            System.out.println(NameRepository.getSize());
            System.out.println((NameRepository.setNames(new String[]{"anna", "bally", "cella", "delta","mio vera"})));

            System.out.println(Arrays.toString(names));
            System.out.println(getSize());

            System.out.println(Arrays.toString(findAll()));

            clear();
            System.out.println(getSize());
        }



}
