
public class JunkValueRemove {
	
	public static void main(String[] args) {
	
		String s = "@#$$@$ Testing#@%^%$$SeleniumJava#%^^%&%   #$^&%&*&()_";
		
		
		s = s.replaceAll("[^a-zA-Z0-9]","");
			
		System.out.println(s);
		
		
		
		
	}

}
