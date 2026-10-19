import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t
            && Integer.valueOf(s.length()) instanceof Integer n && Integer.valueOf(t.length()) instanceof Integer m
            && new int[n + 1] instanceof int[] g && new int[n + 1] instanceof int[] h
            && IntStream.rangeClosed(1, n).allMatch(k -> (g[k] = g[k - 1] + (g[k - 1] < m && t.charAt(g[k - 1]) == s.charAt(k - 1) ? 1 : 0)) >= 0
                && (h[k] = h[k - 1] >= m ? 1 << 20 : IntStream.rangeClosed(h[k - 1] + 1, m).filter(j -> t.charAt(j - 1) == s.charAt(k - 1)).findFirst().orElse(1 << 20)) > 0)
            ? IntStream.rangeClosed(1, n).mapToLong(x -> IntStream.rangeClosed(g[x - 1] + 1, Math.min(h[x], m)).filter(y -> !(x >= 2 && y >= 2 && s.charAt(x - 2) != s.charAt(x - 1) && t.charAt(y - 2) == s.charAt(x - 1) && t.charAt(y - 1) == s.charAt(x - 2))).count()).sum() : "");
    }
}
