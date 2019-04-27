import java.util.Scanner;

public class Problem231A {
	
	
	public static void main(String args[])
	{
        Scanner sr = new Scanner(System.in);
        int solve = 0;
        int capacity = 0;
        int n = sr.nextInt();
        for (int i = 0; i < n; i++) {
            capacity = 0;
            for (int j = 0; j < 3; j++) {
                if(sr.nextInt() == 1) capacity ++;
            }
            if (capacity >= 2) solve++;
        }
        System.out.print(solve);
        sr.close();
    }
}	