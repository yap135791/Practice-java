package hackerrank.algorithms.warmup;

public class DivisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count =0;
        int tmp;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                tmp = ar[i]+ar[j];
                if(tmp%k==0)
                    count++;
            }
        }
        return count;

    }

	
}
