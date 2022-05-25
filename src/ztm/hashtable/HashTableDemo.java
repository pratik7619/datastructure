package ztm.hashtable;

import java.util.Hashtable;

public class HashTableDemo {
    //?Pratik Sherdiwala (Codelytics)
    public static void main(String[] args) {

        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("grapes", 10000);

       table.forEach((key, data) -> {
           System.out.println(key);
       });
    }
}