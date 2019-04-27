import java.util.Scanner;

public class Problem112A {
	
    public static int strcmp( String str1 , String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1 , l2);

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //example: "Adnane" , "Adnbne"
        for (int i = 0; i < lmin; i++) {
            int ch1 = (int)str1.charAt(i);
            int ch2 = (int)str2.charAt(i);
            if(ch1 < ch2) return -1; //str1 = "Adnane"
            if(ch1 > ch2) return 1;   //str1 = "Adnbne"
        }

        //example: "Adnane" , "Adnaneaabbar"
        if(l1 < l2) return -1; //str1 = "Adnane"
        if(l1 > l2) return 1;   //str1 = "Adnaneaabbar"
        
        return 0; //worst case scenario str1 = str2
    }
    
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
		
		String str1 = sr.next();
		String str2 = sr.next();
		
        System.out.println(strcmp(str1, str2));
        sr.close();		
	}
}