import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf((it.nextInt() - 1) * n + it.nextInt() - 1) instanceof Integer s0
            && IntStream.range(0, n * n).map(i -> it.nextInt()).toArray() instanceof int[] g
            && new int[n] instanceof int[] mnR && new int[n] instanceof int[] mxR && new int[n] instanceof int[] mnC && new int[n] instanceof int[] mxC
            && IntStream.range(0, n).allMatch(i -> (mnR[i] = n) > 0 & (mnC[i] = n) > 0 & (mxR[i] = -1) < 0 & (mxC[i] = -1) < 0)
            && IntStream.range(0, n * n).filter(i -> g[i] == 1).allMatch(i -> (mnR[i / n] = Math.min(mnR[i / n], i % n)) >= 0 & (mxR[i / n] = Math.max(mxR[i / n], i % n)) >= 0
                & (mnC[i % n] = Math.min(mnC[i % n], i / n)) >= 0 & (mxC[i % n] = Math.max(mxC[i % n], i / n)) >= 0)
            && new int[]{-1, 1, 0, 0} instanceof int[] dr && new int[]{0, 0, -1, 1} instanceof int[] dc && "UDLR" instanceof String CH
            && new boolean[n * n] instanceof boolean[] vis && new int[n * n] instanceof int[] ptr && new int[n * n] instanceof int[] pd && new int[n * n + 1] instanceof int[] st && new int[]{1} instanceof int[] sp
            && new StringBuilder(g[s0] == 0 ? "1" : "") instanceof StringBuilder sb1 && new StringBuilder() instanceof StringBuilder sb2
            && (st[0] = s0) >= 0 && (vis[s0] = true) && (mnR[s0 / n] = Math.min(mnR[s0 / n], s0 % n)) >= 0 & (mxR[s0 / n] = Math.max(mxR[s0 / n], s0 % n)) >= 0
                & (mnC[s0 % n] = Math.min(mnC[s0 % n], s0 / n)) >= 0 & (mxC[s0 % n] = Math.max(mxC[s0 % n], s0 / n)) >= 0
            && IntStream.iterate(0, z -> sp[0] > 0, z -> z + 1).allMatch(z -> Integer.valueOf(st[sp[0] - 1]) instanceof Integer c && Integer.valueOf(c / n) instanceof Integer r && Integer.valueOf(c % n) instanceof Integer q
                && (ptr[c] < 4
                    ? (Integer.valueOf(ptr[c]++) instanceof Integer d && Integer.valueOf(r + dr[d]) instanceof Integer nr && Integer.valueOf(q + dc[d]) instanceof Integer nc
                        && nr >= 0 && nr < n && nc >= 0 && nc < n && !vis[nr * n + nc] && (d == 0 ? mnC[q] < r : d == 1 ? mxC[q] > r : d == 2 ? mnR[r] < q : mxR[r] > q)
                        && (vis[nr * n + nc] = true) && (mnR[nr] = Math.min(mnR[nr], nc)) >= 0 & (mxR[nr] = Math.max(mxR[nr], nc)) >= 0
                        & (mnC[nc] = Math.min(mnC[nc], nr)) >= 0 & (mxC[nc] = Math.max(mxC[nc], nr)) >= 0
                        && sb1.append(CH.charAt(d)).append(g[nr * n + nc] == 0 ? "1" : "") != null && sb2.append(CH.charAt(d)) != null
                        && (st[sp[0]++] = nr * n + nc) >= 0 && (pd[nr * n + nc] = d) >= 0) || true
                    : sp[0]-- > 0 && (sp[0] > 0 ? sb1.append(CH.charAt(pd[c] ^ 1)) != null && sb2.append('2').append(CH.charAt(pd[c] ^ 1)) != null : sb2.append('2') != null)))
            ? IntStream.range(0, n * n).anyMatch(i -> g[i] == 1 && !vis[i]) ? "NO" : "YES\n" + sb1 + sb2 : "");
    }
}
