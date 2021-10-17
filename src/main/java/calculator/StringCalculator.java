package calculator;

class StringCalculator {

    public int add(String numbers) {
    	String[]input=numbers.split(",");
    	if(isEmpty(numbers))
        return 0;
    	else if(input.length>1) {
    		return Integer.parseInt(input[0])+Integer.parseInt(input[1]);
    	
    	}
    	return stringToInt(numbers);
    }
    public boolean isEmpty(String numbers) {
    	return numbers.isEmpty();
    }
    public int stringToInt(String numbers) {
    	return Integer.parseInt(numbers);
    }

}