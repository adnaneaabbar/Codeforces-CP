import java.util.Scanner;

public class Problem282A {
	
	public static boolean bitland(String input) {
        if(input.charAt(0) == '+' || input.charAt(2) == '+' ) return true;
        return false;
    }

	public static void main(String args[])
	{
        int answer = 0;
		Scanner sr = new Scanner(System.in);
		
		int n = sr.nextInt();
		for (int i = 0; i < n; i++) {
            if ( bitland(sr.next())) answer++;
            else answer--;
        }
		
        System.out.println(answer);
        sr.close();		
	}
}