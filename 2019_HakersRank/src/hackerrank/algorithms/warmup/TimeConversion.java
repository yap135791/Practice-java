package hackerrank.algorithms.warmup;

public class TimeConversion {
	
	//https://www.hackerrank.com/challenges/time-conversion/problem
	public static String timeConversion(String s) {
		String []split = s.split("([:A-Z]+)");
		for(String e:split)
		{
			System.out.print(e+" ");
		}
		int hour = Integer.parseInt(split[0]);
		int min = Integer.parseInt(split[1]);
		int sec = Integer.parseInt(split[2]);
		
		if(s.contains("PM"))
		{
			hour += 12;
			if(hour==24)
				hour=12;
		}
		if(s.contains("AM")&&hour==12)
			hour=0;
		
		String answer = String.format("%02d:%02d:%02d", hour,min,sec);
		return answer;

    }


}
