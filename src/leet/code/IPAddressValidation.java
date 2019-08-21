
public class IPAddressValidation {
	 public String defangIPaddr(String address) {
	        
		StringBuilder result=new StringBuilder();  
		String input[]=address.split(".");
		 for(String str:input) {
			 result.append(str+"[.]");
		 }
		 System.out.println(result.toString());
		 
		 return result.toString();
		 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPAddressValidation ip=new IPAddressValidation();
		String address = "255.100.50.0";
		ip.defangIPaddr(address);
	}

}
