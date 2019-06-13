package hackerrank.algorithms.warmup;

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
}
