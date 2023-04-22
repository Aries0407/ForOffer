package LeetCode.LeetCode;

public class LC1232 {
    public boolean checkStraightLine(int[][] coordinates) {

        if (coordinates.length <= 2) return true;
        int x = coordinates[0][0];
        boolean kExist = false;
        for (int i = 0; i < coordinates.length; i++) {
            if (x != coordinates[i][0]) {
                kExist = true;
            }
        }
        if (!kExist) return true;
        double k = (coordinates[0][1] - coordinates[1][1]) * 1.0 / (coordinates[0][0] - coordinates[1][0]);
        for (int i = 2; i < coordinates.length; i++) {
            if (k != (coordinates[0][1] - coordinates[i][1]) * 1.0 / (coordinates[0][0] - coordinates[i][0])) {
                return false;
            }
        }
        return true;
    }
}
