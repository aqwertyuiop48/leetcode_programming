import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && new int[]{0} instanceof int[] idx && new int[]{-1} instanceof int[] best && new TreeSet<Integer>() instanceof TreeSet<Integer> set
            && IntStream.iterate(0, z -> idx[0] < n, z -> z + 1).allMatch(z -> Integer.valueOf(idx[0]) instanceof Integer i
                && Integer.valueOf(i - (int) IntStream.iterate(i, j -> j > 0 && a[j - 1] % a[i] == 0, j -> j - 1).count()) instanceof Integer l
                && Integer.valueOf(i + (int) IntStream.iterate(i, j -> j < n - 1 && a[j + 1] % a[i] == 0, j -> j + 1).count()) instanceof Integer r
                && Integer.valueOf(r - l) instanceof Integer len
                && ((len > best[0] && (best[0] = len) >= 0 && (set.removeIf(x -> true) | true)) | true)
                && (len < best[0] || set.add(l)) && (idx[0] = r + 1) > 0)
            ? set.size() + " " + best[0] + "\n" + set.stream().map(l -> String.valueOf(l + 1)).collect(Collectors.joining(" ")) : "");
    }
}
