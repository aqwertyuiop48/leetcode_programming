import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && new int[n] instanceof int[] deg && new int[n] instanceof int[] xr
            && IntStream.range(0, n).allMatch(i -> (deg[i] = s.nextInt()) >= 0 && (xr[i] = s.nextInt()) >= 0)
            && new ArrayDeque<Integer>(IntStream.range(0, n).filter(i -> deg[i] == 1).boxed().toList()) instanceof ArrayDeque<Integer> q
            && new StringBuilder() instanceof StringBuilder sb && new int[1] instanceof int[] cnt
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(v ->
                deg[v] != 1 || (Integer) xr[v] instanceof Integer u && sb.append(v).append(' ').append(u).append('\n') != null
                    && ++cnt[0] > 0 && (deg[v] = 0) == 0 && (xr[u] ^= v) >= 0 && (--deg[u] != 1 || q.add(u)))
            ? cnt[0] + "\n" + sb : "");
    }
}
