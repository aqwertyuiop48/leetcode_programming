import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && tk.nextToken() instanceof String s && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}).toList() instanceof List<int[]> mu
            && new int[k + 3] instanceof int[] nxt && new int[k + 3] instanceof int[] prv && new int[k + 3] instanceof int[] from && new boolean[k + 3] instanceof boolean[] alive
            && IntStream.rangeClosed(0, k + 1).allMatch(i -> (nxt[i] = Math.min(i + 1, k + 1)) > 0 && (prv[i] = Math.max(i - 1, 0)) >= 0 && (alive[i] = i >= 1 && i <= k) || true)
            && (Integer) ((k - 1) / 1024 + 1) instanceof Integer nb && new int[nb + 1] instanceof int[] bc
            && IntStream.rangeClosed(1, k).allMatch(i -> ++bc[(i - 1) / 1024] > 0)
            && ((IntUnaryOperator) rank -> new int[]{0, rank} instanceof int[] st
                && Stream.generate(() -> 0).takeWhile(z -> st[1] > bc[st[0]]).allMatch(z -> (st[1] -= bc[st[0]]) >= 0 && ++st[0] > 0)
                && (Integer) (st[0] * 1024 + 1) instanceof Integer p0 && new int[]{p0, st[1]} instanceof int[] sc
                && Stream.generate(() -> 0).takeWhile(z -> !(alive[sc[0]] && sc[1] == 1)).allMatch(z -> (alive[sc[0]] ? --sc[1] >= 0 : true) && ++sc[0] > 0) ? sc[0] : -1) instanceof IntUnaryOperator kth
            && new int[]{k} instanceof int[] cur
            && IntStream.iterate(m - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (Integer) mu.get(i)[0] instanceof Integer l && (Integer) mu.get(i)[1] instanceof Integer r
                && (Integer) Math.min(r - l + 1, cur[0] - r) instanceof Integer cnt
                && (cnt <= 0 || (Integer) kth.applyAsInt(l) instanceof Integer e1 && (Integer) ((r - l + 1) / 2) instanceof Integer half && (Integer) Math.min(cnt, half) instanceof Integer ev
                    && new int[cnt] instanceof int[] src && new int[]{nxt[e1]} instanceof int[] pw
                    && IntStream.range(0, ev).allMatch(j -> (src[j] = pw[0]) > 0 && (pw[0] = nxt[nxt[pw[0]]]) > 0)
                    && (pw[0] = e1) > 0 && IntStream.range(ev, cnt).allMatch(j -> (src[j] = pw[0]) > 0 && (pw[0] = nxt[nxt[pw[0]]]) > 0)
                    && (Integer) kth.applyAsInt(r + 1) instanceof Integer t0 && (pw[0] = t0) > 0
                    && IntStream.range(0, cnt).allMatch(j -> (Integer) pw[0] instanceof Integer t && (from[t] = src[j]) > 0 && (pw[0] = nxt[t]) > 0
                        && !(alive[t] = false) && --bc[(t - 1) / 1024] >= 0 && (nxt[prv[t]] = nxt[t]) >= 0 && (prv[nxt[t]] = prv[t]) >= 0)
                    && (cur[0] -= cnt) > 0 || true))
            && new char[k + 1] instanceof char[] res && new int[]{0} instanceof int[] nx
            && IntStream.rangeClosed(1, k).allMatch(p -> (res[p] = from[p] == 0 ? s.charAt(nx[0]++) : res[from[p]]) > 0)
            ? new String(res, 1, k) : "");
    }
}

