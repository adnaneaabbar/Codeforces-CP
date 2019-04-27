import java.util.Scanner;

public class Problem96A {
    
    public static int countRun( String str, char c , int index)
    {
        int counter = 0;

        for( int i = index; i < str.length(); i++) {
            if( str.charAt(i) == c )  counter++;
            else if (counter > 0 ) break;
        }

        return counter;
    }
	
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
		
        String str = sr.next();
        boolean flag = false;
        
        for (int i = 0; i < str.length(); i++) {
            if(countRun(str , str.charAt(i) , i) >= 7) {
                flag = true;
                break;
            }
        }
		
        if (flag) System.out.print("YES");      
        else System.out.print("NO");
        sr.close();		
	}
}