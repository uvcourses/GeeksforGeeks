package leet.code;

public class MedianSortedArrays {
	
public double findMedianSortedArrays(int[] nums1, int[] nums2) { 
	int left =nums1.length-1;
	int right=0; 
	int arr[]=new int[10];
	
	while(nums1.length>0 || nums2.length>0) 
	{
		if(nums1[left] > nums2[right]) {
			left--;
		} else { 
			left+=1;
			int temp=nums2[right];
				nums2[right]=nums1[left];
				nums1[left]=temp; 
		}
	}
	while(nums1.length>0 || nums2.length>0) 
	{
		System.out.println(nums1);
		System.out.println(nums2);
	}	
	return 0;
        
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianSortedArrays c=new MedianSortedArrays();
		int nums1[]=  {1,3,5,7}; 
		int nums2[]= {2,4,6};
	c.findMedianSortedArrays(nums1, nums2);

}
}
