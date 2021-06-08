package parallel_processing;

import java.util.Scanner;

public class Zohorecruitment2020 {

	public static void main(String args[]) {
		int middleChar = 0;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuilder str1 =  new StringBuilder();
		
		int len = str.length();
		str1.append(str.substring(len/2));
		str1.append(str.substring(0, (len/2)));
		for(int i=0; i<len; i++)
		{
			for(int j=2*(len-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++)
			{
				System.out.print(str1.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}

