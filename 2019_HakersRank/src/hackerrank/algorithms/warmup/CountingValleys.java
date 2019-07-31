package hackerrank.algorithms.warmup;

public class CountingValleys {
	
	
    // https://www.hackerrank.com/challenges/counting-valleys/problem
    static int countingValleys(int n, String s) {
        int seaLevel = 0;
        int countValley =0;
        boolean isValley=false;
        for(char c:s.toCharArray())
        {
            if(c=='U')
            {
            	seaLevel++;
            	if(isValley && seaLevel==0)
            	{
            		countValley++;
            		isValley = false;
            	}
            }
            else if(c=='D')
            {
            	seaLevel--;
            	if(seaLevel <0)
            		isValley=true;
            }
        }
        return countValley;
    }
}
