package se.lexicon;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(NameRepository.getSize());
        String [] names = {"Arnold Welsh", "Mikel Peters", "Thomas Kult"};
        NameRepository.setNames(names);
        System.out.println(Arrays.toString(names));
        System.out.println(NameRepository.getSize());
        NameRepository.clear();
        System.out.println(NameRepository.find("Arold Welsh"));
        System.out.println(NameRepository.add("Mikel Pete"));
        System.out.println(Arrays.toString(NameRepository.findAll()));
        System.out.println(Arrays.toString(NameRepository.findByFirstName("mikel")));
        System.out.println(Arrays.toString(NameRepository.findByLastName("peters")));

    }



}
