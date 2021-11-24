package Question4;

import java.util.Deque;
import java.util.LinkedList;

public class Question4 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(solution4(s));
    }
    public static int solution4(String s) {
        if ( s.length() == 0 ) {
            return 0;
        }
        Deque<Character> deque = new LinkedList<>();
        int index = 0;
        int res = 0;
        while ( index < s.length() ){
            char c = s.charAt(index);
            while ( deque.contains(c) ) {
                deque.pollFirst();
            }
            deque.addLast(s.charAt(index));
            if ( deque.size() > res ) {
                res = deque.size();
            }
            index++;
        }
        return res;
    }
}
