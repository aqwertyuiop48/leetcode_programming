import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextInt(), s.nextInt()}).ifPresent(nk ->
            System.out.println(
                IntStream.range(0, (int) nk[0]).map(i -> s.nextInt()).toArray() instanceof int[] v
                && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> maxDq
                && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> minDq
                && new int[]{0} instanceof int[] left
                && new long[]{0} instanceof long[] best
                && new ArrayList<int[]>() instanceof ArrayList<int[]> results
                && IntStream.range(0, (int) nk[0]).allMatch(right ->
                    Stream.iterate(0, x -> !maxDq.isEmpty() && v[maxDq.peekLast()] <= v[right], x -> maxDq.pollLast() != null ? 0 : 0).count() >= 0
                    && maxDq.offerLast(right)
                    && Stream.iterate(0, x -> !minDq.isEmpty() && v[minDq.peekLast()] >= v[right], x -> minDq.pollLast() != null ? 0 : 0).count() >= 0
                    && minDq.offerLast(right)
                    && Stream.iterate(0, x -> v[maxDq.peekFirst()] - v[minDq.peekFirst()] > nk[1],
                            x -> (maxDq.peekFirst() == left[0] ? maxDq.pollFirst() != null : true)
                                && (minDq.peekFirst() == left[0] ? minDq.pollFirst() != null : true)
                                && (left[0] += 1) >= 0 ? 0 : 0).count() >= 0
                    && (right - left[0] + 1 > best[0]
                        ? ((results.removeIf(x -> true) || true) && (best[0] = right - left[0] + 1) >= 0 && results.add(new int[]{left[0] + 1, right + 1}))
                        : (right - left[0] + 1 == best[0] ? results.add(new int[]{left[0] + 1, right + 1}) : true)))
                ? best[0] + " " + results.size() + "\n" + results.stream().map(r -> r[0] + " " + r[1]).collect(Collectors.joining("\n"))
                : "")));
    }
}
