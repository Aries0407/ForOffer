package LeetCode;

import java.util.*;

/**
 * @author Aries
 * @date 2021/5/20 8:18
 */
public class LC692 {

    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((o1, o2) ->
                o1.getValue().equals(o2.getValue()) ? o2.getKey().compareTo(o1.getKey()) :
                        o1.getValue() - o2.getValue());

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            pq.add(s);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        ArrayList<String> ret = new ArrayList<>();

        while (!pq.isEmpty()) {
            ret.add(pq.poll().getKey());
        }

        Collections.reverse(ret);
        return ret;
    }


    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        LC692 lc692 = new LC692();
        lc692.topKFrequent(words, 2);

    }
}

