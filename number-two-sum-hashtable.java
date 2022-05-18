import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Hashtable<Integer,Boolean> ht = new Hashtable<>();
		for(int i=0;i<array.length;i++){
				if(!ht.containsKey(targetSum-array[i])){
					ht.put(array[i],true);
				}else if(ht.containsKey(targetSum-array[i])){
					ht.put(array[i],false);
					int[] arr={array[i],targetSum-array[i]};
						return arr;
				}					
		}		
    return new int[0];
  }
}
