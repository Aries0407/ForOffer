package LeetCode.SwordToOffer;

public class JZ29 {
    public static void main(String[] args) {
        int[][] tes = {{1,2,3},{4,5,6},{7,8,9}};
        JZ29 jz29 = new JZ29();
        System.out.println(jz29.spiralOrder(tes).toString());
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int total = matrix[0].length * matrix.length;
        int[] res = new int[total];
        int left = 0, top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        int cur = 0;
        while (true) {
            for (int i = left; i <= right; i++) {
                res[cur++] = matrix[top][i];
            }
            if (++top > bottom) break;
            for (int i = top; i <= bottom; i++) {
                res[cur++] = matrix[i][right];
            }
            if (--right < left) break;
            for (int i = right; i >= left; i--) {
                res[cur++] = matrix[bottom][i];
            }
            if (--bottom < top) break;
            for (int i = bottom; i >= top; i--) {
                res[cur++] = matrix[i][left];
            }
            if (++left > right) break;
        }
        return res;
    }
}
