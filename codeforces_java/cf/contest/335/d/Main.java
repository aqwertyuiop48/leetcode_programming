import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] t && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((t[st[1]++] = st[0]) >= 0 & (st[0] = 0) == 0 & (st[2] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n
            && new int[9006001] instanceof int[] idm
            && IntStream.range(0, 4 * n).map(j -> t[1 + 4 * (j >> 2) + ((j & 1) << 1)] * 3001 + t[2 + 4 * (j >> 2) + (j & 2)]).sorted().toArray() instanceof int[] ks
            && IntStream.range(0, 4 * n).filter(j -> j == 0 || ks[j] != ks[j - 1]).toArray() instanceof int[] ui
            && Integer.valueOf(ui.length) instanceof Integer m && new int[m] instanceof int[] pk
            && IntStream.range(0, m).allMatch(i -> (pk[i] = ks[ui[i]]) >= 0 & (idm[pk[i]] = i + 1) > 0)
            && new int[m] instanceof int[] sq0 && new int[m] instanceof int[] sq3
            && IntStream.range(0, n).allMatch(r -> (sq0[idm[t[1 + 4 * r] * 3001 + t[2 + 4 * r]] - 1] = r + 1) > 0 && (sq3[idm[t[3 + 4 * r] * 3001 + t[4 + 4 * r]] - 1] = r + 1) > 0)
            && new int[m] instanceof int[] mk1 && new int[m] instanceof int[] mk2
            && new int[m] instanceof int[] la && new int[m] instanceof int[] ta && new int[m] instanceof int[] ra && new int[m] instanceof int[] ba
            && IntStream.range(0, n).allMatch(r -> (mk1[idm[t[3 + 4 * r] * 3001 + t[4 + 4 * r]] - 1] = 1) > 0 & (mk2[idm[t[1 + 4 * r] * 3001 + t[2 + 4 * r]] - 1] = 1) > 0)
            && IntStream.range(0, m).allMatch(z -> Integer.valueOf(m - 1 - z) instanceof Integer p && Integer.valueOf(sq3[p] - 1) instanceof Integer s
                && (mk1[p] == 0 || s < 0 || (mk1[idm[(t[3 + 4 * s]) * 3001 + (t[2 + 4 * s])] - 1] = 1) > 0 & (mk1[idm[(t[1 + 4 * s]) * 3001 + (t[4 + 4 * s])] - 1] = 1) > 0))
            && IntStream.range(0, m).allMatch(p -> Integer.valueOf(sq3[p] - 1) instanceof Integer s
                && (la[p] = mk1[p] == 0 ? -1 : s < 0 ? 0 : t[3 + 4 * s] - t[1 + 4 * s] + la[idm[(t[1 + 4 * s]) * 3001 + (t[4 + 4 * s])] - 1]) > -2
                && (ta[p] = mk1[p] == 0 ? -1 : s < 0 ? 0 : t[4 + 4 * s] - t[2 + 4 * s] + ta[idm[(t[3 + 4 * s]) * 3001 + (t[2 + 4 * s])] - 1]) > -2)
            && IntStream.range(0, m).allMatch(p -> Integer.valueOf(sq0[p] - 1) instanceof Integer s
                && (mk2[p] == 0 || s < 0 || (mk2[idm[(t[3 + 4 * s]) * 3001 + (t[2 + 4 * s])] - 1] = 1) > 0 & (mk2[idm[(t[1 + 4 * s]) * 3001 + (t[4 + 4 * s])] - 1] = 1) > 0))
            && IntStream.range(0, m).allMatch(z -> Integer.valueOf(m - 1 - z) instanceof Integer p && Integer.valueOf(sq0[p] - 1) instanceof Integer s
                && (ra[p] = mk2[p] == 0 ? -1 : s < 0 ? 0 : t[3 + 4 * s] - t[1 + 4 * s] + ra[idm[(t[3 + 4 * s]) * 3001 + (t[2 + 4 * s])] - 1]) > -2
                && (ba[p] = mk2[p] == 0 ? -1 : s < 0 ? 0 : t[4 + 4 * s] - t[2 + 4 * s] + ba[idm[(t[1 + 4 * s]) * 3001 + (t[4 + 4 * s])] - 1]) > -2)
            && new int[262144] instanceof int[] bt && new int[m] instanceof int[] pa && new int[2] instanceof int[] g
            && IntStream.range(0, m).allMatch(p -> Integer.valueOf(sq3[p] - 1) instanceof Integer s
                && Integer.valueOf(pk[p] % 3001 + 131072) instanceof Integer q
                && Integer.valueOf(s < 0 ? 0 : (t[3 + 4 * s] - t[1 + 4 * s]) * (t[4 + 4 * s] - t[2 + 4 * s])) instanceof Integer v
                && ((bt[q >> 0] += v) > Integer.MIN_VALUE & (bt[q >> 1] += v) > Integer.MIN_VALUE & (bt[q >> 2] += v) > Integer.MIN_VALUE & (bt[q >> 3] += v) > Integer.MIN_VALUE & (bt[q >> 4] += v) > Integer.MIN_VALUE & (bt[q >> 5] += v) > Integer.MIN_VALUE & (bt[q >> 6] += v) > Integer.MIN_VALUE & (bt[q >> 7] += v) > Integer.MIN_VALUE & (bt[q >> 8] += v) > Integer.MIN_VALUE & (bt[q >> 9] += v) > Integer.MIN_VALUE & (bt[q >> 10] += v) > Integer.MIN_VALUE & (bt[q >> 11] += v) > Integer.MIN_VALUE & (bt[q >> 12] += v) > Integer.MIN_VALUE & (bt[q >> 13] += v) > Integer.MIN_VALUE & (bt[q >> 14] += v) > Integer.MIN_VALUE & (bt[q >> 15] += v) > Integer.MIN_VALUE & (bt[q >> 16] += v) > Integer.MIN_VALUE & (bt[q >> 17] += v) > Integer.MIN_VALUE)
                && (g[0] = q) > 0 & (g[1] = 0) == 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0 & (g[1] += g[0] > 0 && (g[0] & 1) == 0 ? bt[g[0]] : 0) > Integer.MIN_VALUE & (g[0] = g[0] > 0 ? (g[0] >> 1) - 1 + (g[0] & 1) : 0) >= 0
                && (pa[p] = g[1]) > Integer.MIN_VALUE)
            && new int[6003] instanceof int[] cd && new int[m] instanceof int[] ord
            && IntStream.range(0, m).allMatch(p -> (cd[pk[p] / 3001 - pk[p] % 3001 + 3001] += 1) > 0)
            && IntStream.range(1, 6003).allMatch(i -> (cd[i] += cd[i - 1]) >= 0)
            && IntStream.range(0, m).allMatch(p -> (ord[cd[pk[p] / 3001 - pk[p] % 3001 + 3000]++] = p) >= 0)
            && new int[m] instanceof int[] sx && new int[m] instanceof int[] sr && new int[7] instanceof int[] S
            && (IntStream.range(0, m).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer p
                && Integer.valueOf(pk[p] / 3001) instanceof Integer x && Integer.valueOf(pk[p] % 3001) instanceof Integer y
                && Integer.valueOf(Math.min(la[p], ta[p])) instanceof Integer lv
                && (S[0] = i == 0 || x - y != S[6] ? 0 : S[0]) >= 0 & (S[6] = x - y) != Integer.MIN_VALUE
                && (S[0] -= S[0] > 0 && sr[S[0] - 1] + sx[S[0] - 1] < x
                    ? (int) IntStream.rangeClosed(1, S[0]).takeWhile(j -> sr[S[0] - j] + sx[S[0] - j] < x).count() : 0) >= 0
                && (S[0] > 0 && x - lv <= sx[S[0] - 1] && Integer.valueOf(sx[S[0] - 1]) instanceof Integer x1 && Integer.valueOf(x1 - x + y) instanceof Integer y1
                    && pa[idm[x * 3001 + y] - 1] - pa[idm[x1 * 3001 + y] - 1] - pa[idm[x * 3001 + y1] - 1] + pa[idm[x1 * 3001 + y1] - 1] == (x - x1) * (y - y1)
                    ? (S[1] = 1) > 0 & (S[2] = x1) >= 0 & (S[3] = y1) >= 0 & (S[4] = x) >= 0 & (S[5] = y) >= 0 & false : true)
                && (S[0] -= S[0] > 0 && x - lv <= sx[S[0] - 1] ? 1 : 0) >= 0
                && (sx[S[0]] = x) >= 0 & (sr[S[0]] = Math.min(ra[p], ba[p])) >= -1 & ++S[0] > 0) || true)
            ? S[1] == 1
                ? IntStream.range(0, n).filter(r -> t[1 + 4 * r] >= S[2] && t[1 + 4 * r] < S[4] && t[2 + 4 * r] >= S[3] && t[2 + 4 * r] < S[5]).toArray() instanceof int[] ids
                    ? "YES " + ids.length + "\n" + Arrays.stream(ids).mapToObj(r -> String.valueOf(r + 1)).collect(Collectors.joining(" ")) : ""
                : "NO"
            : "");
    }
}
