package calculator;

class StringCalculator {
	public final String delimeter=",|\n";

    public int add(String numbers) {
    	String[]input=numbers.split(delimeter);
    	if(isEmpty(numbers))
        return 0;
    	else if(input.length>1) {
    		return sumOfTwo(input);
    	}
    	return stringToInt(numbers);
    }
    public int sumOfTwo(String[] input) {
    	int sum=0;
    	for(int index=0;index<input.length;index++) {
    		sum+=Integer.parseInt(input[index]);
    	}
    	return sum;
    }
    
    public boolean isEmpty(String numbers) {
    	return numbers.isEmpty();
    }
    public int stringToInt(String numbers) {
    	return Integer.parseInt(numbers);
    }

}