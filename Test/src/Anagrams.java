import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while (n > 0) {
            String word = scan.nextLine();
            if (word != null) {
                int length = word.length();
                if (length %2 != 0) {
                    System.out.println(-1);
                    n--;
                    continue;
                }
                
                char[] word1 = word.substring(0,length/2).toCharArray();
                char[] word2 = word.substring(length/2).toCharArray();
                Map<Character, Integer> charCount = new HashMap<>();
                for (int i=0; i < word1.length; i++) {
                	if (charCount.containsKey(word1[i])) {
                		int count = charCount.get(word1[i]);
                		++count;
                		charCount.put(word1[i], count);
                	} else {
                		charCount.put(word1[i], 1);
                	}
                }
                
                int count = 0;
                for (int j = 0; j < word2.length; j++) {
                	if(charCount.containsKey(word2[j])) {
                		int chCount = charCount.get(word2[j]);
                		--chCount;
                		if (chCount == 0) {
                			charCount.remove(word2[j]);
                		} else {
                    		charCount.put(word2[j], chCount);
                		}
                	} else {
                		++count;
                	}
                }
                System.out.println(count);
            }
            n--;
        }
    }
}