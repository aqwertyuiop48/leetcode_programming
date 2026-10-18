import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> in
            && Arrays.stream(in.next().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] hd
            && Stream.generate(in::next).limit(hd[1]).map(String::trim).toList() instanceof List<String> kw
            && new int[(kw.stream().mapToInt(String::length).sum() + 1) * 26] instanceof int[] go
            && new int[]{0} instanceof int[] cnt
            && kw.stream().mapToInt(w -> w.chars().reduce(0, (cur, ch) -> go[cur * 26 + ch - 'a'] != 0 ? go[cur * 26 + ch - 'a'] : (go[cur * 26 + ch - 'a'] = ++cnt[0]))).toArray() instanceof int[] endNode
            && Integer.valueOf(cnt[0] + 1) instanceof Integer n
            && new int[n] instanceof int[] fail
            && new ArrayList<Integer>(n) instanceof ArrayList<Integer> order
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> dq
            && IntStream.range(0, 26).filter(c -> go[c] != 0).allMatch(c -> dq.add(go[c]))
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(u -> order.add(u)
                && IntStream.range(0, 26).allMatch(c -> go[u * 26 + c] != 0
                    ? (fail[go[u * 26 + c]] = go[fail[u] * 26 + c]) >= 0 && dq.add(go[u * 26 + c])
                    : (go[u * 26 + c] = go[fail[u] * 26 + c]) >= 0))
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.iterate(order.size() - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (sz[fail[order.get(i)]] += sz[order.get(i)]) > 0)
            && new int[n] instanceof int[] tin
            && new int[n] instanceof int[] nxt
            && (nxt[0] = 1) == 1
            && order.stream().allMatch(v -> (tin[v] = nxt[fail[v]]) >= 0 && (nxt[fail[v]] += sz[v]) > 0 && (nxt[v] = tin[v] + 1) > 0)
            && new long[n + 2] instanceof long[] bit
            && ((BiPredicate<Integer, Long>) (pos, val) -> IntStream.iterate(pos + 1, i -> i <= n + 1, i -> i + (i & -i)).allMatch(i -> (bit[i] += val) != Long.MIN_VALUE)) instanceof BiPredicate<Integer, Long> add
            && ((BiPredicate<Integer, Long>) (node, val) -> add.test(tin[node], val) && add.test(tin[node] + sz[node], -val)) instanceof BiPredicate<Integer, Long> upd
            && ((IntToLongFunction) pos -> IntStream.iterate(pos + 1, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> bit[i]).sum()) instanceof IntToLongFunction qry
            && new boolean[hd[1]] instanceof boolean[] on
            && IntStream.range(0, hd[1]).allMatch(i -> (on[i] = true) && upd.test(endNode[i], 1L))
            ? Stream.generate(in::next).limit(hd[0]).map(line -> line.charAt(0) == '?'
                    ? new int[]{0} instanceof int[] st ? String.valueOf(line.substring(1).trim().chars().mapToLong(ch -> qry.applyAsLong(tin[st[0] = go[st[0] * 26 + ch - 'a']])).sum()) : null
                    : Integer.valueOf(Integer.parseInt(line.substring(1).trim()) - 1) instanceof Integer idx && (line.charAt(0) == '+') != on[idx]
                        && (on[idx] = !on[idx]) == on[idx] && upd.test(endNode[idx], line.charAt(0) == '+' ? 1L : -1L) ? null : null)
                .filter(Objects::nonNull).collect(Collectors.joining("\n"))
            : "");
    }
}
