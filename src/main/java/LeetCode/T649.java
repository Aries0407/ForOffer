package LeetCode;


public class T649 {

    public static void main(String[] args) {
        System.out.println(T649.predictPartyVictory1("DRRDRDRDRDDRDRDR"));
    }

    public static String predictPartyVictory1(String senate) {
        while (senate.contains("R") && senate.contains("D")) {
            for (int i = 0; i < senate.length(); i++) {
                if (senate.charAt(i) == 'R') {
                    if (senate.contains("D")) {
                        senate = senate.replaceFirst("D", "Z");
                        System.out.println(senate);
                        continue;
                    }
                }
                if (senate.charAt(i) == 'D'){
                    if (senate.contains("R")) {
                        senate = senate.replaceFirst("R", "Z");
                        System.out.println(senate);
                        continue;
                    }
                }
            }
        }
        if (senate.contains("D")){
            return "Dire";
        }if (senate.contains("R")){
            return "Radiant";
        }
        return null;
    }

    public static String predictPartyVictory(String senate) {
        String[] ret = {"Radiant", "Dire"};
        int[][] map = new int[2][2];
        /**
         * map[0][0]现有Radiant的议员，map[0][1]未行使过禁止对方议员参选权力
         * map[1][0]现有Dire的议员，map[1][1]未行使过禁止对方议员参选权力
         */

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                map[0][0]++;
                if (map[1][1] > 0) {
                    map[0][0]--;
                    map[1][1]--;
                } else {
                    map[0][1]++;
                    if (map[1][0] > 0) {
                        map[1][0]--;
                        map[0][1]--;
                    }
                }
            }
            if (senate.charAt(i) == 'D') {
                map[1][0]++;
                if (map[0][1] > 0) {
                    map[1][0]--;
                    map[0][1]--;
                } else {
                    map[1][1]++;
                    if (map[0][0] > 0) {
                        map[0][0]--;
                        map[1][1]--;
                    }
                }
            }
        }
        if (map[0][0] > map[1][0]) {
            System.out.println(ret[0]);
            return ret[0];
        } else {
            System.out.println(ret[1]);
            return ret[1];
        }

    }
}
