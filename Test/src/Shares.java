import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Shares {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n > 0) {
            int days = scan.nextInt();
            int previous = scan.nextInt();
            int stocks = 0;
            int totalMoney = 0;
            int current = 0;
            int preprev = 0;
            for (int i=1; i<days; i++) {
                current = scan.nextInt();
                if (previous < current) {
                    ++stocks;
                    totalMoney -= (previous);
                } else {
                    totalMoney += (stocks * previous);
                    stocks = 0;
                }
                preprev = previous;
                previous = current;
            }
            
            if (preprev < previous) {
            	totalMoney += (stocks * previous);
            }
            System.out.println(totalMoney);
            n--;
        }
    }
}