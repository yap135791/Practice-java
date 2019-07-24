package hackerrank.algorithms.warmup;

public class BreakingTheRecords {

	
    //https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
    static int[] breakingRecords(int[] scores) {

        int [] count = new int [2];
        int highScore = scores[0];
        int lowScore = scores[0];
        for(int score:scores)
        {
            if(score > highScore)
            {
                count[0]++;
                highScore = score;
            }
            if(score < lowScore)
            {
                count[1]++;
                lowScore = score;
            }
        }

        return count;
    }
}
