package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Aries
 * @date 2021/2/26 8:24
 */
public class LC1178 {

    public static void main(String[] args) {


    }

    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < puzzles.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                count += help(words[j], puzzles[i]);
            }
            list.add(count);
        }
        return list;
    }

    public int help(String word, String puzzle) {
        char[] charWo = word.toCharArray();
        char[] charPu = puzzle.toCharArray();
        int[] countWo = new int[26];
        int[] countPu = new int[26];

        for (int i = 0; i < charWo.length; i++) {
            countWo[charWo[i] - 'a'] = 1;
        }
        for (int i = 0; i < charPu.length; i++) {
            countPu[charPu[i] - 'a'] = 1;
        }

        if (countWo[charPu[0] - 'a'] == 0) return 0;

        for (int i = 0; i < 26; i++) {
            if (countPu[i] < countWo[i]) {
                return 0;
            }
        }
        return 1;
    }
}
