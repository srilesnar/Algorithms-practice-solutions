import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Candies {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int  i = 0;
        while (n > 0) {
            arr[i] = scan.nextInt();
            i++;
            n--;
        }
        
        int total = distributeCandy(arr);
        System.out.println(total);
    }
    
    static int distributeCandy(int[] a) {
        int currSum = 0;
        int currRating = 1;
        boolean inc = true;
        for (int  i=0; i<a.length -1 ; i++) {
            currSum += currRating;
            if (a[i] < a[i+1]) {
                if (!inc) {
                    currRating = 2;
                    inc = true;
                } else {
                    ++currRating;
                }
                
            } else if (a[i] >= a[i+1]){
                if (inc) {
                    currRating = 1;
                    inc = false;
                } else {
                    ++currRating;
                }
                
            }
        }
        currSum += currRating;
        return currSum;
    }
}