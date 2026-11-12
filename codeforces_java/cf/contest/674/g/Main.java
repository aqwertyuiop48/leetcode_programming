import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m && Integer.valueOf(100 / tok[2]) instanceof Integer K
            && new int[4 * n + 8] instanceof int[] nl && new int[4 * n + 8] instanceof int[] nr && new int[4 * n + 8] instanceof int[] lz
            && new int[(4 * n + 8) * 5] instanceof int[] I && new int[(4 * n + 8) * 5] instanceof int[] C && new int[10] instanceof int[] ar && new IntPredicate[4] instanceof IntPredicate[] f
            && new StringBuilder() instanceof StringBuilder sb && new int[]{3 + n} instanceof int[] pt
            && ((LongBinaryOperator) (d, v) ->
                (C[(int) d + 0] > 0 && I[(int) d + 0] == (int) (v >>> 20) ? (C[(int) d + 0] += (int) (v & 1048575)) > 0
                : C[(int) d + 1] > 0 && I[(int) d + 1] == (int) (v >>> 20) ? (C[(int) d + 1] += (int) (v & 1048575)) > 0
                : C[(int) d + 2] > 0 && I[(int) d + 2] == (int) (v >>> 20) ? (C[(int) d + 2] += (int) (v & 1048575)) > 0
                : C[(int) d + 3] > 0 && I[(int) d + 3] == (int) (v >>> 20) ? (C[(int) d + 3] += (int) (v & 1048575)) > 0
                : C[(int) d + 4] > 0 && I[(int) d + 4] == (int) (v >>> 20) ? (C[(int) d + 4] += (int) (v & 1048575)) > 0
                : C[(int) d + 0] == 0 ? (I[(int) d + 0] = (int) (v >>> 20)) >= 0 & (C[(int) d + 0] = (int) (v & 1048575)) > 0
                : C[(int) d + 1] == 0 ? (I[(int) d + 1] = (int) (v >>> 20)) >= 0 & (C[(int) d + 1] = (int) (v & 1048575)) > 0
                : C[(int) d + 2] == 0 ? (I[(int) d + 2] = (int) (v >>> 20)) >= 0 & (C[(int) d + 2] = (int) (v & 1048575)) > 0
                : C[(int) d + 3] == 0 ? (I[(int) d + 3] = (int) (v >>> 20)) >= 0 & (C[(int) d + 3] = (int) (v & 1048575)) > 0
                : C[(int) d + 4] == 0 ? (I[(int) d + 4] = (int) (v >>> 20)) >= 0 & (C[(int) d + 4] = (int) (v & 1048575)) > 0
                : (ar[4] = Math.min((int) (v & 1048575), Math.min(Math.min(Math.min(C[(int) d], C[(int) d + 1]), Math.min(C[(int) d + 2], C[(int) d + 3])), C[(int) d + 4]))) > 0 & (C[(int) d + 0] -= ar[4]) >= 0 & (C[(int) d + 1] -= ar[4]) >= 0 & (C[(int) d + 2] -= ar[4]) >= 0 & (C[(int) d + 3] -= ar[4]) >= 0 & (C[(int) d + 4] -= ar[4]) >= 0 & ((int) (v & 1048575) == ar[4] || (C[(int) d + 0] == 0 ? (I[(int) d + 0] = (int) (v >>> 20)) >= 0 & (C[(int) d + 0] = (int) (v & 1048575) - ar[4]) > 0 : C[(int) d + 1] == 0 ? (I[(int) d + 1] = (int) (v >>> 20)) >= 0 & (C[(int) d + 1] = (int) (v & 1048575) - ar[4]) > 0 : C[(int) d + 2] == 0 ? (I[(int) d + 2] = (int) (v >>> 20)) >= 0 & (C[(int) d + 2] = (int) (v & 1048575) - ar[4]) > 0 : C[(int) d + 3] == 0 ? (I[(int) d + 3] = (int) (v >>> 20)) >= 0 & (C[(int) d + 3] = (int) (v & 1048575) - ar[4]) > 0 : (I[(int) d + 4] = (int) (v >>> 20)) >= 0 & (C[(int) d + 4] = (int) (v & 1048575) - ar[4]) > 0))) ? 1 : 0) instanceof LongBinaryOperator ins
            && ((BooleanSupplier) () -> (C[ar[1] + 0] == 0 || ins.applyAsLong(ar[0], ((long) I[ar[1] + 0] << 20) | C[ar[1] + 0]) >= 0) & (C[ar[1] + 1] == 0 || ins.applyAsLong(ar[0], ((long) I[ar[1] + 1] << 20) | C[ar[1] + 1]) >= 0) & (C[ar[1] + 2] == 0 || ins.applyAsLong(ar[0], ((long) I[ar[1] + 2] << 20) | C[ar[1] + 2]) >= 0) & (C[ar[1] + 3] == 0 || ins.applyAsLong(ar[0], ((long) I[ar[1] + 3] << 20) | C[ar[1] + 3]) >= 0) & (C[ar[1] + 4] == 0 || ins.applyAsLong(ar[0], ((long) I[ar[1] + 4] << 20) | C[ar[1] + 4]) >= 0)) instanceof BooleanSupplier adds
            && ((BooleanSupplier) () -> (I[ar[0] + 0] = I[ar[1] + 0]) >= 0 & (C[ar[0] + 0] = C[ar[1] + 0]) >= 0 & (I[ar[0] + 1] = I[ar[1] + 1]) >= 0 & (C[ar[0] + 1] = C[ar[1] + 1]) >= 0 & (I[ar[0] + 2] = I[ar[1] + 2]) >= 0 & (C[ar[0] + 2] = C[ar[1] + 2]) >= 0 & (I[ar[0] + 3] = I[ar[1] + 3]) >= 0 & (C[ar[0] + 3] = C[ar[1] + 3]) >= 0 & (I[ar[0] + 4] = I[ar[1] + 4]) >= 0 & (C[ar[0] + 4] = C[ar[1] + 4]) >= 0) instanceof BooleanSupplier cpy
            && ((IntBinaryOperator) (nd, id) -> (lz[nd] = id) > 0 & (I[5 * nd] = id) > 0 & (C[5 * nd] = nr[nd] - nl[nd] + 1) > 0 & (C[5 * nd + 1] = 0) == 0 & (C[5 * nd + 2] = 0) == 0 & (C[5 * nd + 3] = 0) == 0 & (C[5 * nd + 4] = 0) == 0 ? 1 : 0) instanceof IntBinaryOperator ap
            && ((IntPredicate) nd -> lz[nd] == 0 || ap.applyAsInt(2 * nd, lz[nd]) + ap.applyAsInt(2 * nd + 1, lz[nd]) == 2 & (lz[nd] = 0) == 0) instanceof IntPredicate push
            && ((IntPredicate) nd -> (ar[0] = 5 * nd) > 0 & (ar[1] = 10 * nd) > 0 & cpy.getAsBoolean() & (ar[1] = 10 * nd + 5) > 0 & adds.getAsBoolean()) instanceof IntPredicate pull
            && (f[0] = nd -> nl[nd] == nr[nd] ? (I[5 * nd] = tok[3 + nl[nd]]) >= 0 & (C[5 * nd] = 1) > 0
                : (nl[2 * nd] = nl[nd]) >= 0 & (nr[2 * nd] = (nl[nd] + nr[nd]) / 2) >= 0 & (nl[2 * nd + 1] = (nl[nd] + nr[nd]) / 2 + 1) > 0 & (nr[2 * nd + 1] = nr[nd]) >= 0 & f[0].test(2 * nd) & f[0].test(2 * nd + 1) & pull.test(nd)) != null
            && (f[1] = nd -> nr[nd] < ar[5] || nl[nd] > ar[6] || (ar[5] <= nl[nd] && nr[nd] <= ar[6] ? ap.applyAsInt(nd, ar[7]) >= 0 : push.test(nd) & f[1].test(2 * nd) & f[1].test(2 * nd + 1) & pull.test(nd))) != null
            && (f[2] = nd -> nr[nd] < ar[5] || nl[nd] > ar[6] || (ar[5] <= nl[nd] && nr[nd] <= ar[6] ? (ar[0] = 0) == 0 & (ar[1] = 5 * nd) > 0 & adds.getAsBoolean() : push.test(nd) & f[2].test(2 * nd) & f[2].test(2 * nd + 1))) != null
            && (nl[1] = 0) == 0 && (nr[1] = n - 1) >= 0 && f[0].test(1)
            && IntStream.range(0, m).filter(qi -> tok[pt[0]] == 1
                ? (ar[5] = tok[pt[0] + 1] - 1) >= 0 & (ar[6] = tok[pt[0] + 2] - 1) >= 0 & (ar[7] = tok[pt[0] + 3]) > 0 & (pt[0] += 4) > 0 & f[1].test(1)
                : (ar[5] = tok[pt[0] + 1] - 1) >= 0 & (ar[6] = tok[pt[0] + 2] - 1) >= 0 & (pt[0] += 3) > 0
                    & (C[0] = 0) == 0 & (C[1] = 0) == 0 & (C[2] = 0) == 0 & (C[3] = 0) == 0 & (C[4] = 0) == 0 & f[2].test(1)
                    && Integer.valueOf(K >= 5 ? 0 : ((C[1] > C[0] || C[1] == C[0] && 1 < 0 ? 1 : 0) + (C[2] > C[0] || C[2] == C[0] && 2 < 0 ? 1 : 0) + (C[3] > C[0] || C[3] == C[0] && 3 < 0 ? 1 : 0) + (C[4] > C[0] || C[4] == C[0] && 4 < 0 ? 1 : 0)) == K ? C[0] : ((C[0] > C[1] || C[0] == C[1] && 0 < 1 ? 1 : 0) + (C[2] > C[1] || C[2] == C[1] && 2 < 1 ? 1 : 0) + (C[3] > C[1] || C[3] == C[1] && 3 < 1 ? 1 : 0) + (C[4] > C[1] || C[4] == C[1] && 4 < 1 ? 1 : 0)) == K ? C[1] : ((C[0] > C[2] || C[0] == C[2] && 0 < 2 ? 1 : 0) + (C[1] > C[2] || C[1] == C[2] && 1 < 2 ? 1 : 0) + (C[3] > C[2] || C[3] == C[2] && 3 < 2 ? 1 : 0) + (C[4] > C[2] || C[4] == C[2] && 4 < 2 ? 1 : 0)) == K ? C[2] : ((C[0] > C[3] || C[0] == C[3] && 0 < 3 ? 1 : 0) + (C[1] > C[3] || C[1] == C[3] && 1 < 3 ? 1 : 0) + (C[2] > C[3] || C[2] == C[3] && 2 < 3 ? 1 : 0) + (C[4] > C[3] || C[4] == C[3] && 4 < 3 ? 1 : 0)) == K ? C[3] : ((C[0] > C[4] || C[0] == C[4] && 0 < 4 ? 1 : 0) + (C[1] > C[4] || C[1] == C[4] && 1 < 4 ? 1 : 0) + (C[2] > C[4] || C[2] == C[4] && 2 < 4 ? 1 : 0) + (C[3] > C[4] || C[3] == C[4] && 3 < 4 ? 1 : 0)) == K ? C[4] : 0) instanceof Integer cut
                    && Integer.valueOf((C[0] > cut ? 1 : 0) + (C[1] > cut ? 1 : 0) + (C[2] > cut ? 1 : 0) + (C[3] > cut ? 1 : 0) + (C[4] > cut ? 1 : 0)) instanceof Integer kk
                    && sb.append(kk == 0 ? 1 : kk).append(C[0] > cut ? " " + I[0] : "").append(C[1] > cut ? " " + I[1] : "").append(C[2] > cut ? " " + I[2] : "").append(C[3] > cut ? " " + I[3] : "").append(C[4] > cut ? " " + I[4] : "").append(kk == 0 ? " " + I[0] : "").append((char) 10) != null).count() >= 0
            ? sb.toString().trim() : "");
    }
}
