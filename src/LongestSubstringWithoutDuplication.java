import java.util.HashMap;

public class LongestSubstringWithoutDuplication {
    public static String longestSubstringWithoutDupication(String string) {

        HashMap<Character, Integer> lastseen = new HashMap<>();

        int[] longest = {0, 1};
        int startIndex = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (lastseen.containsKey(c)) {
                startIndex = Math.max(startIndex, lastseen.get(c) + 1);
            }
            if (longest[1] - longest[0] < i + 1 - startIndex) {
                longest = new int[]{startIndex, i - 1};
            }
            lastseen.put(c, i);
        }
        String result = string.substring(longest[0], longest[1]);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(LongestSubstringWithoutDuplication.longestSubstringWithoutDupication("hiwrertkjsnknvs"));
    }

}
