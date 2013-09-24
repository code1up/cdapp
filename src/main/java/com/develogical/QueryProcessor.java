package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("programming")) {
            return "Computer computing.";
        }
        return "";
    }
}
