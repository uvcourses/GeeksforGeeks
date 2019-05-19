package leet.code;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixManipulation {
	
	
	static void changeMatrix(int mat[][],int n,char dir) {
		
		
		
		for(int i=0;i<n;i++) {
			
			ArrayList<Integer> V=new ArrayList<Integer>();
			ArrayList<Integer> W=new ArrayList<Integer>();
			
			for(int j=0;j<n;j++) {
				if(mat[i][j]!=0) 
					V.add(mat[i][j]);
			}
			
			
			for(int k=0;k<V.size();k++) {
				if(k<V.size()-1 && V.get(k) == V.get(k+1)) {
					W.add(2*V.get(k));
					k++;
				}
				else 
					W.add(V.get(k));
			}
			
			
			for(int L=0;L<n;L++) {
				mat[i][L]=0;
			}
			
			
			
			for(int M=0;M<W.size();M++) {
				
				mat[i][M] = W.get(M);
			}
			
			
		}
		
		System.out.println(Arrays.toString(mat));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = { 
				{32,3,3},
				{0,0,1},
				{10,10,8}
		};
		changeMatrix(mat, mat.length, 'l');
	}

}
