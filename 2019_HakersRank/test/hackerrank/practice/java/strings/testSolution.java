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
	
	@Test
	void testStringToken1() {
		String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
		int size =8;
		assertEquals(StringToken.splitStringWithToken(s), size);
	}
	@Test
	void testStringToken2() {
		String s = "                        ";
		int size =0;
		assertEquals(StringToken.splitStringWithToken(s), size);
	}

}
