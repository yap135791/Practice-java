package hackerrank.algorithms.warmup;

import java.util.Arrays;

public class BirthdayCakeCandles {

	//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
    public static int birthdayCakeCandles(int[] ar) {
    	int len = ar.length;
        Arrays.sort(ar);
        int count =0;
        int maxHeight = ar[len-1];
        for(int i=len-1;i>=0;i--)
        {
            if(ar[i]==maxHeight)
                count++;
            else
                break;
        }
        return count;
    }

}
