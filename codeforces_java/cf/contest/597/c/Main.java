import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) (Integer.parseInt(tk.nextToken()) + 1) instanceof Integer K1
            && new long[(n + 1) * K1] instanceof long[] T && new long[3] instanceof long[] st
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken()) - 1).toArray() instanceof int[] a
            && new IntToLongFunction[1] instanceof IntToLongFunction[] qf && new IntUnaryOperator[1] instanceof IntUnaryOperator[] uf
            && (qf[0] = j -> j > 0 ? T[j * K1 + (int) st[0] - 1] + ((Integer) (j & (j - 1)) instanceof Integer j1 && j1 > 0 ? T[j1 * K1 + (int) st[0] - 1] + ((Integer) (j1 & (j1 - 1)) instanceof Integer j2 && j2 > 0 ? T[j2 * K1 + (int) st[0] - 1] + ((Integer) (j2 & (j2 - 1)) instanceof Integer j3 && j3 > 0 ? T[j3 * K1 + (int) st[0] - 1] + ((Integer) (j3 & (j3 - 1)) instanceof Integer j4 && j4 > 0 ? qf[0].applyAsLong(j4) : 0L) : 0L) : 0L) : 0L) : 0L) != null
            && (uf[0] = j -> j > n ? 0 : (int) ((T[j * K1 + (int) st[0]] += st[1]) * 0) + ((Integer) (j + (j & -j)) instanceof Integer j1 && j1 <= n ? (int) ((T[j1 * K1 + (int) st[0]] += st[1]) * 0) + ((Integer) (j1 + (j1 & -j1)) instanceof Integer j2 && j2 <= n ? (int) ((T[j2 * K1 + (int) st[0]] += st[1]) * 0) + ((Integer) (j2 + (j2 & -j2)) instanceof Integer j3 && j3 <= n ? (int) ((T[j3 * K1 + (int) st[0]] += st[1]) * 0) + ((Integer) (j3 + (j3 & -j3)) instanceof Integer j4 && j4 <= n ? uf[0].applyAsInt(j4) : 0) : 0) : 0) : 0)) != null
            && IntStream.range(0, n * K1).allMatch(idx -> (st[0] = idx % K1) >= 0
                && ((st[1] = st[0] == 0 ? 1L : qf[0].applyAsLong(a[idx / K1])) != 1 || true)
                && (uf[0].applyAsInt(a[idx / K1] + 1) >= 0 || true)
                && ((st[0] == K1 - 1 ? (st[2] += st[1]) : 0) != 1 || true))
            ? st[2] : 0);
    }
}
