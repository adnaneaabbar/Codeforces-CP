import java.util.*;

/**
 * taskB
 * Make them equal
 */


public class Problem1154B {

    public static int substwo(int[] array , int i , int j) {
        return array[i] - array[j];
    }

    public static boolean contains( int [] array,  int key) {
        for ( int i = 0 ; i < array.length ; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        
        int [] val = new int [n];
        val[0] = sr.nextInt();
        int test;
        int count = 1;
        for (int i = 1; i < n; i++) {
            test = sr.nextInt();
            if (!contains(val , test)) {
                val[count] = test;
                count++;
            }
        }

        int [] resize = new int [count];
        for (int i = 0; i <count; i++) {
            resize[i] = val[i];
        }

        Arrays.sort(resize);

        if(resize.length > 3) System.out.print(-1);
        else if (resize.length == 3){
            if(substwo(resize, 1, 0) == substwo(resize, 2, 1)) System.out.print(substwo(resize, 1, 0));
            else System.out.print(-1);
        }
        else if (resize.length == 2){
            if(substwo(resize, 1, 0) % 2 == 0) System.out.print(substwo(resize, 1, 0)/2);
            else System.out.print(substwo(resize, 1, 0));
        }
        else System.out.print(0);
        
        sr.close();  
    } 
}
