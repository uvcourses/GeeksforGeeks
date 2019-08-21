package leet.code;


public class Palindrome {

	public boolean isPalindrome(String input) {

		int i, j;

		for (i = 0, j = input.length() - 1; i < j; i++, j--) {
			if (input.charAt(i) != input.charAt(j)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome("MadaM"));
	}

}
