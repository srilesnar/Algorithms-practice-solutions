import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rocks = n;
        scan.nextLine();
        Map<Integer, Set<Character>> charCountMap = new HashMap<>();
        while (n > 0) {
            String word = scan.nextLine();
            char[] chArr = word.toCharArray();
            Map<Character, Integer> freqMap = new HashMap<>();
            for (int i = 0; i < chArr.length; i++) {
                if (freqMap.containsKey(chArr[i])) {
                    int cnt = freqMap.get(chArr[i]);
                    ++cnt;
                    freqMap.put(chArr[i], cnt);
                } else {
                    freqMap.put(chArr[i], 1);
                }
            }
            
            Set<Character> valueSet = new HashSet<>();
            for (Character c: freqMap.keySet()) {
                if (freqMap.get(c) == 1) {
                    valueSet.add(c);
                }
            }
            charCountMap.put(n, valueSet);
            n--;
        }
        int count= 0;
        if (!charCountMap.isEmpty()) {
            Set<Character> values = charCountMap.get(1);
            boolean found = true;
            for (Character c: values) {
                for (int  j = 2; j<=n; j++ ) {
                    Set<Character> compareValues = charCountMap.get(j);
                    if (!compareValues.contains(c)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
}