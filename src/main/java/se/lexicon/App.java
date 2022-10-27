package se.lexicon;

import java.util.ArrayList;

public class App {
    static NameRepository repo = new NameRepository();


    public static void main(String[] args) {
        createName();
        findByFirstName();

    }

    public static void createName() {
        String[] user = new String[]{"anna jao", "tes weld", "fil tek", "arr fan", "tes aron", " tes mel", "tes dan"};
        repo.setNames(user);

        for (String st: user) {
            System.out.println(st);
        }
    }
    public static void findByFirstName(){
        String [] test = repo.findByFirstName("tes");
        int i = 0;
        for(String name: test){
            System.out.println("name # " + ++i + ". " + name);
        }

    }
    public static void findByLastName(){
        String [] test2 = repo.findByLastName("tek");
        int i = 0;
        for (String name: test2){
            System.out.println("lastname = "+ ++i + "." + name);
        }

    }

}
