import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sk && (Integer) Integer.parseInt(sk.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(sk.nextToken()) instanceof Integer m && (Long) Long.parseLong(sk.nextToken()) instanceof Long mod
            && IntStream.range(0, n).mapToObj(i -> sk.nextToken()).toArray(String[]::new) instanceof String[] g
            && (Integer) (m + 1) instanceof Integer w && (Integer) ((n + 1) * (m + 1)) instanceof Integer P
            && new int[P] instanceof int[] par && new int[P] instanceof int[] sz && new int[P] instanceof int[] id && new int[2] instanceof int[] cnt && new boolean[2] instanceof boolean[] cyc
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] F
            && IntStream.range(0, P).filter(x -> (par[x] = x) >= 0 && (sz[x] = 1) > 0).count() >= 0
            && (F[0] = x -> par[x] == x ? x : (par[x] = F[0].applyAsInt(par[x]))) != null
            && ((IntBinaryOperator) (u, v) -> (F[0].applyAsInt(u) == F[0].applyAsInt(v))
                ? ((cyc[((u / w) + (u % w)) & 1] = true) ? 0 : 0)
                : (sz[F[0].applyAsInt(u)] >= sz[F[0].applyAsInt(v)]
                    ? ((sz[F[0].applyAsInt(u)] += sz[F[0].applyAsInt(v)]) > 0 && (par[F[0].applyAsInt(v)] = F[0].applyAsInt(u)) >= 0 ? 0 : 0)
                    : ((sz[F[0].applyAsInt(v)] += sz[F[0].applyAsInt(u)]) > 0 && (par[F[0].applyAsInt(u)] = F[0].applyAsInt(v)) >= 0 ? 0 : 0))) instanceof IntBinaryOperator uni
            && IntStream.range(0, n * m).filter(c -> g[c / m].charAt(c % m) != '*' && uni.applyAsInt(g[c / m].charAt(c % m) == '\\' ? (c / m) * w + c % m : (c / m) * w + c % m + 1,
                g[c / m].charAt(c % m) == '\\' ? (c / m + 1) * w + c % m + 1 : (c / m + 1) * w + c % m) >= 0).count() >= 0
            && IntStream.range(0, P).filter(x -> F[0].applyAsInt(x) == x && (id[x] = cnt[((x / w) + (x % w)) & 1]++) >= 0).count() >= 0
            && (Integer) (int) IntStream.range(0, n * m).filter(c -> g[c / m].charAt(c % m) == '*').count() instanceof Integer stars
            && ((LongUnaryOperator) colL -> ((Integer) (int) colL instanceof Integer col) ? ((cyc[col] || cnt[col] - 1 > stars) ? 0L
                : ((Integer) (cnt[col] - 1) instanceof Integer sc && new long[sc][sc] instanceof long[][] M && Arrays.asList(M) instanceof List<long[]> R && new long[] {1} instanceof long[] dt
                    && IntStream.range(0, n * m).filter(c -> g[c / m].charAt(c % m) == '*').filter(c -> ((Integer) F[0].applyAsInt(((c / m + c % m) & 1) == col ? (c / m) * w + c % m : (c / m) * w + c % m + 1) instanceof Integer ra
                        && (Integer) F[0].applyAsInt(((c / m + c % m) & 1) == col ? (c / m + 1) * w + c % m + 1 : (c / m + 1) * w + c % m) instanceof Integer rb
                        && id[ra] != id[rb] && (id[ra] >= sc || (M[id[ra]][id[ra]]++) >= 0) && (id[rb] >= sc || (M[id[rb]][id[rb]]++) >= 0)
                        && (id[ra] >= sc || id[rb] >= sc || ((M[id[ra]][id[rb]]--) <= 0 && (M[id[rb]][id[ra]]--) <= 0)))).count() >= 0
                    && IntStream.range(0, sc * sc).filter(x -> (M[x / sc][x % sc] = ((M[x / sc][x % sc] % mod) + mod) % mod) >= 0).count() >= 0
                    && IntStream.range(0, sc).filter(c -> (Integer) IntStream.range(c, sc).filter(x -> M[x][c] != 0).findFirst().orElse(-1) instanceof Integer pr
                        && (pr < 0 ? (dt[0] = 0) == 0
                            : ((pr == c || (R.set(c, R.set(pr, R.get(c))) != null && (dt[0] = (mod - dt[0]) % mod) >= 0)) && (dt[0] = dt[0] * M[c][c] % mod) >= 0
                                && (Long) BigInteger.valueOf(M[c][c]).modInverse(BigInteger.valueOf(mod)).longValue() instanceof Long inv
                                && IntStream.range(c + 1, sc).filter(x -> (Long) (M[x][c] * inv % mod) instanceof Long f
                                    && IntStream.range(c, sc).filter(j -> (M[x][j] = ((M[x][j] - f * M[c][j]) % mod + mod) % mod) >= 0).count() >= 0).count() >= 0))).count() >= 0)
                    ? dt[0] : 0L) : 0L) instanceof LongUnaryOperator cntC
            ? String.valueOf((cntC.applyAsLong(0) + cntC.applyAsLong(1)) % mod) : "");
    }
}
