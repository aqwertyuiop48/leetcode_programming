import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Long) s.nextLong() instanceof Long x
            && new long[101] instanceof long[] cnt && IntStream.range(0, n).allMatch(i -> ++cnt[s.nextInt()] > 0)
            && IntStream.range(0, 101).mapToObj(i -> IntStream.range(0, 101).mapToLong(j -> i == 0 ? (j < 100 ? cnt[j + 1] : 0) : i < 100 ? (j == i - 1 ? 1 : 0)
                : j == 100 ? 1 + 0 : cnt[j + 1]).toArray()).toArray(long[][]::new) instanceof long[][] m0
            && new long[101] instanceof long[] v && (v[0] = 1) > 0 && (v[100] = 1) > 0
            && new long[][][]{m0} instanceof long[][][] cur
            && LongStream.range(0, 31).allMatch(b -> ((x >> b & 1) == 0 || (v.length > 0 && IntStream.range(0, 101).mapToLong(i -> IntStream.range(0, 101).mapToLong(k -> cur[0][i][k] * v[k] % 1000000007L).sum() % 1000000007L).toArray() instanceof long[] nv
                    && IntStream.range(0, 101).allMatch(i -> (v[i] = nv[i]) >= 0)))
                && (cur[0] = IntStream.range(0, 101).mapToObj(i -> IntStream.range(0, 101).mapToLong(j -> IntStream.range(0, 101).mapToLong(k -> cur[0][i][k] * cur[0][k][j] % 1000000007L).sum() % 1000000007L).toArray()).toArray(long[][]::new)) != null)
            ? v[100] : 0);
    }
}
