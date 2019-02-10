
public class ReverseString {

	public static void main(String[] args) {
		
		
		String s = "selenium";
		
		//Using FOR loop
		
		int len = s.length();
		String rev = "";
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		
		//Using StringBuffer
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.reverse());
		
		
		
		
	}
	
	
	


}
