package leet.code;

public class Diagonal { 
	
	
	static void diagonalSquare(int mat[][],int n) {
		
		
		for(int i=0;i<n;i++) 
		{
			System.out.print(mat[i][i]*mat[i][i] + ",");
		}
		System.out.println("");
		for(int j=0;j<n;j++) {
			System.out.print(mat[j][n-j-1] * mat[j][n-j-1] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = { 
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
        diagonalSquare(mat, mat.length);
	}

}
