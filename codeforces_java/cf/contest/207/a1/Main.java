import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> LongStream.range(0, 5).map(j -> Long.parseLong(tk.nextToken())).toArray()).toArray(long[][]::new) instanceof long[][] sc
            && (Long) Arrays.stream(sc).mapToLong(r -> r[0]).sum() instanceof Long total
            ? total > 200000 ? String.valueOf(Arrays.stream(sc).mapToLong(r -> new long[]{r[1], 0} instanceof long[] cur
                    ? 1 + LongStream.range(1, r[0]).map(j -> ((cur[1] = (cur[0] * r[2] + r[3]) % r[4]) < cur[0] ? 1L : 0L) + ((cur[0] = cur[1]) & 0L)).sum() : 0).max().getAsLong() - 1)
            : new long[n] instanceof long[] cur && new long[n] instanceof long[] rem
                && IntStream.range(0, n).allMatch(i -> (cur[i] = sc[i][1]) >= 0 && (rem[i] = sc[i][0]) > 0)
                && new TreeSet<long[]>(Comparator.<long[]>comparingLong(e -> e[0]).thenComparingLong(e -> e[1])) instanceof TreeSet<long[]> set
                && IntStream.range(0, n).allMatch(i -> set.add(new long[]{cur[i], i}))
                && new long[]{Long.MIN_VALUE, 0} instanceof long[] last
                && Stream.generate(() -> set.isEmpty() ? null
                        : Optional.ofNullable(set.ceiling(new long[]{last[0], -1})).orElseGet(set::first) instanceof long[] e
                            && set.remove(e) && (last[1] += e[0] < last[0] ? 1 : 0) >= 0 && (last[0] = e[0]) > Long.MIN_VALUE
                            && (Integer) (int) e[1] instanceof Integer i
                            && ((rem[i] -= 1) > 0 ? (cur[i] = (cur[i] * sc[i][2] + sc[i][3]) % sc[i][4]) >= 0 && set.add(new long[]{cur[i], i}) : true)
                            ? e[0] + " " + (i + 1) : null).takeWhile(Objects::nonNull).toList() instanceof List<String> lines
                ? last[1] + "\n" + String.join("\n", lines) : "" : "");
    }
}

