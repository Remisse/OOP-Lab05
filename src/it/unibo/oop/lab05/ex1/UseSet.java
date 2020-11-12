package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	//1
    	final Set<String> set = new TreeSet<>();
    	
    	//2
    	for (int i = 1; i <= 20; i++) {
    		set.add(String.valueOf(i));
    	}
    	//3
    	System.out.println(set);
    	
    	//4
    	Iterator<String> iterator = set.iterator();
    	while (iterator.hasNext()) {
    		String elem = iterator.next();
    		if (Integer.valueOf(elem) % 3 == 0) {
    			iterator.remove();
    		}
    	}
    	//5
    	for (String elem: set) {
    		System.out.print(elem + " ");
    	}
    	System.out.println();
    	
    	//6
    	boolean even = true;
    	iterator = set.iterator();
    	while (iterator.hasNext() && even) {
    		if (Integer.valueOf(iterator.next()) % 2 != 0) {
    			even = false;
    		}
    	}
    	System.out.println("Are all numbers even? " + (even ? "Yes" : "No"));
    }
}
