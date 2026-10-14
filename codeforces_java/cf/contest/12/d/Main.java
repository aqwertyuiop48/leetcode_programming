import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new long[n] instanceof long[] B
                && IntStream.range(0, n).allMatch(i -> (B[i] = s.nextLong()) >= 0)
                && new long[n] instanceof long[] I
                && IntStream.range(0, n).allMatch(i -> (I[i] = s.nextLong()) >= 0)
                && new long[n] instanceof long[] R
                && IntStream.range(0, n).allMatch(i -> (R[i] = s.nextLong()) >= 0)
                && Arrays.stream(I).sorted().distinct().toArray() instanceof long[] sortedI
                && new int[]{sortedI.length} instanceof int[] K
                && new int[n] instanceof int[] transPos
                && IntStream.range(0, n).allMatch(i -> (transPos[i] = K[0] - Arrays.binarySearch(sortedI, I[i])) >= 0)
                && IntStream.range(0, n).boxed().sorted((x, y) -> Long.compare(B[y], B[x])).mapToInt(Integer::intValue).toArray() instanceof int[] order
                && new long[K[0] + 1] instanceof long[] bit
                && new boolean[n] instanceof boolean[] killed
                && new AtomicReference<IntFunction<Long>>() instanceof AtomicReference<IntFunction<Long>> bq
                && bq.getAndSet(pos -> pos <= 0 ? 0L : Math.max(bit[pos], bq.get().apply(pos - (pos & (-pos))))) == null
                && new AtomicReference<BiFunction<Integer, Long, Boolean>>() instanceof AtomicReference<BiFunction<Integer, Long, Boolean>> bu
                && bu.getAndSet((pos, val) -> pos > K[0] || ((bit[pos] = Math.max(bit[pos], val)) >= 0 && bu.get().apply(pos + (pos & (-pos)), val))) == null
                && ((BiFunction<Integer, Integer, Boolean>) ((start, end) ->
                        IntStream.range(start, end).allMatch(idxv -> (killed[order[idxv]] = bq.get().apply(transPos[order[idxv]] - 1) > R[order[idxv]]) || true)
                        && IntStream.range(start, end).allMatch(idxv -> bu.get().apply(transPos[order[idxv]], R[order[idxv]])))) instanceof BiFunction<Integer, Integer, Boolean> processGroup
                && IntStream.range(0, n).filter(idxv -> idxv == 0 || B[order[idxv]] != B[order[idxv - 1]]).toArray() instanceof int[] starts
                && IntStream.range(0, starts.length).allMatch(gi ->
                    processGroup.apply(starts[gi], gi + 1 < starts.length ? starts[gi + 1] : n))
                ? IntStream.range(0, n).filter(i -> killed[i]).count()
                : 0L)));
    }
}
