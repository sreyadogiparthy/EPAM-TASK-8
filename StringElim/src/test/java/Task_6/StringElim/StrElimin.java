package Task_6.StringElim;
public class StrElimin {
	public String remove(String string) {
		int strLength = string.length();
		String fin = string;
		
		if(strLength  == 1) {
			if(string.charAt(0) == 'A') {
				fin = "";
			}
		}
		else if (strLength > 1) {
			if (string.charAt(0) == 'A' && string.charAt(1) == 'A') 
				fin = string.substring(2, strLength);
			else if (string.charAt(0) != 'A' && string.charAt(1) == 'A') 
				fin = string.charAt(0) + string.substring(2, strLength);
			else if (string.charAt(0) == 'A' && string.charAt(1) != 'A') 
				fin = string.substring(1, strLength);
		}
		return fin;
	}
}