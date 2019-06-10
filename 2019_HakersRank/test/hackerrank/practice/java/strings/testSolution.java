package hackerrank.practice.java.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class testSubstringComparisons {

	@Test
	void testSubstringComparison1() {
		//https://www.hackerrank.com/challenges/java-string-compare/problem
    	String s ="welcometojava";
    	int k =3;
        assertEquals(SubstringComparisons.getSmallestAndLargest(s, k),"ava\nwel");
	}
	
	
	@Test
	void testAnagrams1() {
		String a = "CAT";
		String b = "ACT";
		assertEquals(Anagrams.isAnagram(a, b), true);
	}

}
