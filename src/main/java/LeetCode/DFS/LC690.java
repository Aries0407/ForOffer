package LeetCode.DFS;

import LeetCode.LC697;

import java.util.List;

/**
 * @author Aries
 * @date 2021/5/1 7:45
 */

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

public class LC690 {
    int total = 0;
    List<Employee> employees;


    public int getImportance(List<Employee> employees, int id) {
        this.employees = employees;
        for (Employee value : employees) {
            if (value.id == id) {
                dfs(value);
            }
        }
        return total;
    }

    private void dfs(Employee employee) {
        total += employee.importance;
        if (employee.subordinates.size() == 0) {
            return;
        }

        List<Integer> list = employee.subordinates;
        for (int i : list) {
            for (Employee value : employees) {
                if (value.id == i) {
                    dfs(value);
                }
            }
        }
    }

    public static void main(String[] args) {
        LC690 lc690 = new LC690();

    }

}
