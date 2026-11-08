import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk && new int[]{0, 0, 0} instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length ? raw[i] : 32) >= 48
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((tk[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer m
            && IntStream.range(0, n).map(i -> tk[2 + i]).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> tk[2 + n + 2 * i]).toArray() instanceof int[] ty
            && IntStream.range(0, m).map(i -> tk[3 + n + 2 * i]).toArray() instanceof int[] rr
            && new int[m + 1] instanceof int[] sm
            && IntStream.iterate(m - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (sm[i] = Math.max(sm[i + 1], rr[i])) >= 0)
            && IntStream.range(0, m).filter(i -> rr[i] > sm[i + 1]).toArray() instanceof int[] kp
            && Arrays.copyOf(a, rr[kp[0]]) instanceof int[] b0 && new Random() instanceof Random rd
            && IntStream.range(1, b0.length).allMatch(i -> Integer.valueOf(rd.nextInt(i + 1)) instanceof Integer j && Integer.valueOf(b0[i]) instanceof Integer tmp && (b0[i] = b0[j]) >= Integer.MIN_VALUE && (b0[j] = tmp) >= Integer.MIN_VALUE)
            && IntStream.of(b0).sorted().toArray() instanceof int[] b
            && a.clone() instanceof int[] res
            && new int[]{0, rr[kp[0]] - 1} instanceof int[] lh
            && IntStream.range(0, kp.length).allMatch(idx -> IntStream.iterate(rr[kp[idx]] - 1, p -> p >= (idx + 1 < kp.length ? rr[kp[idx + 1]] : 0), p -> p - 1)
                .allMatch(p -> (res[p] = ty[kp[idx]] == 1 ? b[lh[1]--] : b[lh[0]++]) >= Integer.MIN_VALUE))
            ? IntStream.of(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
