import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 static int NumberOfPairs(int[] a, long k) {
	        Map<Long, List<Integer>> numMap = new HashMap<>();
	        Set<String> pairSet = new HashSet<>();
	        Set<String> valueSet = new HashSet<>();
	        int count = 0;
	        for (int i = 0 ; i< a.length ; i++) {
	            if (numMap.containsKey(a[i])) {
	                List<Integer> data = numMap.get(a[i]);
	                data.add(i);
	                numMap.put((long)a[i], data);
	            } else {
	                List<Integer> value = new ArrayList<>();
	                value.add(i);
	                numMap.put((long)a[i], value);
	            }
	        }
	        
	        for (int j = 0 ; j< a.length ; j++) {
	            long key = k - a[j];
	            if (numMap.containsKey(key) && !pairSet.contains(key+""+j) && !valueSet.contains(key+""+a[j])) {
	                ++count;
	                valueSet.add(key+""+a[j]);
	                valueSet.add(a[j]+""+key);
	                List<Integer> locs = numMap.get(key);
	                for (Integer m : locs) {
	                    pairSet.add(j+""+m);
	                    pairSet.add(m+""+j);
	                }
	                
	            }
	        }
	        return count;
	    }

	 public static void main(String[] args) throws IOException{
	        
	        int[] _a = {1,3,46,1,3,9};
	        int res = NumberOfPairs(_a, 47);
	        System.out.println(res);
	    }
	}