import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] h
                && IntStream.range(0, n).boxed().max(Comparator.comparingInt(i -> h[i])).get() instanceof Integer maxIdx
                && IntStream.range(0, n).map(k -> h[(maxIdx + k) % n]).toArray() instanceof int[] g
                && new int[n] instanceof int[] prefMax
                && new int[n] instanceof int[] sufMax
                && IntStream.rangeClosed(2, n - 1).allMatch(j -> (prefMax[j] = Math.max(prefMax[j - 1], g[j - 1])) >= 0)
                && IntStream.iterate(n - 2, j -> j >= 1, j -> j - 1).allMatch(j -> (sufMax[j] = Math.max(sufMax[j + 1], g[j + 1])) >= 0)
                && new long[]{IntStream.rangeClosed(1, n - 1).filter(j -> prefMax[j] < g[j] || sufMax[j] < g[j]).count()} instanceof long[] maxPairs
                && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st
                && new long[]{0} instanceof long[] nonMaxPairs
                && IntStream.rangeClosed(1, n - 1).allMatch(k ->
                    Stream.iterate(g[k], hv -> !st.isEmpty() && st.peekFirst() < hv,
                        hv -> (st.pollFirst() != null && (nonMaxPairs[0] += 1) >= 0) ? hv : hv).count() >= 0
                    && (st.isEmpty() || (nonMaxPairs[0] += 1) >= 0)
                    && st.offerFirst(g[k]))
                ? (nonMaxPairs[0] + maxPairs[0])
                : 0L)));
    }
}

