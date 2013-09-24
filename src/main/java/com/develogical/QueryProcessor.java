package com.develogical;

import java.util.regex.*;

// abf614e0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20945,%20264,%2078,%2025
// which%20of%20the%20following%20numbers%20is%20the%20largest:%20875,%2093,%2027,%20223

public class QueryProcessor {

    public String process(String query) {
    	if (query.contains("which of the following numbers")) {
	    	String subquery =  query.substring(query.indexOf(':'));

	    	Pattern p = Pattern.compile("-?\\d+");
	    	Matcher m = p.matcher(subquery);

	    	int largest = -397430;

	    	while (m.find()) {
	    		int n = Integer.parseInt(m.group());

	    		if (n > largest) {
	    			largest = n;
	    		}
	    	}

	    	return Integer.toString(largest);
    	}

    	if (query.contains("what is")) {
	    	String subquery =  query.substring(query.indexOf(':'));

	    	Pattern p = Pattern.compile("-?\\d+");
	    	Matcher m = p.matcher(subquery);

	    	int sum = 0;

	    	while (m.find()) {
	    		int n = Integer.parseInt(m.group());

	    		sum += n;
	    	}

	    	return Integer.toString(sum);
    	}

        if (query.contains("programming")) {
            return "Yay, computing.";
        }
        return "";
    }
}
