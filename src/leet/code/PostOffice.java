package leet.code;

import java.util.Arrays;

public class PostOffice {

	 public int[][] kClosest(int[][] points, int K) {
	        
		 int result[][]=new int[K][2]; 
		 int distance[]=new int[points.length];
		 for(int i=0;i<points.length;i++) {
			 
			 distance[i]=split(points[i]);
			 
		 }
		 
		 Arrays.sort(distance);
		 
		 int dist=distance[K-1];
		 int t=0;
		 for(int j=0;j<points.length-1;j++) { 
			 if(split(points[j]) <= dist)
			 result[t++] = points[j];
		 }
		 return result;
	    } 
	 
	 public int split(int a[] ) { 
		 
		 return a[0] * a[0] + a[1]*a[1];
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostOffice pp=new PostOffice();
		int points[][]= { {-16,5},{-1,2}, {4,3} , {10,-2}, {0,3}, {-5,-9}};
		pp.kClosest(points, 3);
	}

}
