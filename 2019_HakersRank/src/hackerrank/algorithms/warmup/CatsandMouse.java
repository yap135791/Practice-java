package hackerrank.algorithms.warmup;

public class CatsandMouse {

    // https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
    static String catAndMouse(int x, int y, int z) {
        int catB = Math.abs(z-y);
        int catA = Math.abs(z-x);
        if(catA==catB)
            return "Mouse C";
        else if(catA < catB)
            return "Cat A";
        else
            return "Cat B";
    }
}
