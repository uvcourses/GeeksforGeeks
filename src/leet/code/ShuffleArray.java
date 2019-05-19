package leet.code;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	
	static void shuffle(int arr[],int n) {
		 
		Random r=new Random();	
		int temp =0;
		System.out.println("b Array shuffle");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) { 
			
			//System.out.println(r.nextInt(i + 1)); 
			int j=arr[r.nextInt(i + 1)];
			temp=arr[i]; 
			arr[i]=arr[j];
			arr[j]=temp;
		} 
		System.out.println("After Array shuffle");
		System.out.println(Arrays.toString(arr));
		
	}
	static void affterSuffle(int arr[],int l) {
		System.out.println("After Changing");
		for(int j=0;j<arr.length;j++) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		shuffle(arr,arr.length);
		affterSuffle(arr,arr.length);
		
		
	}

}
