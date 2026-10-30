import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer t
            && IntStream.range(0, k).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken())}).sorted(Comparator.comparingInt(a -> a[2])).toArray(int[][]::new) instanceof int[][] e
            && IntStream.rangeClosed(0, k).mapToLong(j -> j == 0 ? 0L : (1L << e[j - 1][0]) | (1L << (20 + e[j - 1][1]))).toArray() instanceof long[] add
            && IntStream.rangeClosed(0, k).mapToLong(j -> j == 0 ? 0L : e[j - 1][2]).toArray() instanceof long[] w
            && new PriorityQueue<long[]>(Comparator.comparingLong(a -> a[0])) instanceof PriorityQueue<long[]> pq
            && pq.add(new long[]{0L, 0L, 0L})
            && (Long) IntStream.range(0, t).mapToLong(i -> pq.poll() instanceof long[] c
                && (IntStream.rangeClosed((int) c[2] + 1, k).filter(j -> (c[1] & add[j]) == 0).anyMatch(j -> pq.add(new long[]{c[0] + w[j], c[1] | add[j], j})) || true)
                && (c[2] <= 0 || IntStream.rangeClosed((int) c[2] + 1, k).filter(j -> ((c[1] ^ add[(int) c[2]]) & add[j]) == 0).anyMatch(j -> pq.add(new long[]{c[0] - w[(int) c[2]] + w[j], (c[1] ^ add[(int) c[2]]) | add[j], j})) || true)
                ? c[0] : 0L).max().getAsLong() instanceof Long r
            ? r : "");
    }
}
