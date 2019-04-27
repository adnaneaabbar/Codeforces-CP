import java.util.Scanner;

public class Problem266A {
	
	
	public static void main(String args[])
	{
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        String str = sr.next();
        int takeout = 0;
        for (int i = 0; i < n-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                takeout++;
            }
        }
        System.out.print(takeout);
        sr.close();		
	}
}