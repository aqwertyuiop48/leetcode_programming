import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n * m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] raw
            && IntStream.of(raw).distinct().sorted().toArray() instanceof int[] vals
            && IntStream.range(0, m).mapToObj(j -> IntStream.range(0, n).map(i -> Arrays.binarySearch(vals, raw[i * m + j])).toArray()).toArray(int[][]::new) instanceof int[][] a
            && new int[vals.length + 1] instanceof int[] lastL && new int[vals.length + 1] instanceof int[] lastR
            && new int[m][n] instanceof int[][] cur && new int[m][n] instanceof int[][] prv && new int[]{0} instanceof int[] best
            && IntStream.range(0, m).map(t -> m - 1 - t).allMatch(l -> IntStream.range(l, m).allMatch(r -> IntStream.range(0, n).allMatch(i ->
                    (l == r ? (cur[r][i] = Math.max(i > 0 ? cur[r][i - 1] : 0, lastL[a[l][i]]) ) >= 0 && (lastL[a[l][i]] = i + 1) > 0
                        : (lastL[a[l][i]] = i + 1) > 0 && (lastR[a[r][i]] = i + 1) > 0
                            && (cur[r][i] = Math.max(Math.max(i > 0 ? cur[r][i - 1] : 0, Math.max(prv[r][i], cur[r - 1][i])), Math.max(lastR[a[l][i]], lastL[a[r][i]]))) >= 0)
                    && (best[0] = Math.max(best[0], cur[r][i] <= i ? (r - l + 1) * (i - cur[r][i] + 1) : 0)) >= 0)
                && IntStream.range(0, n).allMatch(i -> (lastL[a[l][i]] = 0) == 0 && (lastR[a[r][i]] = 0) == 0))
                && IntStream.range(l, m).allMatch(r -> IntStream.range(0, n).allMatch(i -> (prv[r][i] = cur[r][i]) >= 0)))
            ? best[0] : 0);
    }
}
