package io.demo;
import java.util.Collection;

class Utils {
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o); // Correct
		}
	}
}