import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m
            && Integer.valueOf(n * m) instanceof Integer total
            && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, k).map(i -> Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] left
            && Integer.valueOf(tk.nextToken()) instanceof Integer l
            && IntStream.range(0, l).map(i -> Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] right
            && new boolean[total] instanceof boolean[] used
            && IntStream.range(0, k).allMatch(a -> IntStream.range(0, total).filter(i -> !used[i] && i / m + 1 + i % m + 1 <= left[a])
                .map(i -> (i / m + 1 + m + 1 - (i % m + 1)) * 16384 + i).max() instanceof OptionalInt best
                && best.isPresent() && (used[best.getAsInt() % 16384] = true))
            && k + l == total && IntStream.range(0, total).filter(i -> !used[i]).map(i -> i / m + 1 + m + 1 - (i % m + 1)).sorted().toArray() instanceof int[] need
            && IntStream.range(0, l).allMatch(i -> need[i] <= right[i]) ? "YES" : "NO");
    }
}
