import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && new boolean[n + 8] instanceof boolean[] d2 && new boolean[n + 8] instanceof boolean[] d3
            && IntStream.range(0, Math.max(0, n - 6)).map(j -> n - 2 - j).filter(i -> ((d2[i] = i + 2 <= n && (i + 2 == n || (d2[i + 2] && !s.regionMatches(i, s, i + 2, 2)) || d3[i + 2]))
                | (d3[i] = i + 3 <= n && (i + 3 == n || d2[i + 3] || (d3[i + 3] && !s.regionMatches(i, s, i + 3, 3))))) || true).count() >= 0
            && Stream.concat(IntStream.rangeClosed(5, n - 2).filter(i -> d2[i]).mapToObj(i -> s.substring(i, i + 2)), IntStream.rangeClosed(5, n - 2).filter(i -> d3[i]).mapToObj(i -> s.substring(i, i + 3)))
                .distinct().sorted().toArray(String[]::new) instanceof String[] res
            ? res.length == 0 ? "0" : res.length + "\n" + String.join("\n", res) : "");
    }
}
