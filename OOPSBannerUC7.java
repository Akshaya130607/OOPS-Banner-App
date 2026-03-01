import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC7 {

    // Static Inner Class to store character and its pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Centralized pattern storage using Map
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        }));

        String word = "OOPS";

        // Render banner horizontally
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPatternMap cp = patternMap.get(ch);
                if (cp != null) {
                    lineBuilder.append(cp.getPattern()[row]).append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}
