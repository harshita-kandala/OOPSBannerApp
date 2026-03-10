/*	
* OOPSBannerApp UC7 - Store Character Pattern in a Class
*This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate character-to-pattern mappings.
* @author Harshita
* @version 7.0
*/

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

    public static void main(String[] args) {

        String[] oPattern = {
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };

        String[] pPattern = {
                "******** ",
                "*      **",
                "*      **",
                "******** ",
                "*        ",
                "*        ",
                "*        "
        };

        String[] sPattern = {
                "  *****  ",
                " **   ** ",
                "**       ",
                " *****   ",
                "     **  ",
                "**   **  ",
                " ****    "
        };

        CharacterPatternMap[] banner = {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern)
        };

        printBanner(banner);
    }
}
	