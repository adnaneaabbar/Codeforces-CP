import java.util.Scanner;

public class Problem467A {
	
	
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
        int free = 0;
        int n = sr.nextInt();
        int p;
        int q;
		for (int i = 0; i < n; i++) {
            p = sr.nextInt();
            q = sr.nextInt();
            if((q - p)>= 2 ) free++;
        }

        System.out.println(free);
        sr.close();		
	}
}