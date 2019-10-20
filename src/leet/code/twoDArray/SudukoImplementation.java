import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SudukoImplementation {

	public boolean isValidSuduko(List<List <Integer>> partialSuduko) { 
		
		for(int i=0;i<partialSuduko.size();i++) {
			if( isDuplicate(partialSuduko, i, i+1, 0, partialSuduko.size())) {
				return false;
			}
		}
		
		for(int j=0;j<partialSuduko.size();j++) {
			if(isDuplicate(partialSuduko, 0, partialSuduko.size(), j, j+1)) {
				return false;
			}
		}
		
		int regionSize=(int) Math.sqrt(partialSuduko.size());
		for(int I=0;I<regionSize;I++) {
			for(int J=0;J<regionSize;J++) {
			if(isDuplicate(partialSuduko,regionSize*I,regionSize*(I+1),regionSize * J,regionSize * (J+1)) ) {
				return false;
			}
			}
		}
		
		return true;
		
	}

	public boolean isDuplicate(List<List<Integer>> partialSuduko, int startRow, int endRow, int startCol, int endCol) {

		List<Boolean> isPresent = new ArrayList<Boolean>(Collections.nCopies(partialSuduko.size() + 1, false));

		for (int i = startRow; i < endRow; i++) {
			for (int j = startCol; j < endCol; j++) {

				if (partialSuduko.get(i).get(j) != 0 && isPresent.get(partialSuduko.get(i).get(j))) {
					return true;
				} else {
					isPresent.set(partialSuduko.get(i).get(j), true);
				}
			}
		}

		return false;
	}

	public static List<List<Integer>> prePareInout(int [][] input) {
		
		List<List<Integer>> partialSuduko = new ArrayList<List<Integer>>();;
		
		for(int i=0;i<input.length;i++) { 
			List<Integer> each=null;
			each=new ArrayList<Integer>();
			for(int j=0;j<input.length;j++) { 
				each.add(input[i][j]);
			} 
			partialSuduko.add(each); 
			each=null;
			
		}
		
		return partialSuduko;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		List<List<Integer>> partialSuduko = null;// =new List<ArrayList<Integer>> (); 
		
		SudukoImplementation s=new SudukoImplementation();  
		
		/*
		 * int[][] board = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0
		 * }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 }, { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0,
		 * 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 }, { 0, 6, 0, 0, 0, 0, 2, 8,
		 * 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		 */
		int[][] board = {
				  { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
				  { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
				  { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
				  { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
				  { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
				  { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
				  { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
				  { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
				  { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
				};
		
		
	System.out.println(	s.isValidSuduko(prePareInout(board)));;

	}

}
