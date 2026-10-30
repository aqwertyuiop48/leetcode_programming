import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t && (Integer) t[0] instanceof Integer n && (Integer) (int) Math.min(t[1], n) instanceof Integer m && new int[n * m] instanceof int[] tails && new int[1] instanceof int[] sz && IntStream.range(0, n * m).map(i -> t[2 + i % n]).map(x -> (Integer) IntStream.range(0, sz[0]).filter(j -> tails[j] > x).findFirst().orElse(sz[0]) instanceof Integer p && (tails[p] = x) >= 0 && (sz[0] = Math.max(sz[0], p + 1)) > 0 ? 1 : 0).sum() >= 0 ? sz[0] + (long) (t[1] - m) * IntStream.rangeClosed(1, 300).map(v -> (int) IntStream.range(0, n).filter(i -> t[2 + i] == v).count()).max().getAsInt() : 0L);
    }
}
