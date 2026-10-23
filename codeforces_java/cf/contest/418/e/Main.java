import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a0 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}).toArray(int[][]::new) instanceof int[][] qs
            && IntStream.concat(IntStream.of(a0), Arrays.stream(qs).filter(q -> q[0] == 1).mapToInt(q -> q[1])).distinct().sorted().toArray() instanceof int[] vals
            && (Integer) vals.length instanceof Integer V && IntStream.of(a0).map(v -> Arrays.binarySearch(vals, v)).toArray() instanceof int[] a && (Integer) 1024 instanceof Integer B && (Integer) (n / B + 1) instanceof Integer nb
            && new int[nb][] instanceof int[][] cntB && new int[nb][] instanceof int[][] fB
            && (cntB[0] = new int[V]) != null && (fB[0] = new int[n + 2]) != null
            && IntStream.range(1, nb).allMatch(b -> (cntB[b] = Arrays.copyOf(cntB[b - 1], V)) != null && (fB[b] = Arrays.copyOf(fB[b - 1], n + 2)) != null
                && IntStream.range((b - 1) * B, b * B).allMatch(j -> ++fB[b][++cntB[b][a[j]]] > 0))
            && new int[V] instanceof int[] tmp
            ? Arrays.stream(qs).map(q -> q[0] == 1
                ? (Integer) Arrays.binarySearch(vals, q[1]) instanceof Integer nv && (Integer) (q[2] - 1) instanceof Integer p0 && (Integer) a[p0] instanceof Integer ov
                    && IntStream.range(p0 / B + 1, nb).allMatch(b -> --fB[b][cntB[b][ov]--] >= 0 && ++fB[b][++cntB[b][nv]] > 0) && (a[p0] = nv) >= 0 ? "" : ""
                : q[1] == 1 ? String.valueOf(vals[a[q[2] - 1]])
                : (Integer) ((q[2] - 1) / B) instanceof Integer b && (Integer) (q[2] - 1) instanceof Integer y0
                    && (Integer) (cntB[b][a[y0]] + (int) IntStream.rangeClosed(b * B, y0).filter(j -> a[j] == a[y0]).count()) instanceof Integer r2
                    ? q[1] % 2 == 0 ? String.valueOf(r2)
                        : (Integer) ((r2 <= n ? fB[b][r2] : 0) + (int) IntStream.rangeClosed(b * B, y0).filter(j -> cntB[b][a[j]] + (++tmp[a[j]]) == r2).count()) instanceof Integer r3
                            && IntStream.rangeClosed(b * B, y0).allMatch(j -> (tmp[a[j]] = 0) == 0) ? String.valueOf(r3) : "" : "").filter(z -> !z.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
