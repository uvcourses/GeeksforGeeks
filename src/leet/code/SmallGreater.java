package leet.code;

import java.util.Arrays;

public class SmallGreater { 
	
	static void reArrange(int arr[],int size) { 
		
		for(int i=0;i<size-1;i++) 
		{
			if(i==size-1) 
				break;
			if(  (i%2==0) && (arr[i] >arr[i+1])) {
				int temp=arr[i];
				arr[i]= arr[i+1];
				arr[i+1]=temp;
			} 
			else if((i%2!=0) && (arr[i] <arr[i+1])) {
				int temp=arr[i];
				arr[i]= arr[i+1];
				arr[i+1]=temp;
			} 
			
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {6, 4, 2, 1, 8, 3};
reArrange(arr,arr.length);

	}

}
