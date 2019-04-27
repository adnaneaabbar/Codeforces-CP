import java.util.Scanner;

public class Problem236A {
    
    public static int countUniqueCharacters(String input) {
        boolean[] isItThere = new boolean [Character.MAX_VALUE];

        for (int i = 0; i < input.length(); i++) { 
            isItThere[input.charAt(i)] = true; //chaque case est associé à un seul charactere
                                                //donc 2 characteres identiques agissent sur la meme case
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true){
                    count++;//puisque les cases sont uniques la boucle ne prendra pas en compte les characteres repetées
                                            
            }
        }
        
        return count;
    }
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
		String str = sr.next();
        
        if (countUniqueCharacters(str) % 2 == 0) System.out.print("CHAT WITH HER!"); 
        else System.out.print("IGNORE HIM!");
        
        sr.close();		
	}
}
