import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		String currentWinner="";
		int i = 1;
		Hashtable<String,Integer>ht=new Hashtable<>();
    		for(ArrayList<String> group:competitions){
					if(results.get(competitions.indexOf(group))==0){
						currentWinner = group.get(1);
						if(ht.containsKey(currentWinner)){
							ht.put(currentWinner,(ht.get(currentWinner)+1));
						}else{
							ht.put(currentWinner,i);
						}
					}else{
						currentWinner = group.get(0);	
						if(ht.containsKey(currentWinner)){
							ht.put(currentWinner,(ht.get(currentWinner)+1));
						}else{
							ht.put(currentWinner,i);
						}
					}
				}for(Map.Entry<String,Integer> element:ht.entrySet()){
					if(element.getValue()==Collections.max(ht.values())){
						currentWinner = element.getKey();
					}
				}
		return currentWinner;
  }
}
//how to seperately update the values of different keys in a hashmap? here you go.
