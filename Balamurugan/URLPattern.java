import java.util.*;

public class URLPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Urls_sub val = new Urls_sub();
		
		// read input 
		String urls = in.next();
		
		// split into array (,)
		String[] splittedUrls = val.splitString(urls, ",");
		
		// remove duplicate and valiadate URLs
		ArrayList<String> listOfUrls = new ArrayList<String>();
		for(String url : splittedUrls ) {
			
			val.addOrSkip(listOfUrls, url);
		}
		
		// print splitted URLs
		for(String eachUrl : listOfUrls)
			System.out.println(eachUrl);
		
		// remove https	
		ArrayList<String> list1 = val.removeHttps(listOfUrls);		
		
		// print URLs after removed https
		for(String eachUrl1 : list1)
			System.out.println(eachUrl1);

	}

}
