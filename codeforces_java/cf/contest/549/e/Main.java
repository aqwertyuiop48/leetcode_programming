
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk && new int[4] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && (raw[i] >= 48 || raw[i] == 45)
                ? (raw[i] == 45 ? (cur[1] = 1) == 1 : (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0) && (cur[2] = 1) == 1
                : cur[2] == 0 || ((tk[cur[3]++] = cur[1] == 1 ? -cur[0] : cur[0]) != Integer.MIN_VALUE && (cur[0] = 0) == 0 && (cur[1] = 0) == 0 && (cur[2] = 0) == 0)) || true)
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer m
            && new int[][]{IntStream.range(0, n).map(i -> tk[2 + 2 * i]).toArray(), IntStream.range(0, n).map(i -> tk[3 + 2 * i]).toArray()} instanceof int[][] PA
            && new int[][]{IntStream.range(0, m).map(i -> tk[2 + 2 * n + 2 * i]).toArray(), IntStream.range(0, m).map(i -> tk[3 + 2 * n + 2 * i]).toArray()} instanceof int[][] PB
            && ((BiPredicate<int[][], int[][]>) (A, B) -> Integer.valueOf(A[0].length) instanceof Integer nA && Integer.valueOf(B[0].length) instanceof Integer nB
                && IntStream.range(0, nA).mapToLong(i -> ((long) (A[0][i] + 10000) << 20) | (A[1][i] + 10000)).sorted().toArray() instanceof long[] ky
                && IntStream.range(0, nA).map(i -> (int) (ky[i] >> 20) - 10000).toArray() instanceof int[] sx
                && IntStream.range(0, nA).map(i -> (int) (ky[i] & 1048575) - 10000).toArray() instanceof int[] sy
                && new int[2 * nA + 2] instanceof int[] stk && new int[1] instanceof int[] tp
                && IntStream.range(0, nA).allMatch(i -> IntStream.iterate(0, z -> tp[0] >= 2
                        && (long) (sx[stk[tp[0] - 1]] - sx[stk[tp[0] - 2]]) * (sy[i] - sy[stk[tp[0] - 2]]) - (long) (sy[stk[tp[0] - 1]] - sy[stk[tp[0] - 2]]) * (sx[i] - sx[stk[tp[0] - 2]]) <= 0, z -> z + 1)
                        .allMatch(z -> --tp[0] >= 0) && (stk[tp[0]++] = i) >= 0)
                && Integer.valueOf(tp[0] + 1) instanceof Integer lim
                && IntStream.range(1, nA).allMatch(j -> Integer.valueOf(nA - 1 - j) instanceof Integer i && IntStream.iterate(0, z -> tp[0] >= lim
                        && (long) (sx[stk[tp[0] - 1]] - sx[stk[tp[0] - 2]]) * (sy[i] - sy[stk[tp[0] - 2]]) - (long) (sy[stk[tp[0] - 1]] - sy[stk[tp[0] - 2]]) * (sx[i] - sx[stk[tp[0] - 2]]) <= 0, z -> z + 1)
                        .allMatch(z -> --tp[0] >= 0) && (stk[tp[0]++] = i) >= 0)
                && Integer.valueOf(tp[0] - 1) instanceof Integer h
                && IntStream.range(0, h).map(i -> sx[stk[i]]).toArray() instanceof int[] hx && IntStream.range(0, h).map(i -> sy[stk[i]]).toArray() instanceof int[] hy
                && IntStream.concat(Arrays.stream(hx), Arrays.stream(B[0])).toArray() instanceof int[] PX && IntStream.concat(Arrays.stream(hy), Arrays.stream(B[1])).toArray() instanceof int[] PY
                && IntStream.range(0, h + nB).mapToLong(i -> (long) PX[i] * PX[i] + (long) PY[i] * PY[i]).toArray() instanceof long[] PQ
                && new int[2 * h + 2] instanceof int[] ea && new int[2 * h + 2] instanceof int[] eb && new int[1] instanceof int[] ec
                && (h == 2 ? (ea[0] = 0) == 0 && (eb[0] = 1) == 1 && (ec[0] = 1) == 1
                    : IntStream.range(0, h).allMatch(i -> (ea[ec[0]] = i) >= 0 && (eb[ec[0]++] = (i + 1) % h) >= 0)
                        && new int[h + 2] instanceof int[] sl && new int[h + 2] instanceof int[] sr && new int[1] instanceof int[] spp && new long[3] instanceof long[] bk
                        && (sl[0] = 0) == 0 && (sr[0] = h - 1) == h - 1 && (spp[0] = 1) == 1
                        && IntStream.iterate(0, z -> spp[0] > 0, z -> z + 1).allMatch(z -> Integer.valueOf(sl[--spp[0]]) instanceof Integer l && Integer.valueOf(sr[spp[0]]) instanceof Integer r
                            && (r - l < 2
                                || Long.valueOf((long) hx[l] * hx[l] + (long) hy[l] * hy[l]) instanceof Long pp0 && Long.valueOf(hx[l] + hx[r]) instanceof Long sxx && Long.valueOf(hy[l] + hy[r]) instanceof Long syy
                                && Long.valueOf(-(hy[r] - hy[l])) instanceof Long nx0 && Long.valueOf(hx[r] - hx[l]) instanceof Long ny0 && (bk[0] = -1) == -1
                                && IntStream.range(l + 1, r).allMatch(kk -> Long.valueOf((long) hx[kk] * hx[kk] + (long) hy[kk] * hy[kk] - pp0 - sxx * (hx[kk] - hx[l]) - syy * (hy[kk] - hy[l])) instanceof Long fk
                                    && Long.valueOf(nx0 * (hx[kk] - hx[l]) + ny0 * (hy[kk] - hy[l])) instanceof Long sk
                                    && (bk[0] < 0 || -fk * bk[2] < bk[1] * -sk ? (bk[0] = kk) >= 0 && (bk[1] = -fk) != Long.MAX_VALUE && (bk[2] = -sk) > 0 : true))
                                && Integer.valueOf((int) bk[0]) instanceof Integer k
                                && (k - l < 2 || (ea[ec[0]] = l) >= 0 && (eb[ec[0]++] = k) >= 0 && (sl[spp[0]] = l) >= 0 && (sr[spp[0]++] = k) >= 0)
                                && (r - k < 2 || (ea[ec[0]] = k) >= 0 && (eb[ec[0]++] = r) >= 0 && (sl[spp[0]] = k) >= 0 && (sr[spp[0]++] = r) >= 0))))
                && new long[8] instanceof long[] w && new long[8] instanceof long[] st
                && IntStream.range(0, ec[0]).anyMatch(e -> Integer.valueOf(ea[e]) instanceof Integer a && Integer.valueOf(eb[e]) instanceof Integer b
                    && Long.valueOf(hx[a]) instanceof Long pix && Long.valueOf(hy[a]) instanceof Long piy
                    && Long.valueOf(hx[a] + hx[b]) instanceof Long ssx && Long.valueOf(hy[a] + hy[b]) instanceof Long ssy
                    && Long.valueOf(-(hy[b] - hy[a])) instanceof Long nx && Long.valueOf(hx[b] - hx[a]) instanceof Long ny
                    && Long.valueOf(pix * pix + piy * piy) instanceof Long pp
                    && IntStream.range(0, 6).allMatch(q -> (st[q] = 0) == 0)
                    && IntStream.range(0, h + nB).allMatch(idx -> (w[0] = PQ[idx] - pp - ssx * (PX[idx] - pix) - ssy * (PY[idx] - piy)) != Long.MIN_VALUE
                        && (w[1] = nx * (PX[idx] - pix) + ny * (PY[idx] - piy)) != Long.MIN_VALUE
                        && (w[1] == 0 ? (idx < h ? w[0] <= 0 : w[0] > 0)
                            : (w[2] = w[1] > 0 ? w[0] : -w[0]) != Long.MIN_VALUE && (w[3] = Math.abs(w[1])) > 0 && (w[4] = idx < h ? 0 : 1) >= 0
                                && ((idx < h) == (w[1] > 0)
                                    ? ((st[1] == 0 || w[2] * st[1] > st[0] * w[3]) ? (st[0] = w[2]) != Long.MIN_VALUE && (st[1] = w[3]) > 0 && (st[2] = w[4]) >= 0
                                        : (w[2] * st[1] != st[0] * w[3] || (st[2] |= w[4]) >= 0))
                                    : ((st[4] == 0 || w[2] * st[4] < st[3] * w[3]) ? (st[3] = w[2]) != Long.MIN_VALUE && (st[4] = w[3]) > 0 && (st[5] = w[4]) >= 0
                                        : (w[2] * st[4] != st[3] * w[3] || (st[5] |= w[4]) >= 0)))
                                && !(st[1] > 0 && st[4] > 0 && (st[0] * st[4] > st[3] * st[1] || (st[0] * st[4] == st[3] * st[1] && (st[2] | st[5]) != 0))))))) instanceof BiPredicate<int[][], int[][]> dir
            ? (n == 1 || m == 1 || dir.test(PA, PB) || dir.test(PB, PA) ? "YES" : "NO") : "");
    }
}



