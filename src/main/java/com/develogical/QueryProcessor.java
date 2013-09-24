package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("programming")) {
            return "Yay, computing.";
        }
        return "";
    }
}
