import java.util.HashMap;
import java.util.Map;

public class uc8 {

    // Centralized Pattern Storage
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Static Block Initialization
    static {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    // Rendering the function
    public static void renderBanner(String word) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.getOrDefault(ch, new String[]{
                        "       ",
                        "       ",
                        "       ",
                        "       ",
                        "       ",
                        "       ",
                        "       "
                });

                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}