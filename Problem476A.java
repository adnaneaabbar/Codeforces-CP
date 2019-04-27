import java.util.*;
public class Problem476A{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int max = n;
		int min = (n+1)/2;
		int rep = -1;
		for (int i = min ; i<= max ; i++ ){
			if ( i%m == 0){
				rep = i;
				break;
			}

		} 
		System.out.println(rep);
		s.close();
	}
}