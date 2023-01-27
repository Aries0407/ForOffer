package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class T1189 {

    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        list.add('b');
        list.add('a');
        list.add('l');
        list.add('o');
        list.add('n');
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (list.contains(c)){
                if (map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c,1);
                }
            }
        }
        int ret= text.length();
        for (char c:map.keySet()){
            int value = map.get(c);
            if (c == 'l' || c == 'o'){
                value/=2;
            }
            ret = value<ret?value:ret;
        }
        ret = map.size()==5?ret:0;
        return ret;
    }

    public static void main(String[] args) {

    }
}
