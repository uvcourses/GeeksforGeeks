package leet.code;

import java.util.Arrays;

public class FlightMovie {

	public int[] pairofMovie() {
		int movie[] = { 90, 85, 75, 60, 120, 150, 125 };
		int Target = 220;
		int result[] = { -1, -1 };
		Arrays.sort(movie);
		int L = 0, R = movie.length - 1;
		while (L < R) {
			if ((movie[L] + movie[R]) <= Target) {
				result[0] = movie[L];
				result[1] = movie[R];
				L++;
			} else if ((movie[L] + movie[R]) > Target) {
				R--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightMovie p = new FlightMovie();
		p.pairofMovie();
	}
}
