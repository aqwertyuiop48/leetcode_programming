import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s
            && new ArrayDeque<Long>() instanceof ArrayDeque<Long> st
            && s.chars().allMatch(c -> Character.isDigit(c) ? st.offerFirst((long) (c - '0'))
                : st.pollFirst() instanceof Long b && st.pollFirst() instanceof Long a && st.offerFirst(c == '+' ? a + b : c == '-' ? a - b : c == '*' ? a * b : a / b))
            ? st.peekFirst()
            : "");
    }
}
