import java.util.*;
import java.io.*;

public class Main {
    static int code(String s, int from, int len) {
        int c = 0;
        for (int i = 0; i < len; i++) c = c * 27 + (s.charAt(from + i) - 'a' + 1);
        return c;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        String s = br.readLine().trim();
        int n = s.length();
        int q = Integer.parseInt(br.readLine().trim());
        final int SZ = 27 * 27 * 27 * 27;
        int[] cnt = new int[SZ + 1];
        for (int i = 0; i < n; i++)
            for (int l = 1; l <= 4 && i + l <= n; l++) cnt[code(s, i, l) + 1]++;
        int[] startIdx = new int[SZ + 1];
        for (int i = 0; i < SZ; i++) startIdx[i + 1] = startIdx[i] + cnt[i + 1];
        int[] occ = new int[startIdx[SZ]];
        int[] fill = new int[SZ];
        for (int i = 0; i < n; i++)
            for (int l = 1; l <= 4 && i + l <= n; l++) {
                int c = code(s, i, l);
                occ[startIdx[c] + fill[c]++] = i;
            }
        int[] qa = new int[q], qb = new int[q], la = new int[q], lb = new int[q];
        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken(), b = st.nextToken();
            qa[i] = code(a, 0, a.length()); la[i] = a.length();
            qb[i] = code(b, 0, b.length()); lb[i] = b.length();
        }
        final int T = 700;
        int[] cd = new int[4 * n];
        for (int i = 0; i < n; i++) for (int l = 1; l <= 4 && i + l <= n; l++) cd[i * 4 + l - 1] = code(s, i, l);
        int[] ans = new int[q];
        // heavy queries grouped by heavy code
        HashMap<Integer, ArrayList<Integer>> heavy = new HashMap<>();
        HashMap<Long, Integer> memo = new HashMap<>();
        for (int i = 0; i < q; i++) {
            int ca = qa[i], cb = qb[i];
            int na = startIdx[ca + 1] - startIdx[ca], nb = startIdx[cb + 1] - startIdx[cb];
            if (na == 0 || nb == 0) { ans[i] = -1; continue; }
            if (na > T || nb > T) {
                int h = na >= nb ? ca : cb;
                heavy.computeIfAbsent(h, k -> new ArrayList<>()).add(i);
            } else {
                long key = (long) ca * SZ + cb;
                Integer m = memo.get(key);
                if (m != null) { ans[i] = m; continue; }
                int best = Integer.MAX_VALUE;
                int sa = startIdx[ca], ea = startIdx[ca + 1], sb = startIdx[cb], eb = startIdx[cb + 1];
                int j = sb;
                for (int x = sa; x < ea; x++) {
                    int p = occ[x];
                    while (j < eb && occ[j] < p) j++;
                    if (j < eb) {
                        int qq = occ[j];
                        best = Math.min(best, Math.max(p + la[i], qq + lb[i]) - p);
                    }
                    if (j > sb) {
                        int qq = occ[j - 1];
                        best = Math.min(best, Math.max(p + la[i], qq + lb[i]) - qq);
                    }
                }
                memo.put(key, best);
                ans[i] = best;
            }
        }
        // process heavy
        int[] best = new int[SZ];
        Arrays.fill(best, Integer.MAX_VALUE);
        int[] nextOcc = new int[n + 1];
        int[] prevOcc = new int[n + 1];
        for (Map.Entry<Integer, ArrayList<Integer>> en : heavy.entrySet()) {
            int h = en.getKey();
            // determine length of h from first query
            int idx0 = en.getValue().get(0);
            int lh = (qa[idx0] == h) ? la[idx0] : lb[idx0];
            // nearest occurrence start >= i, <= i
            int sh = startIdx[h], eh = startIdx[h + 1];
            int ptr = eh - 1;
            Arrays.fill(nextOcc, -1);
            Arrays.fill(prevOcc, -1);
            for (int x = sh; x < eh; x++) { prevOcc[occ[x]] = occ[x]; nextOcc[occ[x]] = occ[x]; }
            for (int i = n - 1; i >= 0; i--) if (nextOcc[i] < 0 && i + 1 <= n) nextOcc[i] = nextOcc[i + 1];
            for (int i = 1; i < n; i++) if (prevOcc[i] < 0) prevOcc[i] = prevOcc[i - 1];
            for (int i = 0; i < n; i++) {
                int nx = nextOcc[i], pv = prevOcc[i];
                for (int l = 1; l <= 4 && i + l <= n; l++) {
                    int c = cd[i * 4 + l - 1];
                    int b = best[c];
                    if (nx >= 0) b = Math.min(b, Math.max(i + l, nx + lh) - i);
                    if (pv >= 0) b = Math.min(b, Math.max(i + l, pv + lh) - pv);
                    best[c] = b;
                }
            }
            for (int qi : en.getValue()) {
                int other = (qa[qi] == h) ? qb[qi] : qa[qi];
                ans[qi] = best[other];
            }
            for (int i = 0; i < n; i++) for (int l = 1; l <= 4 && i + l <= n; l++) best[cd[i * 4 + l - 1]] = Integer.MAX_VALUE;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) sb.append(ans[i]).append('\n');
        System.out.print(sb);
    }
}
