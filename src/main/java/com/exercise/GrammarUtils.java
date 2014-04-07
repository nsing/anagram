package com.exercise;

/**
 * This is a utility class having static method called isAnagram, which accepts
 * two String values and returns a boolean based on anagram identification logic
 * result.
 */

public class GrammarUtils {

	/**
	 * This determines whether we have an anagram or not.
	 *
	 * LOGIC:
	 * Initialise an array of int values representing counts for all 26 English
	 * alphabets (a to z) as 0.
	 * Increment counts based on 1st String characters.
	 * Decrement counts based on 2nd String characters.
	 * Return false if any of count values is non zero otherwise return true.
	 *
	 * ASSUMPTIONS: String parameters can have only English alphabets (any of a
	 * to z or A to z).
	 * String parameters can have spaces but logic will ignore spaces.
	 *
	 * @param string1
	 * @param string2
	 * @return boolean
	 */
	public static boolean isAnagram(String string1, String string2) {

		boolean result = true;
		int stringCharCounts[] = new int[26];

		//Increment count for characters in 1st string
		for (int i = 0; i < string1.length(); i++) {
			if (!Character.isSpaceChar(string1.charAt(i))) {
				stringCharCounts[Character.toLowerCase(string1.charAt(i)) - 'a']++;
			}
		}

		//Increment count for characters in 2nd string
		for (int i = 0; i < string2.length(); i++) {
			if (!Character.isSpaceChar(string2.charAt(i))) {
				stringCharCounts[Character.toLowerCase(string2.charAt(i)) - 'a']--;
			}
		}

		//Check counts
		for (int i = 0; i < stringCharCounts.length; i++) {
			if (stringCharCounts[i] != 0) { //Count is non zero
				result = false;
				break;
			}
		}

		return result;
	}

}
