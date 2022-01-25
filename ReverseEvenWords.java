package week1.day2;

public class ReverseEvenWords {
public static void main(String[] args) {
	String test = "I am a software tester"; 
	String[] str = test.split(" ");
	String val = "";
	for (int i = 0; i < str.length; i++)
	{
		if (i % 2 == 1) 
			val = val + new StringBuilder(str[i]).reverse().toString() + " " ;
			else 
				val = val + str[i] + " " ; 
			
			
	}
		
		val = val.trim();	
	
	
	System.out.println(val);
}
}
