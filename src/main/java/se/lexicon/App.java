package se.lexicon;

import java.util.ArrayList;

public class App {
    static NameRepository repo = new NameRepository();
    static NameRepository lastrepo = new NameRepository();


    public static void main(String[] args) {
        createName();
        findByFirstName();


    }

    public static void createName() {
        String[] user = new String[] {  "Emma Watson" , "Greta Berg" , "Emma Arnold" , "Gunilla Persson" , "Sara Khan" , "James Clear" };
        repo.setNames(user);

        for (String st: user) {
            System.out.println(st);
        }
    }
    public static void findByFirstName(){
        String [] test = repo.findByFirstName("Emma");
        int i = 0;
        for(String name: test){
            System.out.println("firstname # " + ++i + ". " + name);
        }

    }
    public static void findByLastName(){
        String [] test = lastrepo.findByLastName("Greta");
        int i = 0;
        for (String name: test){
            System.out.println("lastname = "+ ++i + " ." + name);
        }

    }

}
