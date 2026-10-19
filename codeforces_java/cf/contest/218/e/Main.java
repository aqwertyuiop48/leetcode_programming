import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && s.next() instanceof String e
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> vals && new ArrayDeque<Character>() instanceof ArrayDeque<Character> ops
            && e.chars().allMatch(c -> c == '(' || (c == '?' ? vals.offerFirst(6)
                : c == ')' ? Character.valueOf(ops.pollFirst()) instanceof Character op && Integer.valueOf(vals.pollFirst()) instanceof Integer b && Integer.valueOf(vals.pollFirst()) instanceof Integer a
                    && vals.offerFirst(IntStream.range(0, 4).filter(x -> (a >> x & 1) == 1).flatMap(x -> IntStream.range(0, 4).filter(y -> (b >> y & 1) == 1).map(y -> 1 << (op == '&' ? x & y : op == '|' ? x | y : x ^ y))).reduce(0, (u, w) -> u | w))
                : ops.offerFirst((char) c)))
            ? (vals.peekFirst() & 6) != 0 ? "YES" : "NO" : "");
    }
}
