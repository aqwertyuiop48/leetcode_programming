import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s
            && Long.valueOf(s.chars().filter(c -> c == 'Q').count()) instanceof Long q && Long.valueOf(Math.round(Math.sqrt(q))) instanceof Long nq && Long.valueOf(s.length() - q) instanceof Long h
            && (nq == 0 || nq * nq == q && h % (nq + 1) == 0 && Integer.valueOf(s.indexOf('Q')) instanceof Integer k && k % 2 == 0 && k / 2 + h / (nq + 1) + nq <= s.length()
                && s.substring(k / 2, (int) (k / 2 + h / (nq + 1) + nq)) instanceof String p && p.chars().mapToObj(c -> c == 'H' ? "H" : p).collect(Collectors.joining()).equals(s))
            ? "Yes" : "No");
    }
}

