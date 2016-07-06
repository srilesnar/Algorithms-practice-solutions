import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Knapsack {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        while (n > 0) {
            int num = scan.nextInt();
            int sum = scan.nextInt();
            Set<Integer> values = new HashSet<>();
            boolean found = false;
            while(num > 0) {
                int val = scan.nextInt();
                --num;
                if (val > sum) {
                    continue;
                }
                if (sum % val == 0) {
                    System.out.println(sum);
                    found = true;
                    
                    break;
                }
                
                values.add(val);
            }
            
            if (!found) {
                printMaxSum(values, sum);
            }
            
            while (num > 0) {
            	scan.nextInt();
            	--num;
            }
            
            n--;
        }
    }
    
    private static void printMaxSum(Set<Integer> values, int sum) {
        int minRem = Integer.MAX_VALUE;
        List<Integer> sortedList = new ArrayList<>(values);
        Collections.sort(sortedList);
        System.out.println("Sorted array: "+sortedList.toString());
        /*for (Integer i : values) {
            int rem = sum % i;
            if (rem == 0|| values.contains(rem)) {
                System.out.println(sum);
                return;
            } else {
                if (rem < minRem) {
                    minRem = rem;
                }
            }
        }
        if (minRem == Integer.MAX_VALUE) {
        	System.out.println(0);
        } else {
        	System.out.println(sum - minRem);
        }*/
        int maxSum = 0;
        /*for (Integer i : sortedList) {
        	int rem = sum % i;
        	if (rem == 0 || values.contains(rem)) {
                System.out.println(sum);
                return;
            } else {
            	if (maxSum + rem > sum) {
            		System.out.println(maxSum);
                    return;
            	} else {
            		maxSum += (sum - rem);
            	}
            }
        }*/
        
        for (Integer i : sortedList) {
        	int rem = sum % i;
        	if (rem == 0 || values.contains(rem)) {
                System.out.println(sum);
                return;
            } else {
            	if (maxSum + i > sum) {
            		System.out.println(maxSum);
                    return;
            	} else {
            		maxSum += (i);
            	}
            }
        }
        System.out.println("end");
       
    }
}