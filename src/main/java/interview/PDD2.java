package interview;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PDD2 {

    public static void main(String[] args) {
        Stack<Integer> deskStack = new Stack<>();//�����ϵ��ƣ���ջ���й���
        Queue<Integer> playerA = new LinkedList();//�ö��й���ÿ��ѡ�ֵ���
        Queue<Integer> playerB = new LinkedList();
        int[] book = new int[14];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            playerA.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            playerB.add(scanner.nextInt());
        }
        //���������ж���Ϊ�գ���ʾ��Ϸû�н���
        while (!playerA.isEmpty() && !playerB.isEmpty()) {
            int ta = playerA.peek();//A��һ����
            //�ж�A�������ܲ���Ӯ��
            if (book[ta] == 0) {//������û��������
                //A����Ӯ��
                playerA.remove();//������Ƴ�����
                deskStack.add(ta);//���������ջ
                book[ta] = 1;//��Ǵ�����Ƴ�����������
            } else {//A��Ӯ��
                playerA.remove();//������Ƴ�����
                playerA.add(ta);//������������
                while (deskStack.lastElement() != ta) {
                    book[deskStack.lastElement()] = 0;
                    playerA.add(deskStack.lastElement());
                    deskStack.pop();
                }
            }
            int tb = playerB.peek();//B��һ����
            //�ж�B�������ܲ���Ӯ��
            if (book[tb] == 0) {//������û��������
                //B����Ӯ��
                playerB.remove();//������Ƴ�����
                deskStack.add(tb);//���������ջ
                book[tb] = 1;//��Ǵ�����Ƴ�����������
            } else {//B��Ӯ��
                playerB.remove();//������Ƴ�����
                playerB.add(tb);//������������
                while (deskStack.lastElement() != tb) {
                    book[deskStack.lastElement()] = 0;
                    playerB.add(deskStack.lastElement());
                    deskStack.pop();
                }
            }
        }
        int t1 = playerA.size();
        int t2 = playerB.size();
        while (!deskStack.isEmpty()) {
            int tmp = deskStack.pop();
            if (tmp % 2 == 1) t1++;
            else t2++;
        }
        System.out.println(t1 + " " + t2);
    }

}
