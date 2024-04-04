
public class P43 {

  static int findRepeating(int[]arr)
  {
	  for(int i=0; i<arr.length;i++)
	  {
		  for(int j =i; j<arr.length;j++)
		  {
			  if(arr[i] == arr[j])
				  return arr[i];
		  }
	  }
	  return -1;
		  }
  static public void main(String[] args)
  {
	  int[] arr = new int[] { 3, 5, 3, 4, 10, 5, 6};
	  int repeatingNum= findRepeating( arr);
	  System.out.println(repeatingNum);
	  
  }
}
