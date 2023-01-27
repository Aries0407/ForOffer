package LeetCode.WeeklyCompetition;


import java.util.HashMap;

public class WC5662 {
    public int minCharacters(String a, String b) {
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (aMap.containsKey(a)) {
                aMap.put(c, aMap.get(c) + 1);
            } else {
                aMap.put(c, 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (bMap.containsKey(c)) {
                bMap.put(c, bMap.get(c) + 1);
            } else {
                bMap.put(c, 1);
            }
        }
        int count = 0;
        for (Character c : aMap.keySet()) {
            int aValue = aMap.get(c);
            int bValue = 0;
            if (bMap.containsKey(c)) {
                bValue = bMap.get(c);
            }
            int value = Math.abs(aValue - bValue);
            if (aValue > bValue) {
                count += bValue;
                bMap.put(c, 0);
                aMap.put(c, value);
            } else {
                count += aValue;
                aMap.put(c, 0);
                bMap.put(c, value);
            }
        }
        int aCount = 0;
        int bCount = 0;
        for (Character c : aMap.keySet()) {
            aCount += aMap.get(c);
        }
        for (Character c : bMap.keySet()) {
            bCount += bMap.get(c);
        }
        return Math.min(aCount, bCount) + count;
    }

    public static void main(String[] args) {
        WC5662 w = new WC5662();
        System.out.println(w.minCharacters("dabadd", "cda"));
    }
}
