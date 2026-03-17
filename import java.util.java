import java.util.HashMap;
import java.util.Map;

public class UC7 {

    public static void main(String[] args) {

        String word = "OOPS";
        CharacterPatternMap patternMap = new CharacterPatternMap();

        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = patternMap.getPattern(ch);

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern[i]).append("   ");
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private final Map<Character, String[]> patternStore;

        public CharacterPatternMap() {
            patternStore = new HashMap<>();

            patternStore.put('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });

            patternStore.put('P', new String[]{
                    "****** ",
                    "*     *",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      ",
                    "*      "
            });

            patternStore.put('S', new String[]{
                    " ***** ",
                    "*     *",
                    "*      ",
                    " ***** ",
                    "      *",
                    "*     *",
                    " ***** "
            });
        }

        public String[] getPattern(char ch) {
            return patternStore.getOrDefault(ch, new String[]{
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       "
            });
        }
    }
}