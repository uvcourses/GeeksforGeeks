package leet.code;

import java.util.Arrays;

public class NegativeEnd {

	
	static void arrange(int arr[] , int size) {
		
		int out[]=new int[size];
		int j=size-1;
		int i=0;
		int low=0,high=size-1;
		while(i<size) {
			
			if(arr[i] <0) {
				out[low++]=arr[i];
				i++;
			}
			else  {
				out[high--]=arr[i];
				j--;
				i++;
			}
		}
		
		System.out.println(Arrays.toString(out));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
      arrange(arr,arr.length);
	}

}
