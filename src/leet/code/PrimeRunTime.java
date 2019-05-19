package leet.code;

public class PrimeRunTime {

	boolean isPrime(int n)
	{
		for(int x=2;x*x <=n;x++) { 
			if(n%x==0) {
			return false; 
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeRunTime p=new PrimeRunTime(); 
		System.out.println(p.isPrime(33));
	}

}
