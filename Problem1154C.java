import java.util.*;


/**
 * taskC
 * Problem1154C
 */
public class Problem1154C {
    
    public static void main(String[] args) {
        //needed vars
        int ans = 0;
        int full = 0;
        int [] food = new int [3];
        int [] idx = {0,1,2,0,2,1,0};
        //taking input
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            food[i] = sr.nextInt();
        }
        
        //number of weeks where the cat is fed for 7 full days
        full = Math.min(food[0]/3, food[1]/2);
        full = Math.min(full, food[2]/2);

        //bringing the food array to the last week
        food[0] -= full*3;
        food[1] -= full*2;
        food[2] -= full*2;

        //calculates the max possible days in the last week
        for (int i = 0; i < 7; i++) {
            int day = i; // copy of the starting dayto not alter the for loop
            int [] b = food.clone();  // copy of the remaining food array to not alter the original
            int cur = 0;

            //calculating the last week max days
            while (b[idx[day]] > 0) {
                --b[idx[day]];
                day = (day + 1) % 7;
                ++cur;  
            }
            ans = Math.max(ans, full * 7 + cur);
        }
        System.out.print(ans);
        sr.close();
    }
    
}