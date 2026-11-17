
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && ((IntSupplier) () -> Integer.parseInt(tk.nextToken())) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer m
            && new int[n + 1][] instanceof int[][] ch && (ch[0] = IntStream.generate(() -> -1).limit(n + 1).toArray()) != null && (ch[1] = IntStream.generate(() -> -1).limit(n + 1).toArray()) != null
            && new int[n + 1] instanceof int[] fa && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] v && (fa[0] = -1) < 0
            && IntStream.rangeClosed(1, n).allMatch(i -> Integer.valueOf(nx.getAsInt()) instanceof Integer p && (dep[i] = dep[p] + 1) > 0 && (v[i] = -1000000000) < 0 && (fa[i] = p) >= 0)
            && ((IntPredicate) x -> fa[x] < 0 || (ch[0][fa[x]] != x && ch[1][fa[x]] != x)) instanceof IntPredicate rt
            && ((IntUnaryOperator) x -> ch[1][fa[x]] == x ? 1 : 0) instanceof IntUnaryOperator tp
            && ((IntUnaryOperator) x -> Integer.valueOf(fa[x]) instanceof Integer p && Integer.valueOf(tp.applyAsInt(x)) instanceof Integer k
                && (v[x] = v[p]) > Integer.MIN_VALUE && (fa[x] = fa[p]) > -5 && (rt.test(p) || (ch[tp.applyAsInt(p)][fa[p]] = x) >= 0)
                && (ch[k][p] = ch[1 - k][x]) > -5 && (ch[k][p] < 0 || (fa[ch[k][p]] = p) >= 0) && (ch[1 - k][x] = p) >= 0 && (fa[p] = x) >= 0 ? 0 : 1) instanceof IntUnaryOperator rot
            && ((IntUnaryOperator) x -> IntStream.iterate(0, z -> !rt.test(x), z -> z + 1).allMatch(z -> (rt.test(fa[x]) || (tp.applyAsInt(fa[x]) == tp.applyAsInt(x) ? rot.applyAsInt(fa[x]) : rot.applyAsInt(x)) == 0) && rot.applyAsInt(x) == 0) ? 0 : 1) instanceof IntUnaryOperator splay
            && new int[2] instanceof int[] cur
            && ((IntBinaryOperator) (a, t) -> (cur[0] = a) * 0 + (cur[1] = -1) * 0 == 0
                && IntStream.iterate(0, z -> cur[0] != 0, z -> z + 1).allMatch(z -> splay.applyAsInt(cur[0]) == 0 && v[cur[0]] + 2 * dep[cur[0]] <= t
                    && (ch[1][cur[0]] < 0 || (v[ch[1][cur[0]]] = v[cur[0]]) > Integer.MIN_VALUE) && (ch[1][cur[0]] = cur[1]) > -5 && (cur[1] = cur[0]) >= 0 && (cur[0] = fa[cur[0]]) > -5) | true
                && (cur[1] < 0 || (v[cur[1]] = t - dep[cur[0]] * 2) > Integer.MIN_VALUE) ? t - dep[cur[0]] * 2 + dep[a] : -1) instanceof IntBinaryOperator access
            && IntStream.range(0, m).mapToObj(i -> new int[]{nx.getAsInt(), nx.getAsInt()}).toArray(int[][]::new) instanceof int[][] msg
            && IntStream.range(0, m).mapToLong(j -> ((long) msg[j][0] << 22) | j).sorted().toArray() instanceof long[] s1 && new int[m] instanceof int[] rk
            && IntStream.range(0, m).filter(r1 -> (rk[(int) (s1[r1] & 4194303)] = r1) < 0).count() == 0
            && IntStream.range(0, m).mapToLong(j -> (((long) msg[j][1] + dep[msg[j][0]] + (1L << 30)) << 23) | rk[j]).sorted().mapToInt(kk -> (int) (s1[(int) (kk & 8388607)] & 4194303)).toArray() instanceof int[] srt
            && new int[m] instanceof int[] res
            && Arrays.stream(srt).allMatch(j -> (res[j] = access.applyAsInt(msg[j][0], msg[j][1] + dep[msg[j][0]])) > Integer.MIN_VALUE)
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
