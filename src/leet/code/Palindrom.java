package leet.code;

public class Palindrom {
public boolean isPalindrome(int x) {
    boolean result=false;   
    
    if(Integer.signum(x) ==-1)
    {
    	return false;
    }
    
	int temp=x; 
	int rev=0;
	while(x!=0) {
	int pop=x%10; 
	x/=10;
	rev=rev*10+pop;
	}
    
	if(temp==rev) 
		result=true;
    
	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom p=new Palindrom();
		p.isPalindrome(-121);
	}

}
