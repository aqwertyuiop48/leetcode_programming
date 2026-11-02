import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] nm && new int[3] instanceof int[] sx
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (sx[0] = sx[0] * 10 + raw[i] - 48) < 0 | (sx[2] = 1) < 0
                : sx[2] == 0 || ((nm[sx[1]++] = sx[0]) < 0 | (sx[0] = 0) < 0 | (sx[2] = 0) < 0)).count() >= 0
            && Integer.valueOf(nm[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] start
            && IntStream.range(0, 2 * (n - 1)).filter(i -> ++start[nm[i + 1]] < 0).count() == 0
            && IntStream.rangeClosed(1, n).filter(i -> (start[i] += start[i - 1]) < 0).count() == 0
            && new int[2 * n + 2] instanceof int[] adj && start.clone() instanceof int[] pos
            && IntStream.range(0, n - 1).filter(i -> (adj[--pos[nm[2 * i + 1]]] = nm[2 * i + 2] - 1) + (adj[--pos[nm[2 * i + 2]]] = nm[2 * i + 1] - 1) < -5).count() == 0
            && new int[n] instanceof int[] par && new int[n] instanceof int[] q && new int[1] instanceof int[] qt
            && new int[n] instanceof int[] sz && new int[n] instanceof int[] mx && new int[n] instanceof int[] cen && new int[n] instanceof int[] top
            && new int[n] instanceof int[] rank && new boolean[n] instanceof boolean[] rem && new int[1] instanceof int[] cnt && new int[n] instanceof int[] ps && new int[n] instanceof int[] bp && new char[2 * n] instanceof char[] out
            && (par[0] = -1) < 0
            && IntStream.range(0, n).filter(i -> IntStream.range(start[q[i]], start[q[i] + 1]).filter(j -> adj[j] != par[q[i]] && (par[adj[j]] = q[i]) >= 0 && (q[++qt[0]] = adj[j]) >= 0).count() < 0).count() == 0
            && IntStream.range(0, n).filter(i -> (ps[q[i]] = i) < 0).count() == 0
            && IntStream.range(0, n).filter(i -> (bp[i] = par[q[i]] < 0 ? -1 : ps[par[q[i]]]) < -5).count() == 0
            && IntStream.range(0, 20).allMatch(L -> cnt[0] == n
                || IntStream.range(0, n).filter(i -> ((sz[i] = 1) + (mx[i] = 0) + (cen[i] = -1) + (top[i] = rem[i] ? -1 : (bp[i] >= 0 && !rem[bp[i]]) ? top[bp[i]] : i)) < -100).count() == 0
                && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).filter(i -> !rem[i] && bp[i] >= 0 && !rem[bp[i]] && ((sz[bp[i]] += sz[i]) < 0 | (mx[bp[i]] = Math.max(mx[bp[i]], sz[i])) < 0)).count() == 0
                && IntStream.range(0, n).filter(i -> !rem[i] && 2 * mx[i] <= sz[top[i]] && 2 * (sz[top[i]] - sz[i]) <= sz[top[i]] && cen[top[i]] < 0 && (cen[top[i]] = i) >= 0 && (rank[i] = L) >= 0 && (rem[i] = true) && ++cnt[0] < 0).count() == 0)
            && IntStream.range(0, n).filter(i -> (out[2 * i] = (char) ('A' + rank[ps[i]])) < 0 | (out[2 * i + 1] = (char) 32) < 0).count() == 0
            ? String.valueOf(out, 0, 2 * n - 1) : "");
    }
}
