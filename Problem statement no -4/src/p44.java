import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class p44 {

	public static void findCombination(int[] A, int i ,int k, Set<List<Integer>> subarrays,List<Integer>out) 
		{
			if (A.length == 0 || k> A.length) {
				return;
			}
			if(k==0)
			{
				subarrays.add(new ArrayList<>(out));
				return;
			}
			for (int j=i; j<A.length ; j++)
			{
				out.add(A[j]);
				findCombination(A, j+1 ,k-1, subarrays, out);
				out.remove(out.size() -1);
			}
		}

		public static Set<List<Integer>> findCombination(int[] A, int k)
		
		{
			Set<List<Integer>> subarray= new HashSet<>();
			findCombination(A,0, k, subarray, new ArrayList<>());
			return subarray;
		}
		public static void main (String[]args)
		{
			int[] A= {1,2,3};
			int k = 2;
			System.out.println(findCombination(A, k));
		}
	


}