import java.util.*;
public class Problem789A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int w;
		int min_days = 0;
		int rep;
		for (int i=1;i<=n;i++) 
		{
			w = s.nextInt();
			if (w%k == 0)
				min_days += (w/k);
			else
				min_days += (w/k+1);
		}
		rep = (min_days+1)/2;
		System.out.print(rep);
		s.close();
		} 
}




