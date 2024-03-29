package hackerrank.algorithms.warmup;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

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
		assertArrayEquals( BreakingTheRecords.breakingRecords(arr),expected);
	}
	
	@Test
	void testBirthdayChocolate() {
		List<Integer> list = new LinkedList<>();
		list.add(4);
		list.add(1);
		int expected = 1;
		assertEquals(BirthdayChocolate.birthday(list, 1, 4), expected);
	}
		
	@Test
	void testMigratoryBirds() {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		
		int expected = 3;
		assertEquals(MigratoryBirds.migratoryBirds(list), expected);
	}
	
	@Test
	void testBonAppetit() {
		List<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(10);
		list.add(2);
		list.add(9);
		int expected = 5;
		assertEquals(BonAppetit.bonAppetit(list, 1, 12), expected);
	}


	@Test
	void testBonAppetit2() {
		List<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(10);
		list.add(2);
		list.add(9);
		int expected = 0;
		assertEquals(BonAppetit.bonAppetit(list, 1, 7), expected);
	}

	@Test
	void testCatsandaMouse() {
		assertEquals(CatsandMouse.catAndMouse(1, 2, 3),"Cat B");
	}

	
	@Test
	void testCatsandaMouse2() {
		assertEquals(CatsandMouse.catAndMouse(1, 3, 2),"Mouse C");
	}
	
	@Test
	void testSockMerchant() {
		int [] ar = {10,20,20,10,10,30,50,10,20};
		int expected = 3;
		assertEquals(SockMerchant.sockMerchant(9, ar), expected);
	}
	
	@Test
	void testCountingValley() {
		String str = "UDDDUDUU";
		int expected = 1;
		assertEquals(CountingValleys.countingValleys(8, str), expected);
	}
	
	@Test
	void testElectronicsShop() {
		int [] keyboards = {3,1};
		int [] drives = {5,2,8};
		int expected = 9;
		assertEquals(ElectronicsShop.getMoneySpent(keyboards, drives, 10), expected);
	}
	
	@Test
	void testHurdleRace() {
		int []hurdles = {1,6,3,5,2};
		int expected = 2;
		assertEquals(TheHurdleRace.hurdleRace(4, hurdles), expected);
	}

	@Test
	void testHurdleRace2() {
		int []hurdles = {2,5,4,5,2};
		int expected = 0;
		assertEquals(TheHurdleRace.hurdleRace(7, hurdles), expected);
	}
	
	@Test
	void testDesignerPDFViewer() {
		int []h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		int expected = 9;
		assertEquals(DesignerPDFViewer.designerPdfViewer(h, "abc"), expected);
	}

	@Test
	void testUtopianTree() {
		int n = 4;
		int expected = 7;
		assertEquals(UtopianTree.utopianTree(n), expected);
	}

	@Test
	void testUtopianTree2() {
		int n = 3;
		int expected = 6;
		assertEquals(UtopianTree.utopianTree(n), expected);
	}

	@Test
	void testUtopianTree3() {
		int n = 5;
		int expected = 14;
		assertEquals(UtopianTree.utopianTree(n), expected);
	}

	
}
