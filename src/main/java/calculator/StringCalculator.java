package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class StringCalculator {
	int count=0;
	
    public int add(String numbers) throws Exception {
    	AddCalled();
    	if(numbers.isEmpty()) {
    		return 0;
    	}
    	else {
    		int tokens =tokenize(numbers);
    		return tokens;
    	}
    }
    
    private static int tokenize(String text) throws Exception {
    	String[]tokens;
    	if(text.startsWith("//")) {
    		Matcher m=Pattern.compile("^//(.+?)\\n(.*)$").matcher(text);
    		m.matches();
    		String customDelimiter=m.group(1);
    		String numbers=m.group(2);
    		 tokens= numbers.split(customDelimiter);
    	}else {
    		tokens=text.split(",|\n");
        	for(String cur: tokens) {
        		if(toInt(cur)<0) {
        			throw  new Exception("negatives not allowed"+cur);
        		}
        	}
    	}
    	
    	int sum=0;
    	for(String cur: tokens) {
    		if(toInt(cur)>1000) {
    			continue;
    		}
    		sum+=Integer.parseInt(cur);
    	}
    	return sum;
    }
    
    private static int toInt(String text) {
    	return Integer.parseInt(text);
    }
    private int AddCalled() {
    	count++;
    	return count;
    }
    	

}