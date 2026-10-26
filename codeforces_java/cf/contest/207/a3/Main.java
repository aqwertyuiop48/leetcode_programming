import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> LongStream.range(0, 5).map(j -> Long.parseLong(tk.nextToken())).toArray()).toArray(long[][]::new) instanceof long[][] sc
            && (Long) Arrays.stream(sc).mapToLong(r -> r[0]).sum() instanceof Long total
            ? total > 200000
                ? String.valueOf(Arrays.stream(sc).parallel().mapToLong(r -> new long[]{r[1], 0} instanceof long[] cur
                    ? LongStream.range(1, r[0]).map(j -> ((cur[1] = (cur[0] * r[2] + r[3]) % r[4]) < cur[0] ? 1L : 0L) + ((cur[0] = cur[1]) & 0L)).sum() : 0).max().getAsLong())
                : IntStream.range(0, n).boxed().flatMap(i -> new long[]{sc[i][1], 0, 0} instanceof long[] st
                        ? LongStream.range(0, sc[i][0]).mapToObj(j -> j == 0 ? new long[]{0, st[0], i, j}
                            : (st[2] = (st[0] * sc[i][2] + sc[i][3]) % sc[i][4]) >= 0 && (st[1] += st[2] < st[0] ? 1 : 0) >= 0 && (st[0] = st[2]) >= 0 ? new long[]{st[1], st[0], i, j} : null)
                        : Stream.<long[]>empty())
                    .sorted(Comparator.<long[]>comparingLong(e -> e[0]).thenComparingLong(e -> e[1]).thenComparingLong(e -> e[2]).thenComparingLong(e -> e[3])).toList() instanceof List<long[]> all
                    ? all.get(all.size() - 1)[0] + "\n" + all.stream().map(e -> e[1] + " " + (e[2] + 1)).collect(Collectors.joining("\n")) : "" : "");
    }
}
