package algoorithm;
/*
    The program which display the most repeated letter(alphabet) from string 
        NB. ignore numbers and space.
 */
import java.util.Iterator;

public class ReapeatCharacter {
	private static char repeatedChar(String s) {
		int highestCount = 0;
		int occerence = 0;
		char highChar = 0;
     
		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isDigit(s.charAt(i)) || s.charAt(i) == ' ') {
				continue;
			} else {
				for (int j = i; j < s.length(); j++) {
					if (s.charAt(j) == s.charAt(i)) {
						occerence++;
					}
				}
			}

			if (occerence > highestCount) {
				highestCount = occerence;
				highChar = s.charAt(i);
			}

			occerence = 0;

		}

		return highChar;

	}

	public static void main(String[] args) {
		char a = repeatedChar("sdfsfghjjjgffdjfffj  667890olkjjhgfdse45b  lkkkjhjjj");
		System.out.println(a);

	}
}
