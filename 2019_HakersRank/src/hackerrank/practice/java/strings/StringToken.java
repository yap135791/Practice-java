package hackerrank.practice.java.strings;

public class StringToken {
	
	//https://www.hackerrank.com/challenges/java-string-tokens/problem
    public static int splitStringWithToken(String s) {
        // Write your code here.
        String [] tmp = s.replaceAll("^[ ]+","").split("[!,?._'@ ]+");
        if(tmp.length==1 && tmp[0].isEmpty())
        {
        	System.out.println(0);
        	return 0;
        }
        else
        {
            System.out.println(tmp.length);
            for(String each:tmp)
            {
                System.out.println(each);            
            }
            return tmp.length;
        }

    }
}
