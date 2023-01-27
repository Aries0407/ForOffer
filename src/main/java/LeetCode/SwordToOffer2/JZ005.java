package LeetCode.SwordToOffer2;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aries
 * @date 2021/8/15 10:58
 */
public class JZ005 {


    public BitSet convert(String s) {
        BitSet bitSet = new BitSet(26);
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            bitSet.set(index);
        }
        return bitSet;
    }

    public int maxProduct(String[] words) {
        BitSet[] bitSets = new BitSet[words.length];
        for (int i = 0; i < words.length; i++) {
            bitSets[i] = convert(words[i]);
        }

        int max = 0;
        for (int i = 0; i < bitSets.length; i++) {
            BitSet tmp = (BitSet) bitSets[i].clone();
            for (int j = i + 1; j < bitSets.length; j++) {
                tmp.and(bitSets[j]);
                if (tmp.cardinality() == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
                tmp = (BitSet) bitSets[i].clone();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                i -= 2;
            }
        }
    }
}
