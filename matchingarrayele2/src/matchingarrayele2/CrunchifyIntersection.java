package matchingarrayele2;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class CrunchifyIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrayOne = { 1, 4, 5, 2, 7, 3, 9 };
		Integer[] arrayTwo = { 5, 2, 4, 9, 5 };
 
		Set<Integer> crunchifySet1 = new LinkedHashSet<Integer>(Arrays.asList(arrayOne));
		Set<Integer> crunchifySet2 = new LinkedHashSet<Integer>(Arrays.asList(arrayTwo));
 
		for (Integer crunchify : crunchifySet2) {
			if (!crunchifySet1.add(crunchify)) {
				System.out.println("The duplicate element of an Array is " + crunchify);
			}
		}
	}
}
