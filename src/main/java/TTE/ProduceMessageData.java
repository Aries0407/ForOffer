package TTE;

import java.util.Arrays;


public class ProduceMessageData {
    /**
     * 该程序用来生成TTE中的伪测试数据
     * 网络结构为星型网络结构，50台端系统，一个交换机
     * @param args
     */
    public static void main(String[] args) {
        String PATH = "E:\\TTE\\TTE_1\\test3.txt";
        int msg[][] = new int[2500][7];
        for (int i = 0; i < 7; i++) {
            Arrays.fill(msg[i], 0);
        }

        for (int i = 0; i < 2500; i++) {
            msg[i][0] = i / 50;  //id
            msg[i][1] = i;

            msg[i][4] = 100000;
            msg[i][5] = 1;
        }

        int count = 0;
        boolean flag = false;
        for (int i = 0; i < 2500; i++) {
            if (count == 50) {
                count = 0;
            }
            if (count < 50) {
                if (count == 0) {
                    msg[i][2] = msg[i][0];
                    msg[i][3] = 50;
                } else if (count == msg[i][0]) {
                    msg[i][2] = 50;
                } else {
                    msg[i][2] = 50;
                    msg[i][3] = count;
                }

            }
            count++;
        }


        for (int i = 0; i < msg.length; i++) {
            int j = 0;
            for (; j < msg[i].length - 1; j++) {
                System.out.print(msg[i][j] + " ");
            }
            if (j == msg[i].length - 1) {
                {
                    System.out.println(msg[i][j]);
                }
            }
        }
    }
}
