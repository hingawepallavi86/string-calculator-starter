package testdriven;

public class Calculator {
	static int count=0;

	public int calculate(String string) throws Exception {
		fuctionCall();
		String[]numbers= string.split(",|\n");
		if(string.isEmpty()) {
		   return 0;
		}
		else if(string.length()==1) {
			return Integer.parseInt(string);
		}
		else if(string.startsWith("//")) {
			return getNumbersFromDelimeter(string);
		}
		else if(string.startsWith("e")) {
			return evenAddition(string);
		}
		else {
			return stringToNum(numbers);
		}
		//return (Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]));
		
		
	}
	public int evenAddition(String string) {
		int sum=0;
		String[]num= string.split("e|,");
		for(int i =0;i<num.length;i++) {
			sum=sum+Integer.parseInt(num[i]);
		}
		return sum;
	}
	public int stringToNum(String[] numbers) throws Exception {
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			if(Integer.parseInt(numbers[i])<0) {
				throw new Exception("negative not allowed"+numbers[i]);
			}
			if(Integer.parseInt(numbers[i])>1000) {
				continue;
			}
			sum=sum+Integer.parseInt(numbers[i]);
		}
		return sum;
	}
	public int getNumbersFromDelimeter(String numbers) {
		String[]num= numbers.split("//|;|\\n");
		int sum=0;
		for(int i=0;i<num.length;i++) {
			if(!num[i].isEmpty()) {
			  int n=Integer.parseInt(num[i]);
			  sum=sum+n;
			}		
		}
		return sum;
	}
	
	public void fuctionCall() {
		count++;
		System.out.println(count);
	}
	
}
