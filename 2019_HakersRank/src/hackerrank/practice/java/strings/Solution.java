package hackerrank.practice.java.strings;
public class Solution {

	//https://www.hackerrank.com/challenges/java-substring/problem
    public static String getSmallestAndLargest(String s, int k) {
        int len = s.length()-k+1;
        String []list = new String[len];
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<len;i++)
        {
            String tmp = new String(s.substring(i,i+k));
            System.out.print(tmp+" ");
            list[i] = tmp;
            if(i==0)
            {
                smallest = list[0];
                largest = list[0];
            }
            else
            {
                if(smallest.compareTo(list[i])>0)
                    smallest = list[i];
                if(largest.compareTo(list[i])<0)
                    largest = list[i];
            }
        }
        return smallest + "\n" + largest;
    }


}