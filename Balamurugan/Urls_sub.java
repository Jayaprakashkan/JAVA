import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Urls_sub {
	
	/*
	private static final String URL_REGEX =
			"^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))" +
			"(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)" +
			"([).!';/?:,][[:blank:]])?$";

	private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);    */
	
	// split the string and return 
	public String[] splitString(String urls, String variable) {
		
		String[] result = urls.split(variable);
		return result;
	}
   
	// remove duplicates and validate URLs
	public void addOrSkip(ArrayList<String> list, String url) {
		
		if((!(list.contains(url))) && /* (validatorOfUrl(url)) */ (url.startsWith("https")||url.startsWith("http"))) {
			list.add(url);
		}		
	}
	
	public ArrayList<String> removeHttps(ArrayList<String> list1){
		
		ArrayList<String> r = new ArrayList<String>();
		
		for(String url1 : list1) {
			
			if(url1.startsWith("https://")) {
				r.add(url1.replace("https://", ""));
			}
			
			else if(url1.startsWith("http://")) {
				r.add(url1.replace("http://", ""));
			}
			
		}
	  return r;
	}
	
	
	// validation of URls using regex
	/*
	public boolean validatorOfUrl(String url) {

		if (url == null) {
			return false;
		}

		Matcher matcher = URL_PATTERN.matcher(url);
		return matcher.matches();
	}
	*/
	
}
