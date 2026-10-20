import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && LongStream.generate(() -> Long.parseLong(st.nextToken())).limit(n).toArray() instanceof long[] a
            && new long[n + 1] instanceof long[] pp
            && IntStream.range(0, n).mapToLong(i -> pp[i + 1] = pp[i] + Math.max(a[i], 0)).max().orElse(0) >= 0
            && new HashMap<Long, int[]>() instanceof HashMap<Long, int[]> mp
            && IntStream.range(0, n).filter(i -> mp.merge(a[i], new int[]{i, i}, (x, y) -> new int[]{x[0], y[1]}) == null).count() == 0
            && mp.entrySet().stream().filter(e -> e.getValue()[0] < e.getValue()[1])
                .max(Comparator.comparingLong(e -> 2 * e.getKey() + pp[e.getValue()[1]] - pp[e.getValue()[0] + 1])) instanceof Optional<Map.Entry<Long, int[]>> be
            && be.isPresent() && Long.valueOf(be.get().getKey()) instanceof Long v && be.get().getValue() instanceof int[] fl
            && IntStream.range(0, n).filter(j -> j < fl[0] || j > fl[1] || a[j] < 0 && j > fl[0] && j < fl[1]).map(j -> j + 1).toArray() instanceof int[] cut
            ? (2 * v + pp[fl[1]] - pp[fl[0] + 1]) + " " + cut.length + "\n" + Arrays.stream(cut).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
