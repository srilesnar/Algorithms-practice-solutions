
public class MaskCC {
	public static void main (String ar[]) {
		String masked = maskCCNumberFromString();
		System.out.print(masked);
	}
	
private static String maskCCNumberFromString() {
        
        
        String cardNum = "4567887654321";
        StringBuilder maskedCC = new StringBuilder();
        for (int i=cardNum.length() - 1; i >= 0; i--) {
        	if(i < cardNum.length() - 4 ){
                maskedCC.append("*");
            } else {
            	maskedCC.append(cardNum.charAt(i));
            }            
        }        
        maskedCC = maskedCC.reverse();
        return maskedCC.toString();
    }

}
