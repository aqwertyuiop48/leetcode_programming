import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && Integer.valueOf(t.nextToken()) instanceof Integer n && Long.valueOf(t.nextToken()) instanceof Long X && Long.valueOf(t.nextToken()) instanceof Long Y && Long.valueOf(t.nextToken()) instanceof Long m
            && Double.valueOf(X / 1000.0) instanceof Double px && Double.valueOf(Y / 1000.0) instanceof Double py
            && new double[n] instanceof double[] Ad && new double[n] instanceof double[] Bd && new double[n] instanceof double[] H && new double[n] instanceof double[] FX && new double[n] instanceof double[] FY && new double[n] instanceof double[] UX && new double[n] instanceof double[] UY
            && IntStream.range(0, n).filter(i -> Long.valueOf(t.nextToken()) instanceof Long a && Long.valueOf(t.nextToken()) instanceof Long b && (Ad[i] = a) != 0.5 && (Bd[i] = b) != 0.5
                && Double.valueOf((a * X + 1000 * (b - Y)) / 1e6) instanceof Double c && Double.valueOf((a * a + 1000000) / 1e6) instanceof Double s && Double.valueOf(Math.sqrt(s)) instanceof Double sq
                && (H[i] = Math.abs(c) / sq) >= 0 && (FX[i] = -(a / 1000.0) * c / s) != 0.5 && (FY[i] = c / s) != 0.5 && (UX[i] = 1 / sq) > 0 && (UY[i] = (a / 1000.0) / sq) != 0.5).count() >= 0
            && new int[n] instanceof int[] lineOf && new double[n] instanceof double[] TT && new double[2 * n] instanceof double[] PX && new double[2 * n] instanceof double[] PY && new int[2 * n] instanceof int[] QD && new double[2 * n] instanceof double[] XR && new double[2 * n] instanceof double[] YR
            && new long[2 * n] instanceof long[] K && new long[2 * n] instanceof long[] K2 && new int[2 * n] instanceof int[] I1 && new int[2 * n] instanceof int[] I2 && new int[2049] instanceof int[] cnt0 && new int[2 * n] instanceof int[] rank && new int[2 * n] instanceof int[] who && new int[n] instanceof int[] loP && new int[n] instanceof int[] hiP && new int[n] instanceof int[] AA && new long[][]{K, K2} instanceof long[][] KK && new int[][]{I1, I2} instanceof int[][] II && new int[n] instanceof int[] kOf && new double[n] instanceof double[] Ak && new double[n] instanceof double[] Bk && new int[2] instanceof int[] cs && new long[2] instanceof long[] sw
            && ((DoubleToLongFunction) d -> (cs[0] = 0) == 0 && IntStream.range(0, n).filter(i -> H[i] < d && (lineOf[cs[0]++] = i) >= 0).count() >= 0 && Integer.valueOf(cs[0]) instanceof Integer c
                && IntStream.range(0, c).filter(j -> (TT[j] = Math.sqrt((d - H[lineOf[j]]) * (d + H[lineOf[j]]))) >= 0).count() >= 0
                && IntStream.range(0, c).filter(j -> (PX[2 * j] = FX[lineOf[j]] + TT[j] * UX[lineOf[j]]) != 0.5 & (PY[2 * j] = FY[lineOf[j]] + TT[j] * UY[lineOf[j]]) != 0.5 & (PX[2 * j + 1] = FX[lineOf[j]] - TT[j] * UX[lineOf[j]]) != 0.5 & (PY[2 * j + 1] = FY[lineOf[j]] - TT[j] * UY[lineOf[j]]) != 0.5).count() >= 0
                && IntStream.range(0, 2 * c).filter(e -> (QD[e] = PX[e] > 0 && PY[e] >= 0 ? 0 : PX[e] <= 0 && PY[e] > 0 ? 1 : PX[e] < 0 && PY[e] <= 0 ? 2 : 3) >= 0
                    & (XR[e] = 0.0 + (QD[e] == 0 ? PX[e] : QD[e] == 1 ? PY[e] : QD[e] == 2 ? -PX[e] : -PY[e])) != 0.5 & (YR[e] = 0.0 + (QD[e] == 0 ? PY[e] : QD[e] == 1 ? -PX[e] : QD[e] == 2 ? -PY[e] : PX[e])) != 0.5
                    & (I1[e] = e) >= 0 & (K[e] = ((long) (2 * QD[e] + (YR[e] < XR[e] ? 0 : 1)) << 60) | ((YR[e] < XR[e] ? Double.doubleToLongBits(YR[e] / XR[e]) : 4607182418800017408L - Double.doubleToLongBits(XR[e] / YR[e])) >> 2)) != 1).count() >= 0
                && IntStream.range(0, 6).filter(p -> (KK[p & 1] instanceof long[] sK) && (KK[(p & 1) ^ 1] instanceof long[] dK) && (II[p & 1] instanceof int[] sI) && (II[(p & 1) ^ 1] instanceof int[] dI) && Integer.valueOf(11 * p) instanceof Integer sh
                    && IntStream.range(0, 2049).filter(i -> (cnt0[i] = 0) == 0).count() >= 0
                    && IntStream.range(0, 2 * c).filter(e -> ++cnt0[(int) ((sK[e] >>> sh) & 2047) + 1] > 0).count() >= 0
                    && IntStream.range(1, 2049).filter(i -> (cnt0[i] += cnt0[i - 1]) >= 0).count() >= 0
                    && IntStream.range(0, 2 * c).filter(e -> (dK[cnt0[(int) ((sK[e] >>> sh) & 2047)]] = sK[e]) != 1 & (dI[cnt0[(int) ((sK[e] >>> sh) & 2047)]++] = sI[e]) >= 0).count() >= 0).count() >= 0
                && IntStream.range(0, 2 * c).filter(pos -> (rank[I1[pos]] = pos) >= 0 & (who[pos] = I1[pos] >> 1) >= 0).count() >= 0
                && IntStream.range(0, c).filter(j -> (loP[j] = Math.min(rank[2 * j], rank[2 * j + 1])) >= 0 & (hiP[j] = Math.max(rank[2 * j], rank[2 * j + 1])) >= 0).count() >= 0
                && (sw[0] = 0) == 0 && (sw[1] = 0) == 0 && (cs[1] = 0) == 0
                && IntStream.range(0, 2 * c).filter(pos -> Integer.valueOf(who[pos]) instanceof Integer w && (loP[w] == pos ? (sw[0] += sw[1]) >= 0 & (kOf[w] = cs[1]) >= 0 & (AA[cs[1]++] = hiP[w]) >= 0 : ++sw[1] > 0)).count() >= 0
                && Long.valueOf(IntStream.range(0, 32 - Integer.numberOfLeadingZeros(2 * c)).mapToLong(b -> new int[(2 * c >> (b + 1)) + 1] instanceof int[] ones ? IntStream.range(0, c).mapToLong(e -> ((AA[e] >> b) & 1) == 1 ? 0L * ones[AA[e] >> (b + 1)]++ : ones[AA[e] >> (b + 1)]).sum() : 0L).sum()) instanceof Long inv
                ? (long) c * (c - 1) / 2 - sw[0] - inv : 0L) instanceof DoubleToLongFunction count
            && new double[]{1e-18, 4e9} instanceof double[] bs
            && IntStream.range(0, 100).takeWhile(it -> bs[1] - bs[0] > 1e-7 * bs[0]).filter(it -> (bs[count.applyAsLong(Math.sqrt(bs[0] * bs[1])) < m ? 0 : 1] = Math.sqrt(bs[0] * bs[1])) >= 0).count() >= 0
            && (bs[0] > 1e-18 || (bs[0] = 0) == 0) && Long.valueOf(count.applyAsLong(bs[0])) instanceof Long cnt && new int[n] instanceof int[] nxt && new int[n] instanceof int[] prv && new int[]{-1} instanceof int[] tl
            && IntStream.range(0, cs[0]).filter(w -> (Ak[kOf[w]] = Ad[lineOf[w]]) != 0.5 & (Bk[kOf[w]] = Bd[lineOf[w]]) != 0.5).count() >= 0
            && new double[2] instanceof double[] cw && new IntToDoubleFunction[1] instanceof IntToDoubleFunction[] rec
            && ((DoubleUnaryOperator) xx -> Math.sqrt((xx - px) * (xx - px) + ((cw[0] * xx + cw[1]) / 1000.0 - py) * ((cw[0] * xx + cw[1]) / 1000.0 - py))) instanceof DoubleUnaryOperator dist
            && (rec[0] = x -> x < 0 ? 0.0 : dist.applyAsDouble((Bk[x] - cw[1]) / (cw[0] - Ak[x])) + rec[0].applyAsDouble(nxt[x])) != null
            && CompletableFuture.supplyAsync(() -> IntStream.range(0, 2 * cs[0]).mapToDouble(pos -> Integer.valueOf(kOf[who[pos]]) instanceof Integer w
                ? (loP[who[pos]] == pos ? 0.0 * ((prv[w] = tl[0]) + (nxt[w] = -1) + (tl[0] >= 0 ? nxt[tl[0]] = w : 0) + (tl[0] = w))
                    : 0.0 * ((cw[0] = Ak[w]) + (cw[1] = Bk[w])) + rec[0].applyAsDouble(nxt[w])
                    + 0.0 * ((prv[w] >= 0 ? nxt[prv[w]] = nxt[w] : 0) + (nxt[w] >= 0 ? prv[nxt[w]] = prv[w] : (tl[0] = prv[w])))) : 0.0).sum(), r -> new Thread(null, r, "t", 1L << 29).start()).join() instanceof Double inside
            ? String.format(Locale.ROOT, "%.9f", inside + (m - cnt) * bs[1]) : "");
    }
}
