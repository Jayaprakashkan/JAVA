/**
 * @author JAYAPRAKASH K
 * @mail jayaprakash_k1@dell.com
 * @seat ws244(zonasha, Bangalore)
 *
 */

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
     
	Scanner in = new Scanner(System.in);
	System.out.println("....WELCOME TO FINDING ANAGRAMS.....");
	
	// get initial length of the array
	System.out.println("Enter the length of initial array : ");
	int length_of_words = in.nextInt();
	ArrayList<String> initial_array = new ArrayList<String>();
	
	// get elements from user and add it to the list after converting into lowercase 
	for(int i = 0; i < length_of_words ; i++) {
		System.out.println("Enter String " + (i + 1) + " : ");
		// trim to remove white spaces 
		initial_array.add(((in.next()).toLowerCase().trim()));
	  }	
    // ArrayList for checking purpose
	ArrayList<String> checked = new ArrayList<String>();
	
	// variable for storing strings
	String one = "";
	String two = "";
	
	// variables for storing ascii values 
	int val1 = 0;
	int val2 = 0;
	
	// array list for storing final result, this will store the elements with type of arraylist
	ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
	
	// array list for storing anagrams (inner list)
	ArrayList<String> temp_result = new ArrayList<String>();
	
	// iteration of each string 
	for(int i = 0; i < length_of_words - 1; i++) {	
		
		// if not present in checked list check the element 
		if(!(checked.contains(initial_array.get(i)))) {
			temp_result.add(initial_array.get(i));
			checked.add(initial_array.get(i));
			
	     	// iterate over remaining elements with the previous element
	     	for(int j = i + 1; j < length_of_words; j++) {	
	     		// get previous element
				one = initial_array.get(i);
				// get current element 
				two = initial_array.get(j);		
				// if both length of the both element is same 
				if(one.length() == two.length()) {
					val1 = 0;
					val2 = 0;
					// calculate the ascii value of previous
					for(int z = 0; z < one.length(); z++)
					{
						val1 = val1 + (int) one.charAt(z);
					}
					// calculate the ascii value of current
					for(int z1 = 0; z1 < two.length(); z1++)
					{
						val2 = val2 + (int) two.charAt(z1);
					}
					// both ascii values are same then anagram
					if(val1 == val2) {
						temp_result.add(two);
						checked.add(two);
					}
				}
	     	}
           // once iteration over store the anagrams to result
		   result.add((ArrayList<String>) temp_result.clone());
		   // clear inner list
		   temp_result.clear();
    	}
    	}
	    // check for last element 
	    if(!(checked.contains(initial_array.get(length_of_words - 1)))){
	    	ArrayList<String> last_ele = (new ArrayList<String>());
	    	last_ele.add(initial_array.get(length_of_words - 1));
	    	result.add(last_ele);
	    }
	    
		System.out.println(result);	
	}
}
