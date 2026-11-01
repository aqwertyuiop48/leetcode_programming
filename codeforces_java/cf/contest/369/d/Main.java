import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer k
            && new int[n + 2] instanceof int[] p && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = Integer.parseInt(tk[1 + i])) >= 0)
            && new int[n + 3] instanceof int[] sm && IntStream.iterate(n, i -> i >= 1, i -> i - 1).allMatch(i -> (sm[i] = Math.max(sm[i + 1], p[i])) >= 0)
            && Integer.valueOf(n + 2) instanceof Integer W && new boolean[W * W] instanceof boolean[] vis
            && Integer.valueOf(W * W / 2 + 2 * W + 8) instanceof Integer Q && new short[Q] instanceof short[] qa && new short[Q] instanceof short[] qb && new short[Q] instanceof short[] qd
            && new int[]{1} instanceof int[] tail && (qa[0] = 1) > 0 && (qb[0] = 2) > 0 && (qd[0] = 1) > 0 && (vis[W + 2] = true)
            && ((IntBinaryOperator) (t, nd) -> vis[t] || ((vis[t] = true) & (qa[tail[0]] = (short) (t / W)) >= 0 & (qb[tail[0]] = (short) (t % W)) >= 0 & (qd[tail[0]++] = (short) nd) >= 0) ? 0 : 0) instanceof IntBinaryOperator push
            && IntStream.iterate(0, i -> i < tail[0], i -> i + 1).allMatch(i -> qb[i] > n || qd[i] > k
                || (sm[qb[i]] > 0 && p[qa[i]] > 0 ? push.applyAsInt(Math.min(qb[i] + 1, n + 1) * W + Math.min(qb[i] + 2, n + 1), qd[i] + 1) : 0)
                    + (sm[qb[i]] > 0 && p[qa[i]] < 100 ? push.applyAsInt(qb[i] * W + qb[i] + 1, qd[i] + 1) : 0)
                    + (sm[qb[i]] < 100 && p[qa[i]] > 0 ? push.applyAsInt(qa[i] * W + qb[i] + 1, qd[i] + 1) : 0) >= 0)
            ? tail[0] : "");
    }
}

