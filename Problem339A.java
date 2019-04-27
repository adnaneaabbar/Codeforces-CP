import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem339A {
	
	
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
		
		String str = sr.next();
        String [] numbers = str.split("\\+");  //escaping the + when we pass by
        int [] integers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            integers[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(integers);
        String answer ="";

        for (int i = 0; i < integers.length; i++) {
            answer += integers[i];
            if(i == integers.length - 1 ) break;
            else answer += "+";
        }

        System.out.print(answer);
        sr.close();		
	}
}