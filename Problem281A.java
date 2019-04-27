import java.util.Scanner;

public class Problem281A {
	
	
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
        String str = sr.next();
        
		str = Character.toString(str.charAt(0)).toUpperCase() + str.substring(1);
        System.out.print(str);
        sr.close();		
	}
}