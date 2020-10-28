package com.example.MovieRating;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class FilterDictionary {

	public static void main(String[] args) {
		Dictionary geek = new Hashtable();
		geek.put("a", "apple");
		geek.put("b", "bat");
		geek.put("c", "china");
		geek.put("d", "dog");

		List<String> str = new ArrayList<String>();
		str.add("b");
		str.add("d");

		List<String> finalList = new ArrayList<String>();

		Enumeration e = geek.keys();

		while (e.hasMoreElements()) {
			String key = e.nextElement().toString();
			System.out.println("Dictionary.input...." + key);
			str.stream().filter(s -> s.equalsIgnoreCase((String) key))
					.forEach(s -> finalList.add(geek.get(s).toString()));
		}
		finalList.stream().forEach(s -> System.out.println("Dictionary Filtered..." + s));
	}

}
