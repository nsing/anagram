package com.exercise;

/**
 * This class has main method to take two command line arguments.
 * The method uses GrammarUtils class and outputs to the console the string
 * "Yes" when the arguments are anagrams of each other, or "No" otherwise.
 */
public class IsAnagram {

	public static void main(String[] args) {
		if(args.length >= 2) {
			System.out.println(GrammarUtils.isAnagram(args[0], args[1]) ? "Yes" : "No");
		}
		else {
			System.out.println("Two String inputs are required");
		}
	}

}
