package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 *
 */
public final class Utilities {

    private Utilities() {
    }

    /**
     * Copies all the elements of the first collection in the second collection.
     * 
     * @param source
     *            the source collection
     * @param target
     *            the target collection
     * @param <X>
     *            Collection type
     */
    public static <X> void copyAll(final Collection<X> source, final Collection<? super X> target) {
    	target.addAll(source);
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     * 
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	X randomElement = null;
		if (!coll.isEmpty()) {
			final Iterator<X> iterator = coll.iterator();
		    final int randomSize = new Random().nextInt(coll.size()) + 1;    
		    for (int i = 0; i < randomSize; i++) {
		    	randomElement = iterator.next();
		    }
    	}
		return randomElement;
    }

    /**
     * @param one
     *            first collection
     * @param two
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> one, final Collection<Y> two) {
        return new Pair<X, Y>(getRandomElement(one), getRandomElement(two));
    }
}
