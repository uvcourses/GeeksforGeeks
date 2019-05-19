package leet.code;

import java.util.Arrays;

public class PostiveAndNegative {

	
	static void swap(int arr[],int size) {
		int postive=0,negative=1;
		
		while(true) {
		while(postive<size && arr[postive]>=0) {
			postive+=2;
		}
		while(negative<size && arr[negative]<=0) {
			negative+=2;
		} 
		
		if(postive<size && negative <size) {
			int temp=arr[postive];
			arr[postive]=arr[negative]; 
			arr[negative]=temp;
		} else {
			break;
		}
		
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10}; 
	    int n = arr.length; 
        swap(arr,n);
	}

}
