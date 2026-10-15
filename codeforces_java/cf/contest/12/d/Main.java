import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : st[2] == 0 || ((nums[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)))
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && Arrays.copyOfRange(nums, 1, 1 + n) instanceof long[] B
            && Arrays.copyOfRange(nums, 1 + n, 1 + 2 * n) instanceof long[] I
            && Arrays.copyOfRange(nums, 1 + 2 * n, 1 + 3 * n) instanceof long[] R
            && Arrays.stream(I).sorted().distinct().toArray() instanceof long[] sortedI
            && Integer.valueOf(sortedI.length) instanceof Integer K
            && IntStream.range(0, n).map(i -> K - Arrays.binarySearch(sortedI, I[i])).toArray() instanceof int[] transPos
            && IntStream.range(0, n).mapToLong(i -> B[i] << 20 | i).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, n).map(t -> (int) (keys[n - 1 - t] & 1048575)).toArray() instanceof int[] order
            && new long[K + 1] instanceof long[] bit
            && new boolean[n] instanceof boolean[] killed
            && new long[1] instanceof long[] vv
            && new AtomicReference<IntToLongFunction>() instanceof AtomicReference<IntToLongFunction> bq
            && bq.getAndSet(p -> p <= 0 ? 0L : Math.max(bit[p], bq.get().applyAsLong(p - (p & -p)))) == null
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> bu
            && bu.getAndSet(p -> p > K || ((bit[p] = Math.max(bit[p], vv[0])) >= 0 && bu.get().test(p + (p & -p)))) == null
            && IntStream.range(0, n).filter(t -> t == 0 || B[order[t]] != B[order[t - 1]]).toArray() instanceof int[] starts
            && IntStream.range(0, starts.length).allMatch(gi ->
                IntStream.range(starts[gi], gi + 1 < starts.length ? starts[gi + 1] : n).allMatch(t ->
                    (killed[order[t]] = bq.get().applyAsLong(transPos[order[t]] - 1) > R[order[t]]) || true)
                && IntStream.range(starts[gi], gi + 1 < starts.length ? starts[gi + 1] : n).allMatch(t ->
                    (vv[0] = R[order[t]]) >= 0 && bu.get().test(transPos[order[t]])))
            ? IntStream.range(0, n).filter(i -> killed[i]).count()
            : 0L);
    }
}



