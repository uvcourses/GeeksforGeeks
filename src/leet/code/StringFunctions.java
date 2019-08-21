
public class StringFunctions {

	public void stringFunctions(String input1,String input2) {
		
		System.out.println(input1.charAt(3));
		System.out.println(input1.contains("Hello"));
		System.out.println(input1.concat("Welcome"));
		System.out.println(input1.indexOf("Hello"));
		System.out.println(input1.indexOf('H'));
		System.out.println(input1.indexOf('l', 2));
		System.out.println(input1.lastIndexOf("welcome"));
		System.out.println(input1.lastIndexOf('H', 2));
		System.out.println(input2.compareTo("Hello"));
		System.out.println(input1.toCharArray());
		System.out.println(input1.substring(5));
		System.out.println(input1.substring(0, 3));
		System.out.println(input1.endsWith("welcome"));
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFunctions s=new StringFunctions(); 
		s.stringFunctions("Hello world", "Welcome");
	}

}
