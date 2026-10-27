import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] nums
            && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                    : i < raw.length && raw[i] >= 'a' && raw[i] <= 'z'
                        ? st[2] == 2 || ((nums[st[1]++] = raw[i] == 'a' ? 1 : raw[i] == 'r' ? 2 : 3) > 0 && (st[2] = 2) > 0)
                        : (st[2] != 1 || ((nums[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0)) && (st[2] = 0) == 0)
            && IntStream.range(0, nums[0]).map(i -> nums[2 + 3 * i]).sorted().toArray() instanceof int[] sx
            && IntStream.range(0, sx.length).filter(i -> i == 0 || sx[i] != sx[i - 1]).map(i -> sx[i]).toArray() instanceof int[] xs
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, xs.length - 1)) * 2) instanceof Integer N
            && new TreeSet<Long>() instanceof TreeSet<Long> set
            && IntStream.generate(() -> -1).limit(2 * N).toArray() instanceof int[] tr
            && new int[]{0, 0} instanceof int[] q
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] first
            && (first[0] = node ->
                tr[node] <= q[1] ? -1
                : node >= N ? (node - N >= q[0] ? node - N : -1)
                : (((node - (1 << (31 - Integer.numberOfLeadingZeros(node)))) + 1) * (N >> (31 - Integer.numberOfLeadingZeros(node))) - 1) < q[0] ? -1
                : (Integer) first[0].applyAsInt(2 * node) instanceof Integer rr && rr >= 0 ? rr : first[0].applyAsInt(2 * node + 1)) != null
            && new IntPredicate[1] instanceof IntPredicate[] up
            && (up[0] = i -> i < 1 || ((tr[i] = Math.max(tr[2 * i], tr[2 * i + 1])) >= -1 && up[0].test(i >> 1))) != null
            ? IntStream.range(0, nums[0]).mapToObj(r ->
                    (Integer) Arrays.binarySearch(xs, nums[2 + 3 * r]) instanceof Integer xi
                    && (Long) ((long) xi << 31 | nums[3 + 3 * r]) instanceof Long key
                    ? nums[1 + 3 * r] == 3
                        ? (q[0] = xi + 1) > 0
                            && (q[1] = nums[3 + 3 * r]) >= 0
                            && (Integer) first[0].applyAsInt(1) instanceof Integer fi && fi >= 0
                                ? xs[fi] + " " + (set.higher((long) fi << 31 | nums[3 + 3 * r]) & 2147483647L)
                                : "-1"
                        : (nums[1 + 3 * r] == 1 ? set.add(key) : set.remove(key)) | true
                            && (tr[xi + N] = (Long) set.lower((long) (xi + 1) << 31) instanceof Long lk && lk >> 31 == xi ? (int) (lk & 2147483647L) : -1) >= -1
                            && up[0].test((xi + N) >> 1)
                            ? ""
                            : ""
                    : "")
                .filter(o -> !o.isEmpty()).collect(Collectors.joining("\n"))
            : "");
    }
}


