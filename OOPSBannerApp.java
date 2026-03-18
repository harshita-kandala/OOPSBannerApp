/*	
* OOPSBannerApp UC8 - Use map for character patterns and render via function
* @author Harshita
* @version 8.0
*/

import java.util.HashMap;

public class OOPSBannerApp{
	
	static class CharacterPatternMap {
		Character character;
		String[] pattern;
        /* Constructor to initialize character and pattern
        * @param character
        * @param pattern*/
		
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to print banner
     * @param characters
     */
	public static void printBanner(CharacterPatternMap[] characters) {

        int rows = characters[0].getPattern().length;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : characters) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static HashMap<Character, String[]> createCharacterMap(){
		HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        charMap.put('P', new String[]{
                "******** ",
                "*      **",
                "*      **",
                "******** ",
                "*        ",
                "*        ",
                "*        "
        });

        charMap.put('S', new String[]{
                "  *****  ",
                " **   ** ",
                "**       ",
                " *****   ",
                "     **  ",
                "**   **  ",
                " ****    "
        });
		
		return charMap;
	}
	
	public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
		int patternHeight = charMap.get('O').length;
		
		for (int line = 0; line < patternHeight; line++){
			StringBuilder row = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);
                row.append(pattern[line]).append("  ");
            }

            System.out.println(row);
			
		}
	}
	
	
	public static void main(String[] args) {
		HashMap<Character, String[]> charMap = createCharacterMap();
		String message = "OOPS";
        displayBanner(message, charMap);
    }
}