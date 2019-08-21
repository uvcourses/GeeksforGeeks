import java.util.LinkedList;
import java.util.Queue;

public class TreasureIsland {

	public static int treasureIsland(char[][] island) {int step=0;
    if(island==null || island.length==0) return 0;
    int row=island.length, col=island[0].length;
    int[] bigin = new int[]{0,0};
    int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    boolean[][] visited = new boolean[row][col];
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(bigin);
    while(!queue.isEmpty()) {
        int size = queue.size();
        while(size>0) {
            int[] coor = queue.poll();
            int x=coor[0], y=coor[1];
            if(island[x][y]=='X') {
                return step;
            }
            for(int i=0; i<directions.length; i++) {
                int dx = x+directions[i][0];
                int dy = y+directions[i][1];
                if(dx>=0 && dx<row && dy>=0 && dy<col && !visited[dx][dy] && (island[dx][dy]=='O' || island[dx][dy]=='X')) {
                    visited[dx][dy]=true;
                    queue.offer(new int[]{dx, dy});
                }
            }
            size--;
        }
        step++;
    }
    return -1;
}

	public static void main(String[] args) {
		char[][] island = new char[][]{
				{'O', 'O', 'O', 'O'},
				{'D', 'O', 'D', 'O'},
				{'O', 'O', 'O', 'O'},
				{'X', 'D', 'D', 'O'}
		};
		int result = TreasureIsland.treasureIsland(island);
		System.out.println(String.format("%s (expect 5)", result));
	}

	static class Coordinate {
		int x;
		int y;

		Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
