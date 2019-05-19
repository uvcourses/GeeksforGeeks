package leet.code;

import java.util.Arrays;

public class multiplication {

	static void mul(int arr[]) {
		int i = 0, j = 0,previous=1,last=1;
		int result[]=new int[arr.length];
		for (i = 0, j = arr.length - 1; i <= j;) {
         
			if(i==j) {
				arr[i]=previous*last;
				break;
			}
			
			if (i == 0) {
				previous=arr[i];
				arr[i] = arr[i] * arr[i + 1];
				
				i++;
			} else {
				
				arr[i] = previous * arr[i + 1];
				previous=arr[i];
				i++;
			}

			if (j == arr.length - 1) {
				last=arr[j];
				arr[j] = last * arr[j - 1];
				j--;
			} else { 
				
				arr[j] = last * arr[j - 1];
				last= arr[j];
				j--;
			}

		}
		
	System.out.println(" " + Arrays.toString(arr));

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 4, 5, 6,1};
		
		mul(arr);
		
	}

}
