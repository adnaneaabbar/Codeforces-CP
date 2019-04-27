import java.util.*;


/**
 * taskA
 * Restoring three numbers
 */
public class Problem1154A {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int [] val = new int[4];

        for (int i = 0; i < 4; i++) {
            val[i]=sr.nextInt();
        }
        Arrays.sort(val);
        for (int i = 0; i < 3; i++) {
            System.out.print(val[3] - val[i] + " "); 
        }
        sr.close();
    }
    
}
