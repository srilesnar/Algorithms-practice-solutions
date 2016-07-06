import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bear {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String gene = scan.nextLine();
        if (n%4 ==0 && gene != null) {
            int validCount = n/4;
            int acount = 0, ccount = 0, gcount = 0, tcount = 0;
            char[] arr = gene.toCharArray();
            Set<Integer> invalidPos = new HashSet<>();
            for (int i=0; i<arr.length; i++){
                if (arr[i] == 'A') {
                    if (acount < validCount) {
                        ++acount;
                    } else {
                        invalidPos.add(i);
                    }
                } else if (arr[i] == 'C') {
                    if (ccount < validCount) {
                        ++ccount;
                    } else {
                        invalidPos.add(i);
                    }
                } else if (arr[i] == 'G') {
                    if (gcount < validCount) {
                        ++gcount;
                    } else {
                        invalidPos.add(i);
                    }
                } else if (arr[i] == 'T') {
                    if (tcount < validCount) {
                        ++tcount;
                    } else {
                        invalidPos.add(i);
                    }
                }
            }
            Iterator<Integer> it = invalidPos.iterator();
            int count = 0;
            int prev = -1;
            while(it.hasNext()){
                Integer val = it.next();
                if (prev >= 0) {
                    count +=(val - prev -1);
                }
                prev = val;
                count++;
            }
            
            System.out.println(Math.abs(count));
        }
    }
}