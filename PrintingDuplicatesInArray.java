package week1.day2;

public class PrintingDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		System.out.println("Duplicate Elements in Given Array :");
		for (int count = 0; count < arr.length; count++) 
		{
			for (int i = count + 1; i < arr.length; i++)
			{
				if (arr[count] == arr[i]) {
					System.out.println(arr[i]);
				}

			}
		}
	}

}
