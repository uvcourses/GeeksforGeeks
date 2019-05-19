package leet.code;

public class Solution {
	static ListNode firsthead, secondHead;

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode n = l1;
		ListNode n1 = l2;
		int r = 0;
		int carry=0;
		ListNode result = null;
		ListNode dummyHead = new ListNode(0);
		result=dummyHead;
		while (n != null || n1!=null) {
			
			int x=(n!=null) ? n.val:0; 
			int y=(n1!=null)? n1.val:0; 
			int sum=x+y+r;
			carry=sum%10;
			 r=sum/10;
			ListNode myresult = new ListNode(carry);
			
				result.next=myresult;
				result=result.next;
			
			if(n!=null) n = n.next;
			if(n1!=null)n1 = n1.next;
			
		}
		
		if(r>0) {
			result.next= new ListNode(r);
			
		//	result=result.next;
		}
		
		printData(dummyHead.next);
		
		return dummyHead.next;
	}
	
	public static void printData(ListNode l1) {
		while (l1 != null) {
			System.out.println(l1.val);
			l1=l1.next;
		}
	}
	public static void main(String arg[]) {

		ListNode first = new ListNode(2);

		ListNode second = new ListNode(4);
		ListNode third = new ListNode(3);

		Solution s = new Solution();
		firsthead = first;
		first.next = second;
		second.next = third;

		ListNode fourth = new ListNode(5);

		ListNode fifth = new ListNode(6);
		ListNode sixth = new ListNode(4);

		Solution s1 = new Solution();

		secondHead = fourth;
		fourth.next = fifth;
		fifth.next = sixth;

		addTwoNumbers(firsthead, secondHead);

	}

}
