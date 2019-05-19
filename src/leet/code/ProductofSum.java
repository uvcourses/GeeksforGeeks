package leet.code;

public class ProductofSum { 
	
	
	public void product() {
		int arr[]= {10,3,5,6,2}; 
		int prod =1;
		int result[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
                    prod*=arr[j];					
				}
			} 
		
			result[i]=prod;
			prod=1;
		} 
		for(int k=0;k<result.length;k++) {
			System.out.println(result[k]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductofSum pp=new ProductofSum();
		pp.product();
	}

}
