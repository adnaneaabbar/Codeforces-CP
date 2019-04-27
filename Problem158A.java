import java.util.Scanner;

public class Problem158A {
	
	
	public static void main(String args[])
	{
        int answer = 0;
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int k = sr.nextInt();
        int [] scores = new int [n];

        for ( int i = 0 ; i < n ; i++){
            scores[i] = sr.nextInt();
        }

        for ( int i = 0 ; i < n ; i++){
            if (scores[i] >= scores[k-1] && scores[i] > 0) answer ++;
        }
    
        System.out.println(answer);
        sr.close();		
	}
}