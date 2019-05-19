package leet.code;

public class ReverseDigit {

public int reverse(int x) {
	 
	int reverse=0;
	//int pop=0;
	while(x!=0) {
		int pop=x%10;
		x/=10;
		
		if(reverse>Integer.MAX_VALUE/10 || (reverse==Integer.MAX_VALUE/10 && pop>7)) return 0;
		if(reverse<Integer.MIN_VALUE/10 || (reverse==Integer.MIN_VALUE/10 && pop<-8)) return 0;
		reverse=reverse*10+pop;
	}
	return reverse;
        
    }
public int reversing(int x) {
    int rev = 0;
    while (x != 0) {
        int pop = x % 10;
        x /= 10;
        if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        rev = rev * 10 + pop;
    }
    System.out.println(rev);
    return rev;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDigit rr=new ReverseDigit();
		//rr.reverse(901000);
		rr.reversing(1534236469);
	}

}
