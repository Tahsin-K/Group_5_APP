package se.lexicon;

import java.util.ArrayList;

public class NameRepository {

    private static String[] _names = {};

    public static int getSize() {
        System.out.println(_names.length);

        return _names.length;


    }

    public static void setNames(String[] names) {
        _names = names;
    }

    public static void clear() {
        _names = new String [] {};
    }

    public static String[] findAllNames() {

        return _names;
    }
    public static String find(final String fullName){
     for(String name: _names){
        if (fullName.equals(name)){
            return name;
        }
     }
     return "";
    }
    public static boolean add(final String fullName){
      for (String name: _names){
          if(fullName.equals(name)){
              return false;
          }
      }
        return true;
    }
    public static String[] findByFirstName(final String firstName){
        String [] theSameFirstname = {};
        int i = 0;
        for (String name: _names){
            String [] splitName = name.split(" ");
            if(splitName[0].equals(firstName)){
                i++;
                String [] temp = new String [i];
                for(int j=0; j<i-1; j++){
                    if(theSameFirstname.length != 0) {
                        temp[j] = theSameFirstname[j];
                    }
                }
                temp[i-1] = name;
                theSameFirstname = new String [i];
                for(int j=0; j<i; j++){
                    theSameFirstname[j] = temp[j];
                }
            }
        }
        return theSameFirstname;
    }
    public static String[] findByLastName(final String lastName){
        String [] theSamelastName = {};
        int i = 0;
        for (String name: _names){
            String [] splitName = name.split(" ");
            if(splitName[1].equals(lastName)){
                i++;
                String [] temp = new String [i];
                for(int j=0; j<i-1; j++){
                    if(theSamelastName.length != 0) {
                        temp[j] = theSamelastName[j];
                    }
                }
                temp[i-1] = name;
                theSamelastName = new String [i];
                for(int j=1; j<i; j++){
                    theSamelastName[j] = temp[j];
                }
            }
        }
        return theSamelastName;
    }

    public static boolean update(final String original, final String updatedName) {
        if( updatedName.equals(_names)){
            return false;
        }

        return true;
    }
    public static boolean remove(final String fullName){
       /* if(fullName != null){
            _names= null;
            return true;

        }
*/
        return false;
    }
}
