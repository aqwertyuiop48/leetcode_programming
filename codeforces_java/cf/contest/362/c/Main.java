import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] raw
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> raw[i])).toList() instanceof List<Integer> ord && new int[n] instanceof int[] a
            && IntStream.range(0, n).allMatch(r -> (a[ord.get(r)] = r) >= 0)
            && new short[n + 1][n + 1] instanceof short[][] P
            && IntStream.rangeClosed(0, n).allMatch(v -> IntStream.range(0, n).allMatch(x -> (P[v][x + 1] = (short) (P[v][x] + (a[x] < v ? 1 : 0))) >= 0))
            && Long.valueOf(IntStream.range(0, n).mapToLong(i -> IntStream.range(i + 1, n).filter(j -> a[i] > a[j]).count()).sum()) instanceof Long base
            && new int[4 * n + 6] instanceof int[] hist
            && IntStream.range(0, n).allMatch(i -> IntStream.range(i + 1, n).allMatch(j -> hist[2 * n + 2 + (a[i] > a[j]
                ? -1 - 2 * (P[a[i]][j] - P[a[i]][i + 1] - (P[a[j] + 1][j] - P[a[j] + 1][i + 1]))
                : 1 + 2 * (P[a[j]][j] - P[a[j]][i + 1] - (P[a[i] + 1][j] - P[a[i] + 1][i + 1])))]++ >= 0))
            && IntStream.range(0, hist.length).filter(x -> hist[x] > 0).findFirst() instanceof OptionalInt fi
            ? fi.isPresent() ? (base + fi.getAsInt() - 2 * n - 2) + " " + hist[fi.getAsInt()] : "" : "");
    }
}
