import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] p && IntStream.range(0, n).allMatch(i -> (p[i + 1] = (p[i] + a[i]) % k) >= 0)
            && new int[k + 2] instanceof int[] start && IntStream.rangeClosed(0, n).allMatch(i -> ++start[p[i] + 1] > 0) && IntStream.range(0, k + 1).allMatch(r -> (start[r + 1] += start[r]) >= 0)
            && start.clone() instanceof int[] fill && new int[n + 1] instanceof int[] arr && IntStream.rangeClosed(0, n).allMatch(i -> (arr[fill[p[i]]++] = i) >= 0)
            && ((IntBinaryOperator) (r, x) -> IntStream.iterate(1 << 19, s -> s > 0, s -> s >> 1).reduce(0, (pos, s) -> start[r] + pos + s <= start[r + 1] && arr[start[r] + pos + s - 1] < x ? pos + s : pos)) instanceof IntBinaryOperator lb
            && ((IntBinaryOperator) (r, pk) -> lb.applyAsInt(r, (pk & 1048575) + 1) - lb.applyAsInt(r, pk >> 20)) instanceof IntBinaryOperator cnt
            && new int[n] instanceof int[] ls && new int[n] instanceof int[] rs && new int[n] instanceof int[] st && new int[]{0} instanceof int[] sp
            && IntStream.range(0, n).allMatch(i -> Stream.generate(() -> 0).takeWhile(z -> sp[0] > 0 && a[st[sp[0] - 1]] < a[i]).allMatch(z -> --sp[0] >= 0) && (ls[i] = sp[0] == 0 ? -1 : st[sp[0] - 1]) > -2 && (st[sp[0]++] = i) >= 0)
            && (sp[0] = 0) == 0
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Stream.generate(() -> 0).takeWhile(z -> sp[0] > 0 && a[st[sp[0] - 1]] <= a[i]).allMatch(z -> --sp[0] >= 0) && (rs[i] = sp[0] == 0 ? n : st[sp[0] - 1]) >= 0 && (st[sp[0]++] = i) >= 0)
            ? IntStream.range(0, n).mapToLong(m -> m - ls[m] <= rs[m] - m
                ? IntStream.rangeClosed(ls[m] + 1, m).mapToLong(l -> cnt.applyAsInt((p[l] + a[m]) % k, (m + 1) << 20 | rs[m])).sum()
                : IntStream.rangeClosed(m + 1, rs[m]).mapToLong(r -> cnt.applyAsInt(((p[r] - a[m]) % k + k) % k, (ls[m] + 1) << 20 | m)).sum()).sum() - n : 0);
    }
}
