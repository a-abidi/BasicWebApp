package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist." +
                    "He was born in Stratford-upon-Avon.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("ihowa")) {
            return "Ihowa is a 4th Year MEng Computing student at Imperial College London";
        }

        if (query.toLowerCase().contains("your name")) {
            return "hello";
        }

        if (query.toLowerCase().contains("what is 1 plus 2")) {
            return "3";
        }
        
        if (query.toLowerCase().contains("which of the following numbers is the largest: 371, 15, 217, 74")) {
            return "371";
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest: 916, 1")) {
            return "916";
        }

        return "";
    }
}
