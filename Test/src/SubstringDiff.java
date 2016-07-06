import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubstringDiff {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n > 0) {
            scan.nextLine();
            String input = scan.nextLine();
            String strArr[] = input.split(" ");
            int diff = Integer.parseInt(strArr[0]);
            String str1 = strArr[1];
            String str2 = strArr[2];
            System.out.println(findMaxLength(diff, str1, str2));
            n--;
        }
    }
    
    private static int findMaxLength(int diff, String s1, String s2) {
        
        Map<Character, List<Integer>> charPosMap = new HashMap<>();
        for (int i=0; i < s1.length(); i++) {
            Character c = s1.charAt(i);
            List<Integer> pos;
            if (charPosMap.containsKey(c)) {
                pos = charPosMap.get(c);
                
            } else {
                pos = new ArrayList<>();
            }
            pos.add(i);
            charPosMap.put(c, pos);
        }
        
        int maxStartPos = 0;
        int maxEndPos = 0;
        int max = 0;
        for (int j =0; j< s2.length(); j++) {
            Character c2 = s2.charAt(j);
            if (charPosMap.containsKey(c2)) {
                List<Integer> posList = charPosMap.get(c2);
            }
        }
        return 0;
    }
}