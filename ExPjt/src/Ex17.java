import java.util.*;

public class Ex17 {

	public static void main(String[] args) {
		String[] arr = { "1", "2", "9", "7", "4", "6", "1", "7", "0" };
		Set<String> set = new HashSet<String>();
		for(String s : arr){
			set.add(s);
		}
		
		List<String> list = new LinkedList<String>(set);
		Collections.sort(list);
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	

}
