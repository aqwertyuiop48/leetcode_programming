import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[100001] instanceof int[] cnt && new int[100001] instanceof int[] sum && new int[2] instanceof int[] st
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).allMatch(a -> (st[0] = 0) == 0 && (st[1] = 0) == 0
                && IntStream.iterate(a, y -> y > 0, y -> y / 2).filter(y -> (Integer) st[0]++ instanceof Integer k && (Boolean) (k == 0 || st[1] == 1) instanceof Boolean up
                    && IntStream.range(0, up ? 17 : 1).takeWhile(j -> (y << j) <= 100000).filter(j -> ++cnt[y << j] > 0 && (sum[y << j] += k + j) >= 0).count() >= 0 && (st[1] = y & 1) >= 0).count() >= 0)
            ? IntStream.rangeClosed(1, 100000).filter(v -> cnt[v] == n).map(v -> sum[v]).min().getAsInt() : "");
    }
}
