import java.util.Scanner;

public class Problem116A {


	public static void main(String args[])
	{
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();

        int currentCapacity;
        int maxCapacity;
		int a = sr.nextInt();
        int b = sr.nextInt();
        currentCapacity = b;
        maxCapacity = currentCapacity;

		for (int i = 0; i < n-1; i++) {
            a = sr.nextInt();
            b = sr.nextInt();
            currentCapacity = currentCapacity + (b - a);
            if (maxCapacity <= currentCapacity) maxCapacity = currentCapacity;
        }

        System.out.println(maxCapacity);
        sr.close();		
	}
}