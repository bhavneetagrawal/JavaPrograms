
public class SwapTwoIntegers {

	public static void main(String[] args) {


		int x =5;
		int y=10;
		
		//1. Using third variable t
		
		int t;
		
		t=x;
		x=y;
		y=t;
		
		//2. Without Using third variable t, Using + Operator
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		//3. Without Using third variable t, Using * Operator
		
		x = x*y;
		y = x/y;
		x = x/y;
		
		
		//4. Without Using third variable t, Using ^ XOR Operator
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
