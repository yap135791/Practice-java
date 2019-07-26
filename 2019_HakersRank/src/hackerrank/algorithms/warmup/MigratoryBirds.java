package hackerrank.algorithms.warmup;

import java.util.List;

public class MigratoryBirds {

	
    // https://www.hackerrank.com/challenges/migratory-birds/problem
    static int migratoryBirds(List<Integer> arr) {
        int []type = {0,0,0,0,0};
        int resultID=0;
        int tmp=0;
        for(int i=0;i<arr.size();i++)
        {
        	int idx = arr.get(i)-1;
        	type[idx]++;
        }
        for(int i=0;i<5;i++)
        {
        	if(tmp < type[i])
        	{
        		resultID = i+1;
        		tmp = type[i];
        	}
        }
        return  resultID;
    }

}
