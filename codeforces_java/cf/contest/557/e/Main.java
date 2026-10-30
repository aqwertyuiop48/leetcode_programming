import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && tk.nextToken().getBytes() instanceof byte[] s && (Integer) s.length instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && new int[n + 1][] instanceof int[][] p && (p[0] = new int[n + 1]) != null && new int[n] instanceof int[] tot && Arrays.asList(IntStream.range(0, n).toArray(), new int[n], new int[n]) instanceof List<int[]> bufs && new int[]{n, 0, k, 0, 0, 0, 0} instanceof int[] st && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, n).allMatch(r -> (p[r + 1] = new int[n - r]) instanceof int[] nr && p[r] instanceof int[] cr && p[Math.max(r - 3, 0)] instanceof int[] h3 && p[Math.max(r - 4, 0)] instanceof int[] h4
                && IntStream.range(0, n - r).filter(i -> (nr[i] = cr[i] + (s[i] == s[i + r] && (r < 4 || h3[i + 2] > h4[i + 2]) ? 1 : 0)) >= 0).count() >= 0)
            && IntStream.range(0, n).allMatch(i -> (tot[i] = p[n - i][i]) >= 0)
            && IntStream.iterate(0, x -> x + 1).anyMatch(x -> (Integer) st[1] instanceof Integer len && bufs.get(0) instanceof int[] cur && bufs.get(1) instanceof int[] a && bufs.get(2) instanceof int[] b
                && p[len] instanceof int[] pl && p[Math.max(len - 1, 0)] instanceof int[] pm && (st[3] = 0) == 0 && (st[4] = 0) == 0 && (st[5] = 0) == 0 && (st[6] = 0) == 0
                && IntStream.range(0, st[0]).map(y -> cur[y]).filter(i -> (len == 0 || (st[5] += pl[i] - pm[i]) >= 0) && i + len < n
                    && (s[i + len] == 'a' ? (a[st[3]++] = i) >= 0 && (st[6] += tot[i] - pl[i]) >= 0 : (b[st[4]++] = i) >= 0)).count() >= 0
                && (st[2] <= st[5] || (st[2] -= st[5]) > 0 && (st[2] <= st[6] ? bufs.set(1, bufs.set(0, bufs.get(1))) != null && (st[0] = st[3]) >= 0 && sb.append('a') != null
                    : (st[2] -= st[6]) > 0 && bufs.set(2, bufs.set(0, bufs.get(2))) != null && (st[0] = st[4]) >= 0 && sb.append('b') != null) && st[1]++ >= 0 && false))
            ? sb.toString() : "");
    }
}
