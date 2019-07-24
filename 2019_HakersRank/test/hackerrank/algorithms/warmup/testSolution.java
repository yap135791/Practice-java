package hackerrank.algorithms.warmup;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testSolution {

	
	@Test
	void testMinMaxSum() {
		int arr[] = {769082435, 210437958, 673982045, 375809214, 380564127};
		long expect = 558644477;
		assertEquals(MinMaxSum.miniMaxSum(arr), expect);
		
	}
	
	@Test
	void testBirthdayCakeCandles() {
		int [] arr = {3,2,1,3};
		int expect = 2;
		assertEquals(BirthdayCakeCandles.birthdayCakeCandles(arr), expect);
	}
	
	@Test
	void testTimeConversion() {
		String s = "07:05:45PM";
		String expect = "19:05:45";
		assertEquals(TimeConversion.timeConversion(s), expect);
	}
	@Test
	void testTimeConversion2() {
		String s = "12:40:22AM";
		String expect = "00:40:22";
		assertEquals(TimeConversion.timeConversion(s), expect);
	}
	
	@Test
	void testDivisibleSumPairs() {
		int [] arr = {1,3,2,6,1,2};
		int expect = 5;
		assertEquals(DivisibleSumPairs.divisibleSumPairs(6, 3, arr), expect);
	}
	
	@Test
	void testBreakingTheRecords() {
		int [] arr = {10,5,20,20,4,5,2,25,1};
		int [] expected = {2,4};
		assertArrayEquals(expected, BreakingTheRecords.breakingRecords(arr));
	}
		
}
