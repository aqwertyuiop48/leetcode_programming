import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[1] instanceof long[] cur && new long[1][] instanceof long[][] A && new int[1] instanceof int[] tc
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0
                : i == 0 || raw[i - 1] < 48 || ((tc[0]++ == 0 ? (A[0] = new long[(int) cur[0]]) != null : (A[0][tc[0] - 2] = cur[0]) > 0) & (cur[0] = 0) == 0))
            && A[0] instanceof long[] a && Integer.valueOf(a.length) instanceof Integer n
            && new boolean[1000001] instanceof boolean[] comp
            && IntStream.rangeClosed(2, 1000).allMatch(i -> comp[i] || IntStream.rangeClosed(0, (1000000 - i * i) / i).allMatch(k -> comp[i * i + k * i] = true))
            && IntStream.rangeClosed(2, 1000000).filter(i -> !comp[i]).toArray() instanceof int[] pr
            && new Random() instanceof Random rnd && new long[]{1} instanceof long[] best && new HashSet<Long>() instanceof HashSet<Long> rej && new HashSet<Long>() instanceof HashSet<Long> seen
            && (n <= 20000 ? a : LongStream.generate(() -> a[rnd.nextInt(n)]).limit(20000).toArray()) instanceof long[] sm
            && Integer.valueOf(sm.length) instanceof Integer ns && Integer.valueOf(n <= 20000 ? n : 20000 - 566) instanceof Integer thr
            && IntStream.range(0, 16).allMatch(it -> Long.valueOf(a[rnd.nextInt(n)]) instanceof Long x && (x <= best[0] || !seen.add(x)
                || new long[]{x} instanceof long[] rem && new long[40] instanceof long[] fp && new int[40] instanceof int[] fe && new int[1] instanceof int[] m
                && (IntStream.range(0, pr.length).allMatch(pi -> (long) pr[pi] * pr[pi] > rem[0] ? false
                    : rem[0] % pr[pi] != 0 || (Long.valueOf(pr[pi]) instanceof Long p && Long.valueOf(LongStream.iterate(rem[0], r -> r % p == 0, r -> r / p).count()) instanceof Long e
                        && (fp[m[0]] = p) > 0 && (fe[m[0]++] = e.intValue()) > 0 && (rem[0] = LongStream.range(0, e).reduce(rem[0], (r, z) -> r / p)) > 0)) || true)
                && (rem[0] == 1 || ((fp[m[0]] = rem[0]) > 0 && (fe[m[0]++] = 1) > 0))
                && new int[42] instanceof int[] stride && (stride[0] = 1) > 0
                && IntStream.range(0, m[0]).allMatch(t -> (stride[t + 1] = stride[t] * (fe[t] + 1)) > 0)
                && Integer.valueOf(stride[m[0]]) instanceof Integer D
                && new long[64] instanceof long[] pw && new double[64] instanceof double[] iv && new int[64] instanceof int[] sd && new int[1] instanceof int[] uc
                && IntStream.range(0, m[0]).allMatch(t -> IntStream.rangeClosed(1, fe[t]).allMatch(j -> (pw[uc[0]] = j == 1 ? fp[t] : pw[uc[0] - 1] * fp[t]) > 0
                    && (sd[uc[0]] = stride[t]) > 0 && (iv[uc[0]] = 1.0 / pw[uc[0]]) > 0 && ++uc[0] > 0))
                && ((Function<long[], int[]>) arr -> new int[arr.length] instanceof int[] ix
                    && IntStream.range(0, uc[0]).allMatch(u -> Long.valueOf(pw[u]) instanceof Long q && Double.valueOf(iv[u]) instanceof Double w && Integer.valueOf(sd[u]) instanceof Integer s
                        && IntStream.range(0, arr.length).allMatch(i -> (ix[i] += Math.abs(2 * (arr[i] - (long) (arr[i] * w) * q) - q) == q ? s : 0) >= 0))
                    && new int[D] instanceof int[] c && IntStream.range(0, arr.length).allMatch(i -> ++c[ix[i]] > 0)
                    && IntStream.range(0, m[0]).allMatch(t -> IntStream.range(0, D).allMatch(z -> Integer.valueOf(D - 1 - z) instanceof Integer id && (id / stride[t]) % (fe[t] + 1) < fe[t]
                        ? (c[id] += c[id + stride[t]]) >= 0 : true))
                    ? c : null) instanceof Function<long[], int[]> cntf
                && cntf.apply(sm) instanceof int[] c
                && new long[D] instanceof long[] val && (val[0] = 1) > 0
                && IntStream.range(0, m[0]).allMatch(t -> IntStream.range(stride[t], stride[t + 1]).allMatch(id -> (val[id] = val[id - stride[t]] * fp[t]) > 0))
                && IntStream.range(0, D).filter(id -> 2 * c[id] >= thr && val[id] > best[0] && !rej.contains(val[id])).boxed().sorted((u, w) -> Long.compare(val[w], val[u])).toList() instanceof List<Integer> cd
                && (cd.stream().limit(4).filter(id -> Arrays.stream(a).filter(v -> v % val[id] == 0).count() * 2 >= n || (rej.add(val[id]) && false)).findFirst() instanceof Optional<Integer> fnd
                    && (fnd.isPresent() ? (best[0] = Math.max(best[0], val[fnd.get()])) > 0
                        : cd.size() <= 4 || (cntf.apply(a) instanceof int[] c2
                            && (best[0] = Math.max(best[0], IntStream.range(0, D).filter(id -> 2L * c2[id] >= n).mapToLong(id -> val[id]).max().orElse(0))) > 0
                            && cd.stream().filter(id -> 2L * c2[id] < n).map(id -> rej.add(val[id])).count() >= 0)) || true)))
            ? best[0] : "");
    }
}

