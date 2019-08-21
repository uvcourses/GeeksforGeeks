package leet.code;

import java.util.LinkedList;
import java.util.Queue;

public class TreasureHunt {

	char[][] path = { { 'O', 'O', 'O', 'O' }, { 'D', 'O', 'D', 'O' }, { 'O', 'O', 'O', 'O' }, { 'X', 'D', 'D', 'O' } };

	public int minimumSteps() {

		Queue<int[]> dist = new LinkedList();
		int direction[][] = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

		dist.add(new int[] { 0, 0 });
		path[0][0] = 'D';
		for(int steps=1;!dist.isEmpty();steps++) {
			for (int size = 0; size<dist.size(); size++) {
				int p[] = dist.poll();
				
				for (int dir[] : direction) { 
					
					int x = p[0] + dir[0];
					int y = p[1] + dir[1]; 
					
			
					if (isSafe(x, y)) { 
						
						if (path[x][y] == 'X')
							return steps; 
						
						dist.add(new int[] { x, y });
						path[x][y] = 'D';
					}
				}
			}
		}
		return -1;

	}

	private boolean isSafe(int r, int c) {

		if (r >= 0 && c >= 0 && r <path.length && c <path[0].length && path[r][c] != 'D') {
			return true;
		}
		return false;
	}

	private class Points {
		int r, c;

		Points(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreasureHunt t = new TreasureHunt();
		System.out.println(t.minimumSteps());

	}

}
