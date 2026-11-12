import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni
            && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m && Integer.valueOf(ni.getAsInt()) instanceof Integer q
            && new int[q + 1] instanceof int[] tp && new int[q + 1] instanceof int[] ai && new int[q + 1] instanceof int[] aj
            && new int[q + 1] instanceof int[] nx && new int[q + 1] instanceof int[] it && new int[q + 1] instanceof int[] ch && new int[q + 1] instanceof int[] ans && new int[q + 2] instanceof int[] stk
            && new int[(n + 1) * (m + 1)] instanceof int[] gi && new int[n + 1] instanceof int[] inv && new int[n + 1] instanceof int[] cnt && new int[2] instanceof int[] tot
            && IntStream.range(0, q + 1).map(i -> (it[i] = -1) * 0).sum() == 0
            && IntStream.rangeClosed(1, q).map(c -> (tp[c] = ni.getAsInt()) * 0 + (ai[c] = ni.getAsInt()) * 0 + (tp[c] == 4 ? 0 : tp[c] == 3 ? 0 : (aj[c] = ni.getAsInt()) * 0)
                + (Integer.valueOf(tp[c] == 4 ? ai[c] : c - 1) instanceof Integer par ? (nx[c] = it[par]) * 0 + (it[par] = c) * 0 : 0)).sum() == 0
            && ((IntUnaryOperator) c -> tp[c] == 3 ? (tot[0] += m - 2 * cnt[ai[c]]) + (cnt[ai[c]] = m - cnt[ai[c]]) + (inv[ai[c]] ^= 1)
                : tp[c] == 1 ? ((gi[ai[c] * (m + 1) + aj[c]] ^ inv[ai[c]]) == 0 ? (gi[ai[c] * (m + 1) + aj[c]] ^= 1) + (ch[c] = 1) + cnt[ai[c]]++ + tot[0]++ : 0)
                : tp[c] == 2 ? ((gi[ai[c] * (m + 1) + aj[c]] ^ inv[ai[c]]) == 1 ? (gi[ai[c] * (m + 1) + aj[c]] ^= 1) + (ch[c] = 1) + cnt[ai[c]]-- + tot[0]-- : 0) : 0) instanceof IntUnaryOperator ap
            && ((IntUnaryOperator) c -> tp[c] == 3 ? (tot[0] += m - 2 * cnt[ai[c]]) + (cnt[ai[c]] = m - cnt[ai[c]]) + (inv[ai[c]] ^= 1)
                : ch[c] == 1 ? (gi[ai[c] * (m + 1) + aj[c]] ^= 1) + (tp[c] == 1 ? cnt[ai[c]]-- + tot[0]-- : cnt[ai[c]]++ + tot[0]++) : 0) instanceof IntUnaryOperator un
            && IntStream.range(0, 2 * q + 1).filter(step -> Integer.valueOf(stk[tot[1]]) instanceof Integer v && Integer.valueOf(it[v]) instanceof Integer c
                ? c >= 0 ? (it[v] = nx[c]) + ap.applyAsInt(c) + (ans[c] = tot[0]) + (stk[++tot[1]] = c) < 0 : un.applyAsInt(v) + (tot[1]--) < 0
                : false).count() >= 0
            ? IntStream.rangeClosed(1, q).mapToObj(i -> String.valueOf(ans[i])).collect(Collectors.joining("\n")) : "");
    }
}
