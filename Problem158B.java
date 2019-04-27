import java.util.*;


public class Problem158B{

    public static void main(String[] args ){

        Scanner sr = new Scanner(System.in);
        int cabs = 0;
        int empty = 0;
        int [] groups = new int[5]; //initialised to 0 default
        int n = sr.nextInt();
        
        for (int i = 0; i < n; i++) {
            groups[sr.nextInt()]++;
        }
        cabs += groups[4]; //GROUPS OF 4 TAKE ONE Cab

        cabs += groups[3]; 
        groups[1] = groups[1] - groups[3];
        groups[1] = groups[1] < 0 ? 0 : groups[1];
        

        cabs += groups[2]/2 + groups[2]%2;

        groups[1] = groups[1] - 2*(groups[2]%2);

        if(groups[1]>0){
        cabs += groups[1]/4;
        }

        if(groups[1]%4>0){
        cabs ++;
        }

        System.out.println(cabs);
        sr.close();
    }
}