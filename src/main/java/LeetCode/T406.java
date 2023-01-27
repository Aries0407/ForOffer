package LeetCode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

@Slf4j
public class T406 {
    public static void main(String[] args) {
        T406 t406 = new T406();
        log.debug("sdf");
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        t406.reconstructQueue(people);

    }

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, ((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]));
        LinkedList<int[]> linkedList = new LinkedList<>();
        for (int[] i: people){
            linkedList.add(i[1],i);
        }
        return linkedList.toArray(new int[linkedList.size()][2]);
    }


    @Test
    public void test() {
        int[][] a = {{1, 1}, {2, 2}};
        int[] tmp = a[0];
        a[0] = a[1];
        a[1] = tmp;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}
