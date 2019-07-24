package hackerrank.algorithms.warmup;

import java.util.Arrays;

public class MinMaxSum {
	
	//https://www.hackerrank.com/challenges/mini-max-sum/problem
	public static long miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = (long)arr[0]+(long)arr[1]+(long)arr[2]+(long)arr[3];
        long max = (long)arr[1]+(long)arr[2]+(long)arr[3]+(long)arr[4];
//        System.out.println(min+" "+max);
        return max-min;
    }
}
