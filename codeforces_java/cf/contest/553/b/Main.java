import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Long) s.nextLong() instanceof Long k
            && new long[52] instanceof long[] w && Stream.of(0).peek(z -> Arrays.setAll(w, i -> i < 2 ? 1 : w[i - 1] + w[i - 2])).findFirst().isPresent()
            ? Stream.iterate(new long[]{0, k}, st -> st[0] < n, st -> st[1] <= w[n - (int) st[0] - 1] ? new long[]{st[0] + 1, st[1]} : new long[]{st[0] + 2, st[1] - w[n - (int) st[0] - 1]})
                .map(st -> st[1] <= w[n - (int) st[0] - 1] ? String.valueOf(st[0] + 1) : (st[0] + 2) + " " + (st[0] + 1)).collect(Collectors.joining(" ")) : "");
    }
}
