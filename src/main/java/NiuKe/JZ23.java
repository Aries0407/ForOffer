package NiuKe;

import java.util.Arrays;

public class JZ23 {
    /*
    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
    如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

    解题思路：BST的后序序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），
    如果去掉最后一个元素的序列为T，那么T满足：T可以分成两段，前一段（左子树）小于x，
    后一段（右子树）大于x，且这两段（子树）都是合法的后序序列。完美的递归定义 : ) 。
     */

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) return false;
        int rstart = 0;
        int rootIndex = sequence.length - 1;
        for (int i = 0; i < rootIndex; i++) {
            //跳出循环以后说明找到右子树位置
            if (sequence[i] < sequence[rootIndex]) {
                rstart++;
            }
        }
        for (int i = 0; i < rstart; i++) {
            if (sequence[i] > sequence[rootIndex]) {
                return false;
            }
        }
        for (int i = rstart; i < rootIndex; i++) {
            if (sequence[i] < sequence[rootIndex]) {
                return false;
            }
        }

        VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, rstart));
        VerifySquenceOfBST(Arrays.copyOfRange(sequence, rstart, rootIndex));
        return true;
    }


    public static void main(String[] args) {
        int a[] = {4, 8, 6, 12, 16, 14, 10};
        JZ23 jz23 = new JZ23();
        System.out.println(jz23.VerifySquenceOfBST(a));
    }
}
