package hackerrank.algorithms.warmup;

public class TheHurdleRace {

	
	//https://www.hackerrank.com/challenges/the-hurdle-race/problem
    static int hurdleRace(int k, int[] height) {
        int max = 0;
        int potion = 0;
        for(int h:height)
            if(h>max)
                max = h;

        potion = max -k;
        if(potion<0)
            return 0;
        return potion;
    }
}
