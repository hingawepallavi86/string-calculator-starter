package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.isEmpty())
        return 0;
    	return stringToInt(input);
    }
    public int stringToInt(String input) {
    	return Integer.parseInt(input);
    }

}