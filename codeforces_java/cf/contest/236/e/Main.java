import java.nio.IntBuffer;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            ? CompletableFuture.supplyAsync(() -> new String(raw).split("\\s+") instanceof String[] tk
            && tk[0] instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && new int[(2 * n + 2) * 26] instanceof int[] nx && new int[2 * n + 2] instanceof int[] link && new int[2 * n + 2] instanceof int[] len && new int[2 * n + 2] instanceof int[] cnt
            && new int[8] instanceof int[] st && IntBuffer.wrap(nx) instanceof IntBuffer ib
            && (link[0] = -1) == -1
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> l1
            && l1.compareAndSet(null, p -> p == -1 || nx[p * 26 + st[6]] != 0 ? p : (nx[p * 26 + st[6]] = st[2]) > 0 ? l1.get().applyAsInt(link[p]) : 0)
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> l2
            && l2.compareAndSet(null, p -> p == -1 || nx[p * 26 + st[6]] != st[5] ? p : (nx[p * 26 + st[6]] = st[4]) > 0 ? l2.get().applyAsInt(link[p]) : 0)
            && s.chars().allMatch(ch -> (st[6] = ch - 'a') >= 0
                && (st[2] = ++st[0]) > 0 && (len[st[2]] = len[st[1]] + 1) > 0 && (cnt[st[2]] = 1) > 0
                && (st[3] = nx[st[1] * 26 + st[6]] != 0 ? st[1] : l1.get().applyAsInt(st[1])) >= -1
                && (st[3] == -1 ? (link[st[2]] = 0) >= 0
                    : (st[5] = nx[st[3] * 26 + st[6]]) > 0 && (len[st[3]] + 1 == len[st[5]] ? (link[st[2]] = st[5]) > 0
                        : (st[4] = ++st[0]) > 0 && (len[st[4]] = len[st[3]] + 1) > 0 && ib.put(st[4] * 26, nx, st[5] * 26, 26) != null && (link[st[4]] = link[st[5]]) >= 0
                            && l2.get().applyAsInt(st[3]) >= -1
                            && (link[st[5]] = st[4]) > 0 && (link[st[2]] = st[4]) > 0))
                && (st[1] = st[2]) > 0)
            && new int[n + 2] instanceof int[] bc && new int[st[0] + 1] instanceof int[] ord
            && IntStream.rangeClosed(1, st[0]).allMatch(v -> ++bc[len[v]] > 0)
            && IntStream.rangeClosed(1, n).allMatch(l -> (bc[l] += bc[l - 1]) >= 0)
            && IntStream.rangeClosed(1, st[0]).allMatch(v -> (ord[--bc[len[v]]] = v) > 0)
            && IntStream.iterate(st[0] - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (cnt[link[ord[i]]] += cnt[ord[i]]) >= 0)
            && Integer.valueOf(Integer.parseInt(tk[1])) instanceof Integer q
            && new int[st[0] + 1] instanceof int[] mark
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> h1
            && h1.compareAndSet(null, w -> w == 0 || nx[w * 26 + st[6]] != 0 ? w : h1.get().applyAsInt(link[w]))
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> h2
            && h2.compareAndSet(null, w -> w == 0 || len[link[w]] < st[7] ? w : h2.get().applyAsInt(link[w]))
            ? IntStream.range(0, q).mapToObj(qi -> tk[2 + qi] instanceof String x && Integer.valueOf(x.length()) instanceof Integer m && new int[]{0, 0, 0} instanceof int[] ws && new long[1] instanceof long[] tot
                && (st[7] = m) > 0
                && IntStream.range(0, 2 * m - 1).allMatch(i -> (st[6] = x.charAt(i < m ? i : i - m) - 'a') >= 0
                    && (ws[2] = nx[ws[0] * 26 + st[6]] != 0 || ws[0] == 0 ? ws[0] : h1.get().applyAsInt(ws[0])) >= 0
                    && (ws[1] = ws[2] != ws[0] ? len[ws[2]] : ws[1]) >= 0
                    && (nx[ws[2] * 26 + st[6]] != 0 ? (ws[0] = nx[ws[2] * 26 + st[6]]) > 0 && ++ws[1] > 0 : (ws[0] = 0) == 0 && (ws[1] = 0) == 0)
                    && (ws[2] = ws[0] == 0 || len[link[ws[0]]] < m ? ws[0] : h2.get().applyAsInt(ws[0])) >= 0
                    && (ws[2] == ws[0] || (ws[1] = len[ws[2]]) >= 0 && (ws[0] = ws[2]) > 0)
                    && (ws[1] < m || mark[ws[0]] == qi + 1 || (mark[ws[0]] = qi + 1) > 0 && (tot[0] += cnt[ws[0]]) >= 0))
                ? String.valueOf(tot[0]) : "").collect(Collectors.joining("\n")) : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
