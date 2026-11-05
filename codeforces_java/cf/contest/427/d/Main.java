import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t
            && (Integer) s.length() instanceof Integer n && (s + "{" + t).chars().map(ch -> ch - 'a').toArray() instanceof int[] u
            && new int[2 * u.length + 3][27] instanceof int[][] nx && new int[2 * u.length + 3] instanceof int[] len && new int[2 * u.length + 3] instanceof int[] link
            && new int[2 * u.length + 3] instanceof int[] cs && new int[2 * u.length + 3] instanceof int[] ct && new int[]{1, 1} instanceof int[] st
            && IntStream.range(0, u.length).allMatch(k -> (Integer) u[k] instanceof Integer c && (Integer) (++st[1]) instanceof Integer cur
                && (len[cur] = len[st[0]] + 1) > 0
                && (k < n ? (cs[cur] = 1) > 0 : k > n ? (ct[cur] = 1) > 0 : true)
                && (Integer) IntStream.iterate(st[0], x -> link[x]).filter(x -> x == 0 || nx[x][c] != 0 || (nx[x][c] = cur) < 0).findFirst().getAsInt() instanceof Integer p
                && (p == 0 ? (link[cur] = 1) > 0
                    : (Integer) nx[p][c] instanceof Integer q
                        && (len[p] + 1 == len[q] ? (link[cur] = q) > 0
                            : (Integer) (++st[1]) instanceof Integer cl && (nx[cl] = nx[q].clone()) != null && (len[cl] = len[p] + 1) > 0 && (link[cl] = link[q]) >= 0
                                && IntStream.iterate(p, x -> link[x]).filter(x -> x == 0 || nx[x][c] != q || (nx[x][c] = cl) < 0).findFirst().isPresent()
                                && (link[q] = cl) > 0 && (link[cur] = cl) > 0))
                && (st[0] = cur) > 0)
            && IntStream.rangeClosed(2, st[1]).boxed().sorted(Comparator.comparingInt(v -> -len[v])).allMatch(v -> (cs[link[v]] += cs[v]) >= 0 && (ct[link[v]] += ct[v]) >= 0)
            ? IntStream.rangeClosed(2, st[1]).filter(v -> cs[v] == 1 && ct[v] == 1).map(v -> len[link[v]] + 1).min().orElse(-1) : 0);
    }
}

