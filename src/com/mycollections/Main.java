/**
 *  Java program to demonstrate working HashMap.
 */

package com.mycollections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {


    public static void main(String[] args) {

        // Creating an empty HashMap.
        HashMap<Integer, String> hm = new HashMap<>();

        // Inserting pairs in hm using put() method.
        hm.put(1, "John");
        hm.put(2, "Jack");
        hm.put(3, "Christian");
        hm.put(4, "Ralf");
        hm.put(5, "Ernst");
        hm.put(6, "Angela");
        hm.put(7, "Mitch");
        hm.put(8, "Jane");

        // Traversing through map using foe-each loop.
        for (Map.Entry<Integer, String> pair : hm.entrySet()) {

            // Printing keys and values/
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}