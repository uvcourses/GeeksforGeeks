package leet.code;


public class RollDice {
	public int solution(int[] dices) {
		int res = dices.length * 2;
		int[] count = new int[6];
		for (int dice : dices) {
			count[dice - 1]++;
		}
		for (int i = 0; i < 6; i++) {
			res = Math.min(res, count[5 - i] + dices.length - count[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RollDice rr=new RollDice(); 
		int dices[]= {1,2,3};
		System.out.println(rr.solution(dices));
	}

}
