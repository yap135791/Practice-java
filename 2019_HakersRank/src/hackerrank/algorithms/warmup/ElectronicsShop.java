package hackerrank.algorithms.warmup;

public class ElectronicsShop {

	

    // https://www.hackerrank.com/challenges/electronics-shop/problem
	public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int spend = -1;
		int numKeyboards= keyboards.length;
		int numDrives = drives.length;
		for(int i=0;i<numKeyboards;i++)
		{
			for(int j=0;j<numDrives;j++)
			{
				int tmp = keyboards[i]+drives[j];
				if(spend < tmp && tmp <= b)
				{
					spend = tmp;
				}
			}
		}
		return spend;
    }
}
