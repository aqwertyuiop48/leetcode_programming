import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim() instanceof String s
            && Integer.valueOf((int) s.chars().filter(c -> c == '#').count()) instanceof Integer h
            && Integer.valueOf((int) (s.chars().filter(c -> c == '(').count() - s.chars().filter(c -> c == ')').count()) - h) instanceof Integer extra
            && extra >= 0
            && Integer.valueOf(s.lastIndexOf('#')) instanceof Integer last
            && new int[1] instanceof int[] bal
            && IntStream.range(0, s.length()).allMatch(i ->
                (bal[0] += s.charAt(i) == '(' ? 1 : s.charAt(i) == ')' ? -1 : i == last ? -(extra + 1) : -1) >= 0)
            && bal[0] == 0
            ? "1\n".repeat(h - 1) + (extra + 1)
            : "-1");
    }
}
