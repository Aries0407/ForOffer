package interview;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PDD2 {

    public static void main(String[] args) {
        Stack<Integer> deskStack = new Stack<>();//桌子上的牌，用栈进行管理
        Queue<Integer> playerA = new LinkedList();//用队列管理每个选手的牌
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
        //当两个队列都不为空，表示游戏没有结束
        while (!playerA.isEmpty() && !playerB.isEmpty()) {
            int ta = playerA.peek();//A出一张牌
            //判断A出的牌能不能赢牌
            if (book[ta] == 0) {//桌子上没有这张牌
                //A不能赢牌
                playerA.remove();//打出的牌出队列
                deskStack.add(ta);//打出的牌入栈
                book[ta] = 1;//标记打出的牌出现在桌子上
            } else {//A能赢牌
                playerA.remove();//打出的牌出队列
                playerA.add(ta);//打出的牌入队列
                while (deskStack.lastElement() != ta) {
                    book[deskStack.lastElement()] = 0;
                    playerA.add(deskStack.lastElement());
                    deskStack.pop();
                }
            }
            int tb = playerB.peek();//B出一张牌
            //判断B出的牌能不能赢牌
            if (book[tb] == 0) {//桌子上没有这张牌
                //B不能赢牌
                playerB.remove();//打出的牌出队列
                deskStack.add(tb);//打出的牌入栈
                book[tb] = 1;//标记打出的牌出现在桌子上
            } else {//B能赢牌
                playerB.remove();//打出的牌出队列
                playerB.add(tb);//打出的牌入队列
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
