import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {


		String names[] = {"Java", "Python", "Ruby", "Perl", "Java"};
		
		//1. Compare each element
		
		for(int i=0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate name is::"+names[i]);
				} 
			}
		}
		
		
		//2. Using HashSet
		
		Set<String> store = new HashSet<String>();
		for(String name : names)
		{
			if(store.add(name)==false) {
				System.out.println("Duplicate Element is::"+name);
			}
		}
		

	}

}
