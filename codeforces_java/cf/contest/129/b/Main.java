import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm -> Optional.of(new boolean[nm[0]][nm[0]]).ifPresent(g -> Optional.of(new int[nm[0]]).ifPresent(deg -> Optional.of(new int[1]).ifPresent(cnt -> System.out.print(IntStream.range(0, nm[1]).allMatch(i -> new int[]{s.nextInt() - 1, s.nextInt() - 1} instanceof int[] e && (g[e[0]][e[1]] = g[e[1]][e[0]] = true) && ++deg[e[0]] > 0 && ++deg[e[1]] > 0) && IntStream.range(0, nm[0] + 1).allMatch(r -> IntStream.range(0, nm[0]).filter(v -> deg[v] == 1).toArray() instanceof int[] L && L.length > 0 && cnt[0]++ >= 0 && Arrays.stream(L).allMatch(v -> IntStream.range(0, nm[0]).filter(u -> g[v][u]).allMatch(u -> !(g[v][u] = g[u][v] = false) && --deg[u] >= -9 && --deg[v] >= -9))) ? cnt[0] : cnt[0]))))));
    }
}
