import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, 2 * n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] ab
            && Arrays.stream(ab).distinct().sorted().toArray() instanceof int[] pos && (Integer) pos.length instanceof Integer k
            && IntStream.range(0, k).toArray() instanceof int[] val
            && IntStream.range(0, n).allMatch(i -> (Integer) Arrays.binarySearch(pos, ab[2 * i]) instanceof Integer x && (Integer) Arrays.binarySearch(pos, ab[2 * i + 1]) instanceof Integer y
                && (Integer) val[x] instanceof Integer tmp && (val[x] = val[y]) >= 0 && (val[y] = tmp) >= 0)
            && new int[k + 1] instanceof int[] bit
            ? IntStream.range(0, k).mapToLong(i -> (Long) (long) (i - IntStream.iterate(val[i] + 1, j -> j > 0, j -> j & (j - 1)).map(j -> bit[j]).sum()) instanceof Long inv
                && IntStream.iterate(val[i] + 1, j -> j <= k, j -> j + (j & -j)).peek(j -> bit[j]++).count() >= 0
                ? inv + Math.abs((long) pos[i] - pos[val[i]]) - Math.abs(i - val[i]) : 0).sum() : 0);
    }
}
