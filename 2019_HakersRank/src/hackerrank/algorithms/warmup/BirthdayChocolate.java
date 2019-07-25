package hackerrank.algorithms.warmup;

import java.util.List;

public class BirthdayChocolate {
	
	//https://www.hackerrank.com/challenges/the-birthday-bar/problem
    static int birthday(List<Integer> s, int d, int m) {
    	int count =0;
        
        for(int i=0;i<s.size();i++)
        {
        	int sum =0;
        	for(int j=0;j<m && (i+j)<s.size();j++)
        	{
        		sum+= s.get(i+j);
        	}
        	if(sum == d)
        		count++;
        }
        return count;
        

    }

}
