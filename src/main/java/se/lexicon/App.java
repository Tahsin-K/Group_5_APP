package se.lexicon;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] family = NameRepository.findAll();
        System.out.println(Arrays.toString(family));

        String[] firstNameTanzeem = NameRepository.findByFirstName("Tanzeem");
        System.out.println(Arrays.toString(firstNameTanzeem));

        String[] lastNameTanzeem = NameRepository.findByLastName("Tanzeem");
        System.out.println(Arrays.toString(lastNameTanzeem));
    }
}
