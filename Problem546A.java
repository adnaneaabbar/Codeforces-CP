import java.util.Scanner;

public class Problem546A {
	
	
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
        int borrow;
        int cost =0;
		int k = sr.nextInt();
		int n = sr.nextInt();
		int w = sr.nextInt();
        for (int i = 1; i <= w; i++) {
            cost += k*i;
        }
        borrow = cost - n;
        if(borrow < 0) System.out.print(0);
        else System.out.println(borrow);
        sr.close();		
	}
}