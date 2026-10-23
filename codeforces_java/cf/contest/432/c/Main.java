import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && new int[n + 2] instanceof int[] a && new int[n + 2] instanceof int[] pos && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = s.nextInt()) > 0 && (pos[a[i]] = i) > 0)
            && IntStream.rangeClosed(0, n + 1).map(i -> i < 2 || IntStream.rangeClosed(2, (int) Math.sqrt(i)).anyMatch(j -> i % j == 0) ? 0 : i).toArray() instanceof int[] pr
            && new int[n + 2] instanceof int[] lp && IntStream.rangeClosed(2, n).allMatch(i -> (lp[i] = pr[i] != 0 ? i : lp[i - 1]) > 0)
            && new StringBuilder() instanceof StringBuilder sb && new int[1] instanceof int[] cnt
            && IntStream.rangeClosed(1, n).allMatch(v -> Stream.iterate(pos[v], p -> p > v, p -> p - lp[p - v + 1] + 1).allMatch(p -> (Integer) (p - lp[p - v + 1] + 1) instanceof Integer x && (Integer) a[x] instanceof Integer u && (Integer) a[p] instanceof Integer w
                && (a[x] = w) > 0 && (a[p] = u) > 0 && (pos[w] = x) > 0 && (pos[u] = p) > 0 && sb.append(x).append(' ').append(p).append('\n') != null && ++cnt[0] > 0))
            ? cnt[0] + "\n" + sb.toString().trim() : "");
    }
}
