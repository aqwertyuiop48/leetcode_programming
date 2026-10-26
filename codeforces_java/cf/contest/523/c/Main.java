import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t
            && new int[]{0, 0, 0} instanceof int[] f && IntStream.range(0, t.length()).anyMatch(i -> (f[0] < s.length() && t.charAt(i) == s.charAt(f[0]) && ++f[0] > 0 && f[0] == s.length() && (f[1] = i + 1) > 0))
            && new int[]{0, 0} instanceof int[] g && IntStream.range(0, t.length()).anyMatch(i -> (g[0] < s.length() && t.charAt(t.length() - 1 - i) == s.charAt(s.length() - 1 - g[0]) && ++g[0] > 0 && g[0] == s.length() && (g[1] = i + 1) > 0))
            ? f[1] == 0 || g[1] == 0 ? 0 : Math.max(0, t.length() - f[1] - g[1] + 1) : 0);
    }
}
