import java.util.Scanner;

public class Problem50A {
    
    public static int dominos (int m , int n) {
        if( m == 1 && n == 1 )   return 0;
        if( m == 2 && n == 1 )   return 1;
        return (n*m)/2;
    }
	
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);

        int m = sr.nextInt();
        int n = sr.nextInt();
        int max = Math.max(n , m);
        int min = Math.min(n , m);
        
        System.out.print(dominos(max , min));
        sr.close();		
	}
}