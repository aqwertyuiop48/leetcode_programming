import java.math.BigInteger;
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
            && ((BinaryOperator<BigInteger>) (a, b) -> a == null ? b : a.max(b)) instanceof BinaryOperator<BigInteger> mx
            && new AtomicReference<BiFunction<Integer, Integer, BigInteger[]>>() instanceof AtomicReference<BiFunction<Integer, Integer, BigInteger[]>> dfsRef
            && dfsRef.getAndSet((v, p) ->
                    new BigInteger[][]{{null, BigInteger.ONE}} instanceof BigInteger[][] cur
                    && IntStream.range(0, adj[v].length).allMatch(ci ->
                            adj[v][ci] == p
                            || (dfsRef.get().apply(adj[v][ci], v) instanceof BigInteger[] ch
                                && IntStream.range(1, ch.length).filter(t -> ch[t] != null).mapToObj(t -> ch[t].multiply(BigInteger.valueOf(t))).reduce(BigInteger::max).orElse(BigInteger.ONE) instanceof BigInteger cut
                                && new BigInteger[cur[0].length + ch.length - 1] instanceof BigInteger[] nd
                                && IntStream.range(1, cur[0].length).allMatch(sv ->
                                        cur[0][sv] == null
                                        || ((nd[sv] = mx.apply(nd[sv], cur[0][sv].multiply(cut))) != null
                                            && IntStream.range(1, ch.length).allMatch(t ->
                                                    ch[t] == null
                                                    || (nd[sv + t] = mx.apply(nd[sv + t], cur[0][sv].multiply(ch[t]))) != null)))
                                && (cur[0] = nd) != null))
                    ? cur[0]
                    : new BigInteger[]{null, BigInteger.ONE}) == null
            && dfsRef.get().apply(1, -1) instanceof BigInteger[] rootDp
            ? IntStream.range(1, rootDp.length).filter(sv -> rootDp[sv] != null).mapToObj(sv -> rootDp[sv].multiply(BigInteger.valueOf(sv))).reduce(BigInteger::max).get().toString()
            : "");
    }
}




