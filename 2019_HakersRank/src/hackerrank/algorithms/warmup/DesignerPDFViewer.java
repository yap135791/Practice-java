package hackerrank.algorithms.warmup;

public class DesignerPDFViewer {
	
	//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
    // Complete the designerPdfViewer function below.
    public static int designerPdfViewer(int[] h, String word) {
        int max =0;
        int idx;
        for(char c:word.toCharArray())
        {
            idx = c - 'a';
            if(max < h[idx])
                max = h[idx];
        }

        return max*word.length();


    }


}
