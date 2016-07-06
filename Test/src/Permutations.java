import java.util.ArrayList;
import java.util.List;


public class Permutations {
	
	public static void main(String ar[]) {
		List<String> result = getPerms("abc");
		System.out.print(result.toString());
	}
	public static List<String> getPerms(String str) {
		
		if( str == null) {
			return null;
		}
		
		List<String> perms = new ArrayList<>();
		if (str.length() == 0) {
			perms.add("");
			return perms;
		}
		
		char first = str.charAt(0);
		String rest = str.substring(1);
		
		List<String> perm = getPerms(rest);
		
		for(String st : perm) {
			for (int i=0; i<= st.length(); i++){
				String fHalf = st.substring(0, i);
				String sHalf = st.substring(i);
				perms.add(fHalf+first+sHalf);
			}
		}
		
		return perms;
	}

}
