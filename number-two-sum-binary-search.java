import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
		Arrays.sort(array);
    int l = 0;
		int r = array.length-1;
		while((array[l]+array[r])!=targetSum){
			if(((array[l]+array[r])>targetSum)&&(r-1)>=0){
				r--;
			}else if(((array[l]+array[r])<targetSum)&&(l+1)<=array.length-1){
				l++;
			}else{
				int[] re = {};
				return re;
			}
		}int[] re = {array[l],array[r]};	
		return re;   
  }
}
