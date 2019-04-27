import java.util.*;


/**
 * taskD
 * Problem1154D
 */
public class Problem1154D {

    public static int acc_capacity;


    public static int[] _battery(int sun , int [] device ) {
        if (sun == 1) device[1] = Math.min(acc_capacity, device[1] + 1);
        device[0]--;
        return device;
    }

    public static int[] _accumulator(int [] device ) {
        device[1]--;
        return device;
    }

    public static void main(String[] args) {

        int optimal = 0;
        Scanner sr = new Scanner(System.in);
        
        int n = sr.nextInt();
        int [] ifsun = new int [n];
        int [] device = new int [2];
        device[0] = sr.nextInt();
        acc_capacity = sr.nextInt();
        for (int i = 0; i < n; i++) {
            ifsun[i] = sr.nextInt();
        }

        device[1] = acc_capacity;

        for (int i = 0; i < n; i++) {

            if(device[0] == 0 && device[1] == 0) break;
            
            else if(device[0] == 0) device = _accumulator(device);
            
            else if(device[1] == 0) device = _battery(ifsun[i] , device);

            else if(ifsun[i] == 1 && device[1] < acc_capacity) device = _battery(ifsun[i] , device);
            
            else device = _accumulator(device);  
            
		    optimal++;
        }

        System.out.print(optimal);
        sr.close();
    }
}