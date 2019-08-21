package leet.code;

import java.util.Arrays;

public class TruckFilling {

	public int[] filling(int[] packages, int truckSpace) {

		Arrays.sort(packages);
		int low = 0, high = packages.length - 1;
		int result[] = new int[2];
		while (low < high) {

			if ((packages[low] + packages[high]) <= (truckSpace - 30)) {
				result[0] = low;
				result[1] = high;
				low++;
			} else {
				high--;
			}

		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TruckFilling tt=new TruckFilling(); 
		int packages[]= {1,10,25,35,60};
		tt.filling(packages, 90);
	}

}
