package hackerrank.practice.java.strings;

public class Anagrams {

	//https://www.hackerrank.com/challenges/java-anagrams/problem
    static boolean isAnagram(String a, String b) {
        int lenAlphabet = 'z'-'a'+1;

        int [] alphabetArrA = new int[lenAlphabet];
        char [] arrA = a.toLowerCase().toCharArray();
        int lenA = a.length();

        int [] alphabetArrB = new int[lenAlphabet];
        char [] arrB = b.toLowerCase().toCharArray();
        int lenB = b.length();

        if(lenA != lenB)
            return false;

        // Complete the function
        for(char c:arrA)
        {
            alphabetArrA[c-'a']++;
        }
        for(char c:arrB)
        {
            alphabetArrB[c-'a']++;
        }
        for(int i=0;i<lenAlphabet;i++)
        {
            if(alphabetArrA[i] != alphabetArrB[i])
                return false;
        }
        return true;
    }
    
    
}
