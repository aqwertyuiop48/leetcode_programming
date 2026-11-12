
import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new long[n + 1] instanceof long[] pre && IntStream.rangeClosed(1, n).allMatch(i -> (pre[i] = (pre[i - 1] + Long.parseLong(tk.nextToken())) % 1000000009L) >= 0)
            && new long[]{(1 + 383008016L) * 500000005L % 1000000009L, (1000000009L + 1 - 383008016L) * 500000005L % 1000000009L} instanceof long[] bs
            && (Long) BigInteger.valueOf(383008016L).modInverse(BigInteger.valueOf(1000000009L)).longValue() instanceof Long is5
            && new long[2][n + 2] instanceof long[][] pw && new long[2][n + 2] instanceof long[][] qs && new long[2][n + 2] instanceof long[][] ng && new long[4][n + 2] instanceof long[][] fw
            && IntStream.range(0, 2).allMatch(b -> (Long) BigInteger.valueOf(bs[b]).modInverse(BigInteger.valueOf(1000000009L)).longValue() instanceof Long inv && (pw[b][0] = 1) > 0 && (ng[b][0] = 1) > 0
                && IntStream.rangeClosed(1, n + 1).allMatch(i -> (pw[b][i] = pw[b][i - 1] * bs[b] % 1000000009L) > 0 && (ng[b][i] = ng[b][i - 1] * inv % 1000000009L) > 0 && (qs[b][i] = (qs[b][i - 1] + pw[b][i]) % 1000000009L) >= 0))
            && ((Predicate<long[]>) q -> IntStream.range(0, 19).filter(b -> (((int) q[0] - 1) >> b & 1) == 0).map(b -> (((int) q[0] - 1) | ((1 << b) - 1)) + 1).filter(k -> k <= n
                && ((fw[0][k] = (fw[0][k] + q[1]) % 1000000009L) < 0 | (fw[1][k] = (fw[1][k] + q[2]) % 1000000009L) < 0 | (fw[2][k] = (fw[2][k] + q[3]) % 1000000009L) < 0 | (fw[3][k] = (fw[3][k] + q[4]) % 1000000009L) < 0)).count() >= 0) instanceof Predicate<long[]> upd
            && ((IntToLongFunction) x -> (pre[x] + IntStream.range(0, 19).filter(b -> (x >> b & 1) == 1).mapToLong(b -> ((qs[0][x] * fw[0][x & (-1 << b)] - fw[1][x & (-1 << b)] + qs[1][x] * fw[2][x & (-1 << b)] - fw[3][x & (-1 << b)]) % 1000000009L + 1000000009L) % 1000000009L).sum()) % 1000000009L) instanceof IntToLongFunction pf
            ? IntStream.range(0, m).mapToObj(i -> Integer.parseInt(tk.nextToken()) == 1
                ? (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer r
                    && (Long) (ng[0][l - 1] * is5 % 1000000009L) instanceof Long cq && (Long) ((1000000009L - ng[1][l - 1] * is5 % 1000000009L) % 1000000009L) instanceof Long cr
                    && upd.test(new long[]{l, cq, cq * qs[0][l - 1] % 1000000009L, cr, cr * qs[1][l - 1] % 1000000009L})
                    && upd.test(new long[]{r + 1, (1000000009L - cq) % 1000000009L, (1000000009L - cq) % 1000000009L * qs[0][r] % 1000000009L, (1000000009L - cr) % 1000000009L, (1000000009L - cr) % 1000000009L * qs[1][r] % 1000000009L}) ? "" : ""
                : (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer r
                    ? String.valueOf((pf.applyAsLong(r) - pf.applyAsLong(l - 1) + 1000000009L) % 1000000009L) : "").filter(x -> !x.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}



