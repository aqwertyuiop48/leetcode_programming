import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer t && Integer.valueOf(tok[2]) instanceof Integer q
            && IntStream.range(0, n).mapToDouble(i -> tok[3 + i]).toArray() instanceof double[] P && IntStream.range(0, n).mapToDouble(i -> tok[3 + n + i]).toArray() instanceof double[] L
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, n - 1)) * 2) instanceof Integer N
            && new double[n] instanceof double[] X && new double[n] instanceof double[] val && new double[8 * N] instanceof double[] tr && new double[1] instanceof double[] tot && new int[1] instanceof int[] used
            && IntStream.range(0, N).filter(i -> (tr[4 * (N + i)] = i < n ? P[i] / (L[i] + 1) : -2) > -3 & (tr[4 * (N + i) + 1] = i) >= 0 & (tr[4 * (N + i) + 2] = Double.POSITIVE_INFINITY) > 0 & (tr[4 * (N + i) + 3] = i) >= 0).count() >= 0
            && ((IntPredicate) p -> (tr[8 * p] >= tr[8 * p + 4] ? (tr[4 * p] = tr[8 * p]) + (tr[4 * p + 1] = tr[8 * p + 1]) : (tr[4 * p] = tr[8 * p + 4]) + (tr[4 * p + 1] = tr[8 * p + 5])) > -9e99
                & (tr[8 * p + 2] <= tr[8 * p + 6] ? (tr[4 * p + 2] = tr[8 * p + 2]) + (tr[4 * p + 3] = tr[8 * p + 3]) : (tr[4 * p + 2] = tr[8 * p + 6]) + (tr[4 * p + 3] = tr[8 * p + 7])) > -9e99) instanceof IntPredicate pull
            && IntStream.iterate(N - 1, p -> p >= 1, p -> p - 1).filter(pull).count() >= 0
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] up && (up[0] = p -> p >= 1 && pull.test(p) ? up[0].applyAsInt(p >> 1) : 0) != null
            && ((ToIntFunction<double[]>) c -> Integer.valueOf((int) c[0]) instanceof Integer i
                && (tot[0] -= val[i]) == tot[0] && (L[i] = c[1]) == c[1] && (X[i] = c[2]) == c[2]
                && (val[i] = P[i] * X[i] / (X[i] + L[i])) == val[i] && (tr[4 * (N + i)] = X[i] < L[i] ? P[i] * L[i] / ((X[i] + L[i]) * (X[i] + L[i] + 1)) : -1.0) == tr[4 * (N + i)]
                && (tr[4 * (N + i) + 2] = X[i] > 0 ? P[i] * L[i] / ((X[i] + L[i] - 1) * (X[i] + L[i])) : Double.POSITIVE_INFINITY) == tr[4 * (N + i) + 2]
                && (tot[0] += val[i]) == tot[0] && up[0].applyAsInt((N + i) >> 1) >= 0 ? 1 : 0) instanceof ToIntFunction<double[]> refresh
            && ((IntSupplier) () -> used[0] < t && tr[4] > 0 && Integer.valueOf((int) tr[5]) instanceof Integer a && refresh.applyAsInt(new double[]{a, L[a], X[a] + 1}) >= 0 && ++used[0] > 0 ? 1 : 0) instanceof IntSupplier fill
            && IntStream.generate(fill).takeWhile(v -> v > 0).count() >= 0
            && ((IntSupplier) () -> tr[4] > tr[6] && Integer.valueOf((int) tr[5]) instanceof Integer A && Integer.valueOf((int) tr[7]) instanceof Integer R
                && refresh.applyAsInt(new double[]{R, L[R], X[R] - 1}) >= 0 && refresh.applyAsInt(new double[]{A, L[A], X[A] + 1}) >= 0 ? 1 : 0) instanceof IntSupplier move
            && new IntSupplier[2] instanceof IntSupplier[] lp && (lp[0] = () -> fill.getAsInt() > 0 ? lp[0].getAsInt() : 0) != null && (lp[1] = () -> move.getAsInt() > 0 ? lp[1].getAsInt() : 0) != null
            ? IntStream.range(0, q).mapToObj(qi -> Integer.valueOf(tok[3 + 2 * n + 2 * qi]) instanceof Integer ty && Integer.valueOf(tok[4 + 2 * n + 2 * qi] - 1) instanceof Integer i
                && Integer.valueOf(ty == 2 && X[i] >= L[i] ? 1 : 0) instanceof Integer dec && (used[0] -= dec) > -1 && refresh.applyAsInt(new double[]{i, L[i] + (ty == 1 ? 1 : -1), X[i] - dec}) >= 0
                && lp[0].getAsInt() >= 0 && lp[1].getAsInt() >= 0
                    ? Math.round(tot[0] * 1e9) / 1000000000L + "." + String.valueOf(1000000000L + Math.round(tot[0] * 1e9) % 1000000000L).substring(1) : "").collect(Collectors.joining("\n")) : "");
    }
}
