
public class StringManipulation {

	public static void main(String[] args) {

		String str = "This is Java Learning";
		String str1 = "This is JAVA Learning";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(8));

		System.out.println(str.indexOf('J')); //1st Occurrence
		
		System.out.println(str.indexOf('J')+1); //2nd Occurrence
		
		System.out.println(str.indexOf("Java"));
		
		System.out.println(str.indexOf("Selenium")); //-1
		
		
		//String Comparison
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		
		//SubString
		System.out.println(str.substring(0, 9));
		
		//Trim
		String s = "     WebDriver     ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		String date = "29-Jan-2019";
				
				System.out.println(date.replace("-", "/"));
		
				System.out.println(date.concat("s"));
				
		

	}

}
