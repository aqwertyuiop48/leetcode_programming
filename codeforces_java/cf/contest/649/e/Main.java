import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer a
            && IntStream.range(0, 2 * n).mapToLong(q -> q < n ? (((tk[2 + 2 * q] + tk[3 + 2 * q]) * 2) << 18) | q : ((tk[2 + 2 * (q - n)] * 2 + 1) << 18) | (q - n)).sorted().toArray() instanceof long[] ev
            && new int[n] instanceof int[] rk && new int[n] instanceof int[] idAt && new int[]{0} instanceof int[] cn
            && IntStream.range(0, 2 * n).filter(q -> ((ev[q] >> 18) & 1) == 0 && (rk[(int) (ev[q] & 262143L)] = cn[0]) >= 0 && (idAt[cn[0]++] = (int) (ev[q] & 262143L)) >= 0).count() >= 0
            && Stream.<IntFunction<boolean[]>>of(c -> new boolean[n] instanceof boolean[] rej && new long[(n >> 6) + 2] instanceof long[] l0 && new long[(n >> 12) + 2] instanceof long[] l1 && new long[1] instanceof long[] l2 && new int[]{0} instanceof int[] sz
                    && IntStream.range(0, 2 * n).filter(q -> ((ev[q] >> 18) & 1) == 0
                        ? (l0[rk[(int) (ev[q] & 262143L)] >> 6] >> (rk[(int) (ev[q] & 262143L)] & 63) & 1) == 0
                            || (--sz[0] >= 0 && (l0[rk[(int) (ev[q] & 262143L)] >> 6] &= ~(1L << (rk[(int) (ev[q] & 262143L)] & 63))) == 0
                                && (l1[rk[(int) (ev[q] & 262143L)] >> 12] &= ~(1L << ((rk[(int) (ev[q] & 262143L)] >> 6) & 63))) == 0 && (l2[0] &= ~(1L << (rk[(int) (ev[q] & 262143L)] >> 12))) >= 0)
                        : (l0[rk[(int) (ev[q] & 262143L)] >> 6] |= 1L << (rk[(int) (ev[q] & 262143L)] & 63)) != 0 & (l1[rk[(int) (ev[q] & 262143L)] >> 12] |= 1L << ((rk[(int) (ev[q] & 262143L)] >> 6) & 63)) != 0 & (l2[0] |= 1L << (rk[(int) (ev[q] & 262143L)] >> 12)) != 0 & ++sz[0] > 0
                            && (sz[0] <= c || Integer.valueOf(63 - Long.numberOfLeadingZeros(l2[0])) instanceof Integer i1 && Integer.valueOf((i1 << 6) + 63 - Long.numberOfLeadingZeros(l1[i1])) instanceof Integer i0
                                && Integer.valueOf((i0 << 6) + 63 - Long.numberOfLeadingZeros(l0[i0])) instanceof Integer x && (rej[idAt[x]] = true) && --sz[0] >= 0
                                && (l0[x >> 6] &= ~(1L << (x & 63))) == 0 && (l1[x >> 12] &= ~(1L << ((x >> 6) & 63))) == 0 && (l2[0] &= ~(1L << (x >> 12))) >= 0 || true)).count() >= 0
                    ? rej : null).findFirst().get() instanceof IntFunction<boolean[]> chk
            && new int[]{1, a} instanceof int[] lh
            && IntStream.range(0, 20).allMatch(z -> lh[0] >= lh[1] || Integer.valueOf((lh[0] + lh[1]) / 2) instanceof Integer mid
                && (chk.apply(mid) instanceof boolean[] rj && IntStream.range(0, n).filter(i -> !rj[i]).count() >= a ? (lh[1] = mid) >= 0 : (lh[0] = mid + 1) >= 0))
            && chk.apply(lh[0]) instanceof boolean[] fin
            ? lh[0] + "\n" + IntStream.range(0, n).filter(i -> !fin[i]).limit(a).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}
