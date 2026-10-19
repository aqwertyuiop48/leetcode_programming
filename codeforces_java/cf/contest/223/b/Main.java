import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s && sc.next() instanceof String t
            && Integer.valueOf(s.length()) instanceof Integer n && Integer.valueOf(t.length()) instanceof Integer m
            && new int[n + 1] instanceof int[] pre && new int[n + 2] instanceof int[] suf && new int[1] instanceof int[] cur
            && IntStream.range(0, n).allMatch(i -> (pre[i] = cur[0]) >= 0 && (cur[0] >= m || s.charAt(i) != t.charAt(cur[0]) || ++cur[0] > 0))
            && (cur[0] = 0) == 0
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (suf[i] = cur[0]) >= 0 && (cur[0] >= m || s.charAt(i) != t.charAt(m - 1 - cur[0]) || ++cur[0] > 0))
            && new int[26][m] instanceof int[][] last
            && IntStream.range(0, 26).allMatch(c -> new int[]{-1} instanceof int[] lj && IntStream.range(0, m).allMatch(j -> (last[c][j] = t.charAt(j) - 'a' == c ? (lj[0] = j) : lj[0]) >= -1))
            ? IntStream.range(0, n).allMatch(i -> Integer.valueOf(Math.min(pre[i], m - 1)) instanceof Integer p && last[s.charAt(i) - 'a'][p] >= m - 1 - suf[i] && last[s.charAt(i) - 'a'][p] >= 0) ? "Yes" : "No" : "");
    }
}
