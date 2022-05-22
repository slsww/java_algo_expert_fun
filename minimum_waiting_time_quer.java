import java.util.*;

class Program {
 
  public int minimumWaitingTime(int[] queries) {
	 Arrays.sort(queries);

		int totaltime = 0;
   for(int i=0;i<queries.length;i++){
		 int duration = queries[i];
		 int qleft = queries.length - (i+1);
		 totaltime = totaltime + duration*qleft;
	 }
    return totaltime;
  }
}
