package leet.code;

public class SplitArray {
	
	public void rotate(int ar[],int low,int high) {
		
		int i=low,j=high; 
		int k=3; 
		swap(ar,low,high); 
		swap(ar,low,(high-k)); 
		swap(ar,(high-k)+1,high);
		
		
	}
	public void swap(int arr[],int i,int j) { 
		
		while(i<j) {
			int temp=arr[i]; 
			arr[i]=arr[j];
			arr[j]=temp; 
			i++;
			j--;
		}
		
	}
	
	void print(int arr[]) { 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int arr[]= {12,10,5,6,52,36}; 
		SplitArray ss=new SplitArray(); 
		ss.rotate(arr, 0, arr.length-1);
ss.print(arr);
	}

}
