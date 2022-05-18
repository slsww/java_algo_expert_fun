import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    	int array_index = 0;
			int sequence_index = 0;
		while(array_index<array.size() && sequence_index<sequence.size()){
			if(array.get(array_index).equals(sequence.get(sequence_index))){
				sequence_index ++;
			}
				array_index++;
		}
    return sequence_index==sequence.size();
  }
}
