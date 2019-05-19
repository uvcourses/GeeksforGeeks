package leet.code;

public class PrintSequence {
	
	
	public void printSubArray(int arr[]) {
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=i;j<arr.length;j++)  {
				for(int k=i;k<=j;k++) {
					System.out.print(" "+arr[k]);
				}
				System.out.println();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSequence p=new PrintSequence(); 
		int arr [] = {1,2,3,4};
		p.printSubArray(arr);
	}

}
