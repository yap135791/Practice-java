package hackerrank.algorithms.warmup;

import java.util.List;

public class BonAppetit {

	//https://www.hackerrank.com/challenges/bon-appetit/problem
    static int bonAppetit(List<Integer> bill, int k, int b) {

        int sum = 0;
        for(int i=0;i<bill.size();i++)
        {
            if(i != k)
            {
                sum+=bill.get(i);
            }
        }
        int charged = sum/2;

        
        return Math.abs(charged-b);
    }

}
