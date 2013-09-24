package com.develogical;

// which%20of%20the%20following%20numbers%20is%20the%20largest:%20875,%2093,%2027,%20223

public class QueryProcessor {

    public String process(String query) {

    	if (query.contains("which of the following numbers")) {
	    	Pattern p = Pattern.compile("-?\\d+");

	    	Matcher m = p.matcher(query);
	    	int largest = -39743;

	    	while (m.find()) {
	    		int n = Integer.parseInt(m.group());

	    		if (n > largest) {
	    			largest = n;
	    		}
	    	}

    	}

        if (query.contains("programming")) {
            return "Yay, computing.";
        }
        return "";
    }
}
