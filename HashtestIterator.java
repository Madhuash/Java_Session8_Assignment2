import java.util.HashSet;
import java.util.Iterator;
	 
public class HashtestIterator {
	
	
	    public static void main(String a[]){
	        HashSet<String> hs = new HashSet<String>();
	        //add elements to HashSet
	        hs.add("One");
	        hs.add("Two");
	        hs.add("Three");
	        Iterator<String> itr = hs.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	    }
}
