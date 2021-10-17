package calculator;

class StringCalculator {

    public int add(String numbers) {
    	String[]input=numbers.split(",");
    	if(isEmpty(numbers))
        return 0;
    	else if(input.length>1) {
    		return sumOfTwo(input[0],input[1]);
    	}
    	return stringToInt(numbers);
    }
    public int sumOfTwo(String num1,String num2) {
    	return Integer.parseInt(num1)+Integer.parseInt(num2);
    }
    
    public boolean isEmpty(String numbers) {
    	return numbers.isEmpty();
    }
    public int stringToInt(String numbers) {
    	return Integer.parseInt(numbers);
    }

}