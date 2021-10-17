package calculator;
import static ch.lambdaj.lambda.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringCalculator {
	
    public int add(String text) {
    	if(text.isEmpty()) {
    		return 0;
    	}
    	else if(text.contains(",")) {
    		String[]tokens =text.split(",");
    		convert(tokens,new Converter<String,Integer>() {
    			public Integer convert(String from) {
    				return toInt(from)
    			}
    		});
    		return toInt(tokens[0])+ toInt(tokens[1]);
    	}
    	else
    		return toInt(text);
    }
    private static int toInt (String text) {
    	return Integer.parseInt(text);
    }
    	

}