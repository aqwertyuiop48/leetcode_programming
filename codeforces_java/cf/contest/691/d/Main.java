import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw
            && new int[b0.length / 2 + 2] instanceof int[] nums && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (st[3] = raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) * 0 : st[1] == 1 ? (nums[st[2]++] = st[0]) * 0 + (st[0] = 0) * 0 + (st[1] = 0) * 0 : 0) > 5).count() >= 0
            && new int[] {0} instanceof int[] ps && ((IntSupplier) () -> nums[ps[0]++]) instanceof IntSupplier ni
            && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par
            && new int[n + 1] instanceof int[] posOf
            && IntStream.rangeClosed(1, n).filter(i -> (posOf[ni.getAsInt()] = i) < 0).count() >= 0
            && ((IntUnaryOperator) y -> par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[y]]]]]]]]]]]]]]]]]]]]]) instanceof IntUnaryOperator find && new int[n + 1] instanceof int[] sz && IntStream.rangeClosed(1, n).filter(i -> (sz[i] = 1) < 0).count() >= 0 && new int[4] instanceof int[] t
            && IntStream.range(0, m).filter(e -> (t[0] = find.applyAsInt(ni.getAsInt())) != (t[1] = find.applyAsInt(ni.getAsInt())) && (t[2] = sz[t[0]] < sz[t[1]] ? t[0] : t[1]) >= 0 && (t[3] = t[0] + t[1] - t[2]) >= 0 && (par[t[2]] = t[3]) > 0 && (sz[t[3]] += sz[t[2]]) > 0).count() >= 0
            && new int[n + 1] instanceof int[] rt && new int[n + 1] instanceof int[] first && new int[n + 1] instanceof int[] nx
            && IntStream.rangeClosed(1, n).filter(k -> Integer.valueOf(n + 1 - k) instanceof Integer i && (rt[i] = find.applyAsInt(i)) > 0 && (nx[i] = first[rt[i]]) >= 0 && (first[rt[i]] = i) < 0).count() >= 0
            && new int[n + 1] instanceof int[] res
            && IntStream.rangeClosed(1, n).filter(k -> Integer.valueOf(n + 1 - k) instanceof Integer v && Integer.valueOf(first[rt[posOf[v]]]) instanceof Integer i && (res[i] = v) > 0 && (first[rt[posOf[v]]] = nx[i]) < 0).count() >= 0
            ? IntStream.rangeClosed(1, n).collect(StringBuilder::new, (sb, i) -> sb.append(res[i]).append(' '), StringBuilder::append).toString().trim() : "");
    }
}
