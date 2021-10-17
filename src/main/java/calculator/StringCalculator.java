package calculator;

class StringCalculator {

    public int add(String numbers) {
    	if(isEmpty(numbers))
        return 0;
    	return stringToInt(numbers);
    }
    public boolean isEmpty(String numbers) {
    	return numbers.isEmpty();
    }
    public int stringToInt(String numbers) {
    	return Integer.parseInt(numbers);
    }

}