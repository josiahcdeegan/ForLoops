package ForLoops;

public class ForLoops3 {
	public static void main(String[] args) {
	      

		int value = 12345;
		
		int sum = 0;
		String strValue = Integer.toString(value);

		for(int i = 0; i < strValue.length(); i++) {
			char ch = strValue.charAt(i);

			String s = Character.toString(ch);

			int digit = Integer.parseInt(s);
			
			sum += digit;
			
		}
			System.out.println(sum);
		
	}}