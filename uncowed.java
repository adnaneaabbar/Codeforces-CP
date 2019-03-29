import java.util.*;
public class uncowed {
	private static double max(double d, double e) {
		if (d<=e) return e;
		else return d;
	}
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int score1 = 500;
			int score2 = 1000;
			int score3 = 1500;
			int score4 = 2000;
			int score5 = 2500;
			int m1 = s.nextInt();
			int m2 = s.nextInt();
			int m3 = s.nextInt();
			int m4 = s.nextInt();
			int m5 = s.nextInt();
			int w1 = s.nextInt();
			int w2 = s.nextInt();
			int w3 = s.nextInt();
			int w4 = s.nextInt();
			int w5 = s.nextInt();
			int hs = s.nextInt();
			int hu = s.nextInt();
			double somme = 0;
			somme += max(0.3 * score1, (1 - 1.0*m1 / 250) * score1 - 50 * w1) + max(0.3 * score2, (1 - 1.0*m2 / 250) * score2 - 50 * w2);
			somme += max(0.3 * score3, (1 - 1.0*m3 / 250) * score3 - 50 * w3) + max(0.3 * score4, (1 - 1.0*m4 / 250) * score4 - 50 * w4) + max(0.3 * score5, (1 - 1.0*m5 / 250) * score5 - 50 * w5);
			somme += 100 * hs - 50 * hu;
			System.out.print((int)somme);
		}
}
