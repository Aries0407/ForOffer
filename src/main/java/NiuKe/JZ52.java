package NiuKe;

public class JZ52 {
    /*
    请实现一个函数用来匹配包括'.'和'*'的正则表达式。
    模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
    在本题中，匹配是指字符串的所有字符匹配整个模式。
    例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
     */

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) return false;
        int sindex = 0;
        int pindex = 0;
        return matchHelper(str,sindex,pattern,pindex);
    }

    private  boolean matchHelper(char[] str, int i, char[] pattern, int j) {
        if(j == pattern.length)//pattern遍历完了
            return str.length == i;//如果str也完了，返回true，不然false
        //注意数组越界问题，一下情况都保证数组不越界
        if(j < pattern.length - 1 && pattern[j + 1] == '*') {//下一个是*
            if(str.length != i && //当前匹配
                    (str[i] == pattern[j] || pattern[j] == '.')) //匹配
                return matchHelper(str,i,pattern,j + 2)
                        || matchHelper(str,i + 1,pattern,j);
            else//当前不匹配
                return matchHelper(str,i,pattern,j + 2);
        }
        //下一个不是“*”，当前匹配
        if(str.length != i && (str[i] == pattern[j] || pattern[j] == '.'))
            return matchHelper(str,i + 1,pattern,j + 1);
        return false;
    }

    public static void main(String[] args) {
        char str[] = {'a', 'a', 'a'};
        char pattern[] = {'a', 'a', '.', 'a'};
        JZ52 jz52 = new JZ52();
        System.out.println(jz52.match(str, pattern));
    }
}
