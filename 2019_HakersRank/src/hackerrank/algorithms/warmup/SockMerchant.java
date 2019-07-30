package hackerrank.algorithms.warmup;

public class SockMerchant {

	
    // https://www.hackerrank.com/challenges/sock-merchant/problem
    public static int sockMerchant(int n, int[] ar) {
        int result = 0;
        int []pairs = new int[100];
        for(int a:ar)
            pairs[a-1]++;

        for(int pair:pairs)
            result += pair/2;

        return result;
    }
}
