import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while (n > 0 && scan.hasNext()) {
            int index = -1;
            
            String inp = scan.nextLine();
            char[] chars = inp.toCharArray();
            char[] reverseArr = new char[chars.length];
            int j = 0;
            for (int  i = chars.length-1; i >= 0; i--) {
                reverseArr[j] = chars[i];
                j++;
            }
            for (int k = 0; k < chars.length; k++) {
                if (chars[k] != reverseArr[k]) {
                	index = getIndex(k, chars, reverseArr);
                    break;
                }
            }
            System.out.println(index);
            n--;
        }
    }
    
    private static int getIndex(int k, char[] chars, char[] reverseArr) {
        /*int tmp = k;
        for (; tmp < chars.length; tmp++) {
            if (chars[tmp] != reverseArr[tmp+1]) {
                return tmp;
            }
        }*/
    	
    	int count = chars.length - 2*k;
    	String original = new String(chars, k+1, count-1);
    	String reverse = new String(reverseArr, k, count);
    	
    	if (reverse.contains(original)) {
    		return k;
    	} else {
        
    		return chars.length - 1 -k;
    	}
    }
}

