package LeetCode.LeetCode;

public class T844 {
    public static void main(String[] args) {
        T844 t = new T844();
        System.out.println(t.backspaceCompare("xywrrmp", "xywrrmu#p"));

    }

    public boolean backspaceCompare(String S, String T) {
        int indexS = S.length() - 1;
        int indexT = T.length() - 1;
        int countDelS = 0;
        int countDelT = 0;
        StringBuffer sbs = new StringBuffer();
        StringBuffer sbt = new StringBuffer();
        while (true) {
            if (indexS>=0){
                if (S.charAt(indexS) == '#') {
                    countDelS++;
                } else {
                    if (countDelS == 0) {
                        sbs.append(S.charAt(indexS));
                    }
                    if (countDelS > 0) {
                        countDelS--;
                    }
                }
                indexS--;
            }
            if (indexT>=0){
                if (T.charAt(indexT) == '#') {
                    countDelT++;
                } else {
                    if (countDelT == 0) {
                        sbt.append(T.charAt(indexT));
                    }
                    if (countDelT > 0) {
                        countDelT--;
                    }
                }
                indexT--;
            }
            if (indexS<0&&indexT<0) break;;
        }
        return sbs.toString().equals(sbt.toString());
    }
}
