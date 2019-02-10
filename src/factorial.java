
public class factorial {
	
	
	public static int facto(int num)
	{
		int fct=1;
		
		if(num==0)
		
			return 1;
			
			else 
				return(num * fct(num-1));
		
	}

	public static void main(String[] args) {

			facto(8);
		

	}

}
