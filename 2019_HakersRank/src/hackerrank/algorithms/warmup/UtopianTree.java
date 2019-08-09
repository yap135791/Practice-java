package hackerrank.algorithms.warmup;

public class UtopianTree {

	//https://www.hackerrank.com/challenges/utopian-tree/problem
    public static int utopianTree(int n) {
        int height=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                height *=2;
            else
                height +=1;
        }
        return height;
    }
}
