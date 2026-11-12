
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((tk[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer m && Integer.valueOf(n - m + 1) instanceof Integer W && Integer.valueOf(tk[2 + n]) instanceof Integer s
            && Integer.valueOf(256) instanceof Integer P1 && Integer.valueOf(8) instanceof Integer R && Integer.valueOf(128) instanceof Integer K && Integer.valueOf(4) instanceof Integer LV
            && IntStream.range(0, n).mapToLong(i -> ((long) tk[2 + i] << 18) | i).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, n).map(r -> 2 * (int) (keys[r] >> 18) + 1).toArray() instanceof int[] sa2
            && IntStream.range(0, n).map(r -> (int) (keys[r] & 262143)).toArray() instanceof int[] pos
            && new int[n + 2] instanceof int[] rk && IntStream.range(0, n).allMatch(r -> (rk[pos[r]] = r) >= 0) && (rk[n] = Integer.MAX_VALUE) > 0 && (rk[n + 1] = Integer.MAX_VALUE) > 0
            && IntStream.range(0, LV).map(l -> P1 * (int) Math.pow(R, l)).toArray() instanceof int[] PP
            && IntStream.range(0, LV).map(l -> (W + PP[l] - 1) / PP[l]).toArray() instanceof int[] nbA
            && Integer.valueOf(n / K + 1) instanceof Integer nck
            && new int[LV][] instanceof int[][] T0 && new int[LV][] instanceof int[][] T1 && new int[LV][] instanceof int[][] Gf && new int[LV][] instanceof int[][] go
            && IntStream.range(0, LV).allMatch(lv -> (T0[lv] = new int[nck * (nbA[lv] + 1)]) != null && (T1[lv] = new int[nck * (nbA[lv] + 1)]) != null
                && new int[nbA[lv] + 2] instanceof int[] cb0 && new int[nbA[lv] + 2] instanceof int[] cb1
                && IntStream.range(0, nck).allMatch(kc -> (kc == 0 || IntStream.range((kc - 1) * K, kc * K).allMatch(r -> Integer.valueOf(pos[r]) instanceof Integer p
                        && (p >= W || ++cb0[p / PP[lv] + 1] > 0) && (p < m ? ++cb1[0] > 0 : ++cb1[(p - m) / PP[lv] + 1] > 0)))
                    && IntStream.rangeClosed(0, nbA[lv]).allMatch(b -> (T0[lv][kc * (nbA[lv] + 1) + b] = (b > 0 ? T0[lv][kc * (nbA[lv] + 1) + b - 1] : 0) + cb0[b]) >= 0
                        && (T1[lv][kc * (nbA[lv] + 1) + b] = (b > 0 ? T1[lv][kc * (nbA[lv] + 1) + b - 1] : 0) + cb1[b]) >= 0)))
            && new int[n + 1] instanceof int[] srt && new long[nck * (K + 1) * 2] instanceof long[] mk
            && IntStream.range(0, nck).allMatch(kc -> Integer.valueOf(kc * K) instanceof Integer lo0 && Integer.valueOf(Math.min(n, lo0 + K)) instanceof Integer hi0
                && IntStream.range(lo0, hi0).mapToLong(r -> ((long) pos[r] << 8) | (r - lo0)).sorted().toArray() instanceof long[] sk
                && IntStream.range(0, sk.length).allMatch(j -> (srt[lo0 + j] = (int) (sk[j] >> 8)) >= 0
                    && (mk[(kc * (K + 1) + j + 1) * 2] = mk[(kc * (K + 1) + j) * 2] | ((sk[j] & 255) < 64 ? 1L << (sk[j] & 255) : 0L)) >= Long.MIN_VALUE
                    && (mk[(kc * (K + 1) + j + 1) * 2 + 1] = mk[(kc * (K + 1) + j) * 2 + 1] | ((sk[j] & 255) >= 64 ? 1L << ((sk[j] & 255) - 64) : 0L)) >= Long.MIN_VALUE))
            && Integer.valueOf(Math.min(PP[LV - 1], W) <= 1 ? 1 : Integer.highestOneBit(Math.min(PP[LV - 1], W) - 1) * 2) instanceof Integer TSM
            && new int[2 * TSM] instanceof int[] tmin && new int[TSM] instanceof int[] tadd && new int[]{1} instanceof int[] ts && new int[5] instanceof int[] h4
            && ((IntBinaryOperator) (l, r) -> (h4[0] = l + ts[0]) >= 0 && (h4[1] = r + ts[0] + 1) > 0 && (h4[2] = l + ts[0]) >= 0 && (h4[3] = r + ts[0]) > 0 && (h4[4] = Integer.numberOfTrailingZeros(ts[0])) >= 0
                && IntStream.rangeClosed(0, h4[4]).allMatch(j ->
                    (h4[0] >= h4[1] || (((h4[0] & 1) == 0 || (++tmin[h4[0]] > 0 && (j == 0 || ++tadd[h4[0]] > 0) && ++h4[0] > 0))
                        && ((h4[1] & 1) == 0 || (--h4[1] > 0 && ++tmin[h4[1]] > 0 && (j == 0 || ++tadd[h4[1]] > 0)))))
                    && (h4[0] >>= 1) >= 0 && (h4[1] >>= 1) >= 0
                    && (j == h4[4] || (tmin[h4[2] >> (j + 1)] = Math.min(tmin[2 * (h4[2] >> (j + 1))], tmin[2 * (h4[2] >> (j + 1)) + 1]) + tadd[h4[2] >> (j + 1)]) > Integer.MIN_VALUE)
                    && (j == h4[4] || (tmin[h4[3] >> (j + 1)] = Math.min(tmin[2 * (h4[3] >> (j + 1))], tmin[2 * (h4[3] >> (j + 1)) + 1]) + tadd[h4[3] >> (j + 1)]) > Integer.MIN_VALUE)) ? 0 : 1) instanceof IntBinaryOperator rad
            && IntStream.range(0, LV).allMatch(lv -> (go[lv] = new int[nbA[lv] + 1]) != null
                && IntStream.range(0, nbA[lv]).allMatch(b -> Integer.valueOf(Math.min(b * PP[lv], W)) instanceof Integer S0 && Integer.valueOf(Math.min((b + 1) * PP[lv], W)) instanceof Integer E0
                    && (go[lv][b + 1] = go[lv][b] + (E0 - S0 + m - 1) - (E0 <= S0 + m ? S0 + m - E0 + 1 : 0) + 1) >= 0)
                && (Gf[lv] = new int[go[lv][nbA[lv]]]) != null
                && IntStream.range(0, nbA[lv]).allMatch(b -> Integer.valueOf(Math.min(b * PP[lv], W)) instanceof Integer S0 && Integer.valueOf(Math.min((b + 1) * PP[lv], W)) instanceof Integer E0
                    && Integer.valueOf(E0 - S0 <= 1 ? 1 : Integer.highestOneBit(E0 - S0 - 1) * 2) instanceof Integer TS && (ts[0] = TS) > 0
                    && IntStream.range(0, TS).allMatch(i -> (tmin[TS + i] = i < E0 - S0 ? 0 : 1000000000) >= 0 && (tadd[i] = 0) == 0)
                    && IntStream.range(1, TS).map(i -> TS - i).allMatch(p -> (tmin[p] = Math.min(tmin[2 * p], tmin[2 * p + 1])) >= 0)
                    && IntStream.rangeClosed(S0, E0 + m - 2).filter(p -> !(E0 <= S0 + m && p >= E0 - 1 && p <= S0 + m - 1)).map(p -> rk[p]).sorted().toArray() instanceof int[] rl
                    && (Gf[lv][go[lv][b]] = 0) == 0
                    && IntStream.range(0, rl.length).allMatch(i -> Integer.valueOf(pos[rl[i]]) instanceof Integer p
                        && rad.applyAsInt(Math.max(S0, p - m + 1) - S0, Math.min(E0 - 1, p) - S0) == 0 && (Gf[lv][go[lv][b] + i + 1] = tmin[1]) >= 0)))
            && new int[3] instanceof int[] qs && new long[2] instanceof long[] qm && new int[8] instanceof int[] w && new int[2] instanceof int[] sc && new int[2] instanceof int[] bb
            && ((IntUnaryOperator) y -> qs[2] == 0 ? 0
                : (w[7] = Arrays.binarySearch(srt, qs[1] * K, qs[1] * K + Math.min(K, n - qs[1] * K), y)) >= Integer.MIN_VALUE
                && (w[7] = ((w[7] ^ (w[7] >> 31)) - qs[1] * K) * 2 + qs[1] * (K + 1) * 2) >= 0
                ? Long.bitCount(mk[w[7]] & qm[0]) + Long.bitCount(mk[w[7] + 1] & qm[1]) : 0) instanceof IntUnaryOperator corr
            && ((IntBinaryOperator) (lv, b) -> (w[0] = Math.min(b * PP[lv], W)) >= 0 && (w[1] = Math.min((b + 1) * PP[lv], W)) >= 0 && (w[2] = qs[1] * (nbA[lv] + 1) + b) >= 0
                && (w[3] = T0[lv][w[2]] + corr.applyAsInt(w[0])) > Integer.MIN_VALUE && (w[4] = T0[lv][w[2] + 1] + corr.applyAsInt(w[1])) > Integer.MIN_VALUE
                && (w[5] = T1[lv][w[2]] + corr.applyAsInt(w[0] + m)) > Integer.MIN_VALUE && (w[6] = T1[lv][w[2] + 1] + corr.applyAsInt(w[1] + m)) > Integer.MIN_VALUE
                && (w[7] = w[1] <= w[0] + m ? w[5] - (w[4] - (rk[w[1] - 1] < qs[0] ? 1 : 0)) : 0) > Integer.MIN_VALUE
                ? w[7] + Gf[lv][go[lv][b] + (w[6] - (rk[w[1] + m - 1] < qs[0] ? 1 : 0)) - w[3] - w[7]] : -1) instanceof IntBinaryOperator ev
            && ((IntBinaryOperator) (u1, u2) -> Integer.valueOf(u1 / P1) instanceof Integer b0 && Integer.valueOf(b0 * P1) instanceof Integer g0
                && (sc[1] = (T1[0][qs[1] * (nbA[0] + 1) + b0] + corr.applyAsInt(g0 + m)) - (T0[0][qs[1] * (nbA[0] + 1) + b0] + corr.applyAsInt(g0))) >= Integer.MIN_VALUE
                && IntStream.rangeClosed(g0, u2).allMatch(u -> (u < u1 || (sc[0] = Math.min(sc[0], sc[1])) >= Integer.MIN_VALUE)
                    && (sc[1] += (rk[u + m] < qs[0] ? 1 : 0) - (rk[u] < qs[0] ? 1 : 0)) >= Integer.MIN_VALUE) ? 0 : 1) instanceof IntBinaryOperator scan
            && new StringBuilder() instanceof StringBuilder sbd && new int[]{0} instanceof int[] prev
            && IntStream.range(0, s).allMatch(qi -> Integer.valueOf(3 + n + 3 * qi) instanceof Integer qb
                && Integer.valueOf(tk[qb] - 1) instanceof Integer lq && Integer.valueOf(tk[qb + 1] - 1) instanceof Integer rq
                && (qs[0] = -Arrays.binarySearch(sa2, 2 * (tk[qb + 2] ^ prev[0])) - 1) >= 0 && (qs[1] = qs[0] / K) >= 0 && (qs[2] = qs[0] - qs[1] * K) >= 0
                && (qm[0] = qs[2] >= 64 ? -1L : (1L << qs[2]) - 1) >= Long.MIN_VALUE && (qm[1] = qs[2] <= 64 ? 0L : qs[2] >= 128 ? -1L : (1L << (qs[2] - 64)) - 1) >= Long.MIN_VALUE
                && (sc[0] = Integer.MAX_VALUE) > 0
                && Integer.valueOf((lq + P1 - 1) / P1) instanceof Integer bl && Integer.valueOf(rq + 1 == W ? nbA[0] : (rq + 1) / P1) instanceof Integer br
                && (bl >= br ? scan.applyAsInt(lq, rq) == 0
                    : (lq >= bl * P1 || scan.applyAsInt(lq, bl * P1 - 1) == 0)
                        && (rq + 1 <= Math.min(br * P1, W) || scan.applyAsInt(br * P1, rq) == 0)
                        && (bb[0] = bl) >= 0 && (bb[1] = br) >= 0
                        && IntStream.range(0, LV).allMatch(lv -> (lv == LV - 1 || (IntStream.iterate(0, z -> bb[0] < bb[1] && bb[0] % R != 0, z -> z + 1).allMatch(z -> (sc[0] = Math.min(sc[0], ev.applyAsInt(lv, bb[0]++))) >= Integer.MIN_VALUE)
                                && IntStream.iterate(0, z -> bb[0] < bb[1] && bb[1] % R != 0, z -> z + 1).allMatch(z -> (sc[0] = Math.min(sc[0], ev.applyAsInt(lv, --bb[1]))) >= Integer.MIN_VALUE)
                                && (bb[0] /= R) >= 0 && (bb[1] /= R) >= 0))
                            && (lv < LV - 1 || IntStream.range(bb[0], bb[1]).allMatch(c -> (sc[0] = Math.min(sc[0], ev.applyAsInt(LV - 1, c))) >= Integer.MIN_VALUE))))
                && sbd.append(sc[0]).append('\n') != null && (prev[0] = sc[0]) >= 0)
            ? sbd.toString().trim() : "");
    }
}



