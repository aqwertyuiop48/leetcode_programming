import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(sc -> IntStream.range(0, 6).map(i0 -> sc.nextInt()).toArray() instanceof int[] in ? Stream.<IntUnaryOperator>of(v -> v <= 2 ? v : 2 - v % 2, v -> v <= 3 ? v : 2 + v % 2).map(red ->
            (Integer) in[0] instanceof Integer n
            && (Integer) in[1] instanceof Integer m
            && (Integer) in[2] instanceof Integer x1
            && (Integer) in[3] instanceof Integer y1
            && (Integer) in[4] instanceof Integer x2
            && (Integer) in[5] instanceof Integer y2
            && new int[]{Math.min(x1, x2) - 1, Math.abs(x1 - x2) - 1, n - Math.max(x1, x2)} instanceof int[] ar
            && Arrays.stream(ar).map(red).toArray() instanceof int[] apr
            && new int[]{Math.min(y1, y2) - 1, Math.abs(y1 - y2) - 1, m - Math.max(y1, y2)} instanceof int[] ac
            && Arrays.stream(ac).map(red).toArray() instanceof int[] apc
            && new int[][]{ar, ac} instanceof int[][] a
            && new int[][]{apr, apc} instanceof int[][] ap
            && (Integer) (IntStream.of(apr).sum() + 2) instanceof Integer n0
            && (Integer) (IntStream.of(apc).sum() + 2) instanceof Integer m0
            && (Integer) ((x1 < x2 ? apr[0] + 1 : apr[0] + apr[1] + 2) * 1024 + (y1 < y2 ? apc[0] + 1 : apc[0] + apc[1] + 2)) instanceof Integer s0
            && (Integer) ((x2 < x1 ? apr[0] + 1 : apr[0] + apr[1] + 2) * 1024 + (y2 < y1 ? apc[0] + 1 : apc[0] + apc[1] + 2)) instanceof Integer t0
            && ((BiFunction<int[], int[], int[]>) (pa, path) ->
                IntStream.range(0, path.length - 1).filter(i -> path[i] % 1024 == path[i + 1] % 1024 && Math.abs(path[i] / 1024 - path[i + 1] / 1024) == 1 && Math.min(path[i] / 1024, path[i + 1] / 1024) == pa[1]).toArray() instanceof int[] cross
                && IntStream.of(cross).map(i -> path[i] % 1024).sorted().toArray() instanceof int[] cols
                && IntStream.concat(IntStream.of(0), IntStream.concat(IntStream.of(cols), IntStream.of(pa[0] + 1))).toArray() instanceof int[] ex
                && IntStream.range(0, ex.length - 1).filter(jj -> ex[jj + 1] == ex[jj] + 1).findFirst() instanceof OptionalInt jo
                && jo.isPresent()
                ? IntStream.range(0, path.length).flatMap(i -> IntStream.concat(
                    IntStream.of(path[i] / 1024 > pa[1] ? path[i] + 2 * pa[2] * 1024 : path[i]),
                    Arrays.binarySearch(cross, i) < 0 ? IntStream.empty()
                    : (Integer) (Arrays.binarySearch(cols, path[i] % 1024) + 1) instanceof Integer idx
                    && (Integer) (idx <= jo.getAsInt() ? ex[idx - 1] + 1 : ex[idx + 1] - 1) instanceof Integer oth
                    && IntStream.range(0, 2 * pa[2]).flatMap(qq -> IntStream.range(0, Math.abs(oth - path[i] % 1024) + 1).map(x -> (pa[1] + 1 + qq) * 1024 + (qq % 2 == 0 ? path[i] % 1024 + (oth >= path[i] % 1024 ? x : -x) : oth + (path[i] % 1024 >= oth ? x : -x)))).toArray() instanceof int[] sq
                    ? IntStream.range(0, sq.length).map(x -> sq[path[i] / 1024 < path[i + 1] / 1024 ? x : sq.length - 1 - x]) : IntStream.empty())).toArray()
                : null) instanceof BiFunction<int[], int[], int[]> ins
            && ((UnaryOperator<int[]>) arr -> Arrays.stream(arr).map(v -> v % 1024 * 1024 + v / 1024).toArray()) instanceof UnaryOperator<int[]> tp
            && ((BiFunction<int[], Integer, int[]>) (p0, mode) ->
                new int[][]{p0} instanceof int[][] P
                && new int[][]{apr.clone(), apc.clone()} instanceof int[][] cur
                && new int[]{n0, m0} instanceof int[] cnt
                && IntStream.range(0, 6).allMatch(step ->
                    (step != 3 || (P[0] = tp.apply(P[0])) != null)
                    && (Integer) (step / 3) instanceof Integer pp
                    && (Integer) (step % 3) instanceof Integer ii
                    && (Integer) (mode == 0 ? Math.min((a[pp][ii] - ap[pp][ii]) / 2, 1) : (a[pp][ii] - ap[pp][ii]) / 2) instanceof Integer kk
                    && (kk == 0 || ((Integer) (cur[pp][0] * (ii > 0 ? 1 : 0) + cur[pp][1] * (ii > 1 ? 1 : 0) + ii + 1) instanceof Integer lo
                        && IntStream.rangeClosed(lo - 1, lo + cur[pp][ii] - 1).filter(g -> g >= 1 && g <= cnt[pp] - 1).mapToObj(g -> ins.apply(new int[]{cnt[1 - pp], g, kk}, P[0])).filter(Objects::nonNull).findFirst() instanceof Optional<int[]> rr
                        && rr.isPresent() && (P[0] = rr.get()) != null && (cnt[pp] += 2 * kk) > 0 && (cur[pp][ii] += 2 * kk) > 0)))
                && (P[0] = tp.apply(P[0])) != null ? P[0] : null) instanceof BiFunction<int[], Integer, int[]> extend
            && IntStream.rangeClosed(1, n0).flatMap(r0 -> IntStream.rangeClosed(1, m0).map(c0 -> r0 * 1024 + c0)).toArray() instanceof int[] allc
            && Arrays.stream(allc).filter(c0 -> c0 != s0 && c0 != t0).toArray() instanceof int[] cells
            && (Integer) ((s0 / 1024 + s0 % 1024) % 2) instanceof Integer cs
            && (Integer) ((t0 / 1024 + t0 % 1024) % 2) instanceof Integer ct
            && (Integer) (n0 * m0 % 2 == 0 ? (cs + ct == 1 ? 0 : 1) : (cs + ct == 0 ? 0 : cs + ct == 2 ? 2 : 1)) instanceof Integer dd
            && (Integer) (n0 * m0 % 2 == 0 ? 1 - cs : 0) instanceof Integer oc
            && Arrays.stream(cells).filter(c0 -> (c0 / 1024 + c0 % 1024) % 2 == oc).boxed().sorted(Comparator.comparingInt(c0 -> Math.abs(c0 / 1024 - s0 / 1024) + Math.abs(c0 % 1024 - s0 % 1024) + Math.abs(c0 / 1024 - t0 / 1024) + Math.abs(c0 % 1024 - t0 % 1024))).mapToInt(c0 -> c0).toArray() instanceof int[] ec
            && (Integer) ((n0 + 2) * 1024) instanceof Integer sz
            && new boolean[sz] instanceof boolean[] fr
            && new boolean[sz] instanceof boolean[] vis
            && new int[sz] instanceof int[] seen
            && new int[sz] instanceof int[] qu
            && new int[4] instanceof int[] reg
            && new int[n0 * m0 + 1] instanceof int[] stk
            && ((IntUnaryOperator) q0 -> (int) IntStream.of(1, -1, 1024, -1024).filter(d0 -> fr[q0 + d0] && !vis[q0 + d0]).count()) instanceof IntUnaryOperator degf
            && ((IntPredicate) cu -> IntStream.of(allc).allMatch(c0 -> !fr[c0] || vis[c0] || IntStream.of(1, -1, 1024, -1024).filter(d0 -> fr[c0 + d0] && (!vis[c0 + d0] || c0 + d0 == cu)).count() >= (c0 == t0 ? 1 : 2))
                && (seen[cu] = ++reg[0]) > 0 && (qu[0] = cu) > 0 && (reg[1] = 1) > 0
                && IntStream.iterate(0, h0 -> h0 < reg[1], h0 -> h0 + 1).allMatch(h0 -> IntStream.of(1, -1, 1024, -1024).map(d0 -> qu[h0] + d0).filter(x0 -> fr[x0] && !vis[x0] && seen[x0] != reg[0]).allMatch(x0 -> (seen[x0] = reg[0]) > 0 && (qu[reg[1]++] = x0) > 0))
                && reg[1] - 1 == reg[3] - reg[2]) instanceof IntPredicate okf
            && new AtomicReference<BooleanSupplier>() instanceof AtomicReference<BooleanSupplier> rec
            && rec.getAndSet(() -> IntStream.of(stk[reg[2] - 1]).allMatch(cu2 ->
                reg[2] == reg[3]
                ? cu2 == t0 && extend.apply(Arrays.copyOf(stk, reg[2]), 0) != null
                : cu2 != t0 && okf.test(cu2) && IntStream.of(1, -1, 1024, -1024).map(d0 -> cu2 + d0).filter(q0 -> fr[q0] && !vis[q0]).boxed().sorted(Comparator.comparingInt(q0 -> degf.applyAsInt(q0))).anyMatch(q0 -> (vis[q0] = true) && (stk[reg[2]++] = q0) > 0 && (rec.get().getAsBoolean() || (--reg[2] >= 0 && !(vis[q0] = false) && false))))) == null
            && ((Predicate<int[]>) om -> IntStream.range(0, sz).allMatch(c0 -> !(vis[c0] = false) && ((fr[c0] = c0 / 1024 >= 1 && c0 / 1024 <= n0 && c0 % 1024 >= 1 && c0 % 1024 <= m0) || true))
                && IntStream.of(om).allMatch(c0 -> !(fr[c0] = false))
                && (reg[3] = n0 * m0 - om.length) > 0 && (vis[s0] = true) && (stk[0] = s0) > 0 && (reg[2] = 1) > 0) instanceof Predicate<int[]> init
            && (dd == 0 ? Stream.of(new int[0]) : dd == 1 ? Arrays.stream(ec).mapToObj(c0 -> new int[]{c0}) : IntStream.range(0, ec.length).boxed().flatMap(a0 -> IntStream.range(a0 + 1, ec.length).mapToObj(b0 -> new int[]{ec[a0], ec[b0]}))).filter(om -> init.test(om) && rec.get().getAsBoolean()).findFirst() instanceof Optional<int[]> sol
            && sol.isPresent()
            && extend.apply(Arrays.copyOf(stk, reg[2]), 1) instanceof int[] fp
            ? fp.length + "\n" + IntStream.of(fp).mapToObj(p1 -> p1 / 1024 + " " + p1 % 1024).collect(Collectors.joining("\n"))
            : "").filter(r0 -> !r0.isEmpty()).findFirst().orElse("") : "").ifPresent(System.out::println);
    }
}

