package calculator;

import java.util.regex.Matcher;
import java.util.List;
import java.util.regex.Pattern;


class StringCalculator {
	
    public int add(String text) {
    	if(text.isEmpty()) {
    		return 0;
    	}
    	else {
    		int tokens =tokenize(text);
    		return tokens;
    	}
    }
    private static int tokenize(String text) {
    	if(text.startsWith("//")) {
    		Matcher m=Pattern.compile("//(.)\n(.*)").matcher(text);
    		m.matches();
    		String customDelimiter=m.group(1);
    		String numbers=m.group(2);
    		String[] tokens= numbers.split(customDelimiter);
    		int sum=0;
        	for(int index=0;index<tokens.length;index++) {
        		sum+=Integer.parseInt(tokens[index]);
        	}
        	return sum;
    	}
    	String[]tokens=text.split(",|\n");
    	int sum=0;
    	for(int index=0;index<tokens.length;index++) {
    		sum+=Integer.parseInt(tokens[index]);
    	}
    	return sum;
    }
    
    private static int toInt (String text) {
    	return Integer.parseInt(text);
    }
    	

}