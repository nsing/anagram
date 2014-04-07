package com.exercise;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GrammarUtilsTest {

	/**
	 * Junit test for GrammarUtils checking following cases:
	 *
	 * IsAnagram ( "comics" "cosmic" ) = Yes
	 * IsAnagram ( "cosmic" "comics" ) = Yes
	 * IsAnagram ( "television ads" "enslave idiots" ) = Yes
	 * IsAnagram ( "difficult" "easy" ) = No
	 * IsAnagram ( "abc xyz" "xabz yc" ) = Yes
	 * IsAnagram ( "television         ads" "enslave idiots" ) = Yes
	 * IsAnagram ( "enlisted" "listened" ) = Yes
	 * IsAnagram ( "dirty room "dormitory" ) = Yes
	 */
	@Test
	public void test() {
		assertTrue(GrammarUtils.isAnagram("comics", "cosmic"));
		assertTrue(GrammarUtils.isAnagram("cosmic", "comics"));
		assertTrue(GrammarUtils.isAnagram("television ads", "enslave idiots"));
		assertFalse(GrammarUtils.isAnagram("difficult", "easy"));
		assertTrue(GrammarUtils.isAnagram("abc xyz", "xabz yc"));
		assertTrue(GrammarUtils.isAnagram("television         ads", "enslave idiots"));
		assertTrue(GrammarUtils.isAnagram("enlisted", "listened"));
		assertFalse(GrammarUtils.isAnagram("dirty roo", "dormitory"));
	}

}
