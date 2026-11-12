
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] == 10).findFirst().orElse(raw.length)) instanceof Integer nl
            && new StringTokenizer(new String(raw, 0, nl)) instanceof StringTokenizer hd
            && Integer.valueOf(hd.nextToken()) instanceof Integer h && Integer.valueOf(hd.nextToken()) instanceof Integer w
            && Integer.valueOf(w + 2) instanceof Integer W && Integer.valueOf((h + 2) * W) instanceof Integer size
            && new int[size] instanceof int[] a && new int[1] instanceof int[] pos
            && IntStream.range(nl, raw.length).allMatch(i -> raw[i] < 48 || raw[i] > 49 || pos[0] >= h * w
                || ((raw[i] == 48 || (a[(pos[0] / w + 1) * W + pos[0] % w + 1] = 1) > 0) && ++pos[0] > 0))
            && ((Function<int[], int[]>) c -> new int[size] instanceof int[] d
                && IntStream.range(W + 1, size - W - 1).allMatch(s -> (d[s] = c[s] != 0 && c[s + 1] != 0 && c[s - 1] != 0 && c[s + W] != 0 && c[s - W] != 0
                    && c[s + W + 1] != 0 && c[s + W - 1] != 0 && c[s - W + 1] != 0 && c[s - W - 1] != 0 ? 1 : 0) >= 0) ? d : null) instanceof Function<int[], int[]> er
            && ((Function<int[], int[]>) c -> new int[size] instanceof int[] d
                && IntStream.range(W + 1, size - W - 1).allMatch(s -> (d[s] = s % W != 0 && s % W != W - 1
                    && c[s] + c[s + 1] + c[s - 1] + c[s + W] + c[s - W] + c[s + W + 1] + c[s + W - 1] + c[s - W + 1] + c[s - W - 1] > 0 ? 1 : 0) >= 0) ? d : null) instanceof Function<int[], int[]> dl
            && dl.apply(dl.apply(dl.apply(dl.apply(dl.apply(er.apply(er.apply(a))))))) instanceof int[] cc
            && new int[size] instanceof int[] rr
            && IntStream.range(0, size).allMatch(s -> (rr[s] = a[s] != 0 && cc[s] == 0 ? 1 : 0) >= 0)
            && ((Function<int[], int[]>) mask -> new int[size] instanceof int[] lab && new int[size] instanceof int[] q && new int[2] instanceof int[] c
                && ((IntPredicate) x -> mask[x] != 0 && lab[x] == 0 && (lab[x] = c[0]) > 0 && (q[c[1]++] = x) >= 0) instanceof IntPredicate vis
                && IntStream.range(0, size).allMatch(s -> mask[s] == 0 || lab[s] != 0
                    || ++c[0] > 0 && (lab[s] = c[0]) > 0 && (q[0] = s) >= 0 && (c[1] = 1) > 0
                    && IntStream.iterate(0, t -> t < c[1], t -> t + 1).allMatch(t -> (vis.test(q[t] + 1) | vis.test(q[t] - 1) | vis.test(q[t] + W) | vis.test(q[t] - W)
                        | vis.test(q[t] + W + 1) | vis.test(q[t] + W - 1) | vis.test(q[t] - W + 1) | vis.test(q[t] - W - 1)) || true))
                ? lab : new int[0]) instanceof Function<int[], int[]> label
            && label.apply(a) instanceof int[] lo && label.apply(rr) instanceof int[] lr
            && Integer.valueOf(Arrays.stream(lo).max().getAsInt()) instanceof Integer cnt && Integer.valueOf(Arrays.stream(lr).max().getAsInt()) instanceof Integer rc
            && new boolean[rc + 1] instanceof boolean[] seen && new int[cnt + 1] instanceof int[] rays
            && IntStream.range(0, size).allMatch(s -> rr[s] == 0 || seen[lr[s]] || ((seen[lr[s]] = true) && ++rays[lo[s]] > 0))
            ? cnt + "\n" + Arrays.stream(rays, 1, cnt + 1).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}



