package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String val = "madam";
		String rev = "";
		int j = val.length();
		for (int i = j-1; i >= 0; i--) {
			rev = rev + val.charAt(i);
		}
			if (val.equalsIgnoreCase(rev)) {
				System.out.println("It is a Palindrome");
				
			}
			else 
				System.out.println("It is not a Palindrome");
			
		}
	}


