
import java.util.*;

/**
 * second
 */
public class Problem1029B {
  //binary search
  public static int lowerBound(int[] a, int low, int high, int element){
    while(low < high){
        int middle = low + (high - low)/2;
        if(element > a[middle]) low = middle + 1;
        else high = middle;
    }
    return low;
  }
  public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);

    int n = sr.nextInt();
    int [] a = new int [n];
    int answer = 1; //one problem is always an answer use it in max
    for (int i = 0; i < n; i++) {
      a[i] = sr.nextInt();
    }
        
    for (int i = 0; i < n; i++) {

      int lower = lowerBound(a, i, n-1, a[i]*2);
      int index = lower - i - 1;
      answer = Math.max(answer, index - i + 1);

      int j = i;
      while (j + 1 < n && a[j + 1] <= a[j] * 2) {
        j++;
      }
      answer = Math.max(answer , j - i + 1);
      i = j;

    }

    System.out.print(answer); 
    sr.close();
  }
}