package io.demo;

import io.demo.Utils;
import java.util.Collection;
import java.util.ArrayList;;


class Program{
	public static void main(String[] args){
		Object[] objectsArray = new Object[100];
		Collection<Object> objectsCollection = new ArrayList<Object>();

		// T inferred to be Object
		Utils.fromArrayToCollection(objectsArray, objectsCollection); 

		String[] stringsArray = new String[100];
		Collection<String> stringsCollection = new ArrayList<String>();

		// T inferred to be String
		Utils.fromArrayToCollection(stringsArray, stringsCollection);		
	}
}