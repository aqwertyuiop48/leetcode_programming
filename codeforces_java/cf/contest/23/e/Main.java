import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt()} instanceof int[] nArr
            && new int[Math.max(0, 2 * (nArr[0] - 1))] instanceof int[] ef
            && IntStream.range(0, ef.length).allMatch(i -> (ef[i] = s.nextInt()) >= 0)
            && new int[nArr[0] + 1] instanceof int[] deg
            && IntStream.range(0, nArr[0] - 1).allMatch(i -> (deg[ef[2 * i]] += 1) >= 0 && (deg[ef[2 * i + 1]] += 1) >= 0)
            && IntStream.range(0, nArr[0] + 1).mapToObj(i -> new int[deg[i]]).toArray(int[][]::new) instanceof int[][] adj
            && new int[nArr[0] + 1] instanceof int[] pos
            && IntStream.range(0, nArr[0] - 1).allMatch(i ->
                    (adj[ef[2 * i]][pos[ef[2 * i]]++] = ef[2 * i + 1]) >= 0
                    && (adj[ef[2 * i + 1]][pos[ef[2 * i + 1]]++] = ef[2 * i]) >= 0)
            && new AtomicReference<BiFunction<Integer, Integer, long[]>>() instanceof AtomicReference<BiFunction<Integer, Integer, long[]>> dfsRef
            && dfsRef.getAndSet((v, p) ->
                    new long[][]{{0L, 1L}} instanceof long[][] curDpHolder
                    && IntStream.range(0, adj[v].length).allMatch(ci ->
                            adj[v][ci] == p
                            || (dfsRef.get().apply(adj[v][ci], v) instanceof long[] childDp
                                && new long[]{IntStream.range(1, childDp.length).filter(t -> childDp[t] >= 0).mapToLong(t -> childDp[t] * t).max().orElse(0)} instanceof long[] bestCutArr
                                && new long[curDpHolder[0].length + childDp.length - 1] instanceof long[] newDp
                                && IntStream.range(0, newDp.length).allMatch(k -> (newDp[k] = -1L) == -1L)
                                && IntStream.range(1, curDpHolder[0].length).allMatch(sVal ->
                                        curDpHolder[0][sVal] < 0
                                        || ((newDp[sVal] = Math.max(newDp[sVal], curDpHolder[0][sVal] * Math.max(bestCutArr[0], 1))) >= Long.MIN_VALUE
                                            && IntStream.range(1, childDp.length).allMatch(t ->
                                                    childDp[t] < 0
                                                    || (newDp[sVal + t] = Math.max(newDp[sVal + t], curDpHolder[0][sVal] * childDp[t])) >= Long.MIN_VALUE)))
                                && (curDpHolder[0] = newDp) != null))
                    ? curDpHolder[0]
                    : new long[]{0L, 1L}) == null
            && dfsRef.get().apply(1, -1) instanceof long[] rootDp
            ? IntStream.range(1, rootDp.length).filter(sVal -> rootDp[sVal] >= 0).mapToLong(sVal -> rootDp[sVal] * sVal).max().orElse(0)
            : 0L);
    }
}

