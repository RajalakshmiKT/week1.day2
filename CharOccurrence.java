package week1.day2;

public class CharOccurrence {
	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		char ocr = 'e';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ocr)
			{
				count++;
				
			}
		}
			System.out.println("The appearence of the character 'e' in the given string:" + str + " is " +count);
				
			
			
		
	}

}
