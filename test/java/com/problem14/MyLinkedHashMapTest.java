package com.problem14;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAdded_ShouldReturnWordFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
/*		String sentence = "Paranoids are not paranoid because they are paranoid but "+
						  "because they keep putting themselves deliberately into " + 
				          "paranoid avoidable situations";
*/		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}
		int frequency = myLinkedHashMap.get("paranoid");
		assertEquals(3, frequency);
	}
	
	@Test
	public void givenASentence_WhenWordsAreRemoved_ShouldReturnRemovedWord() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}
		myLinkedHashMap.remove("avoidable");
		Integer frequency = myLinkedHashMap.get("avoidable");
		assertEquals(null, frequency);
	}
}
