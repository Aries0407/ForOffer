package LeetCode;

public class T925 {

    public static void main(String[] args) {
        T925 t = new T925();
        System.out.println(t.isLongPressedName("alex","aaleex"));

    }

    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while (true) {
            if (i < name.length() && j < typed.length()) {
                if (name.charAt(i) == typed.charAt(j)) {
                    i++;
                    j++;
                    continue;
                } else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                    j++;
                } else {
                    return false;
                }
            }
            if (i == name.length() || j == typed.length()) {
                break;
            }
        }
        if (i < name.length()) {
            return false;
        }
        if (j < typed.length()) {
            while (j < typed.length()) {
                if (name.charAt(i - 1) == typed.charAt(j)) {
                    j++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
