import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer t && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer k
            && new int[t + 2] instanceof int[] a && Integer.valueOf(a[0] = 1) instanceof Integer one
            && IntStream.rangeClosed(1, t).filter(i -> (a[i] = Integer.parseInt(tk.nextToken())) < 0).count() >= 0
            && new int[t + 1] instanceof int[] p && IntStream.range(0, t).filter(i -> (p[i] = Math.min(a[i], a[i + 1])) < 0).count() >= 0
            && Long.valueOf(IntStream.range(1, t).mapToLong(i -> a[i] - p[i]).sum() + a[t] + (a[1] == 1 ? 1 : 0)) instanceof Long lo
            && Long.valueOf(IntStream.range(1, t).mapToLong(i -> a[i] - 1).sum() + a[t] + (a[1] == 1 ? 1 : 0)) instanceof Long hi
            && k >= lo && k <= hi
            && new long[]{k - lo} instanceof long[] ex
            && IntStream.range(1, t).filter(i -> Integer.valueOf((int) Math.min(ex[0], p[i] - 1)) instanceof Integer d && (p[i] -= d) < 0 | (ex[0] -= d) < 0).count() >= 0
            && new int[t + 2] instanceof int[] s && Integer.valueOf(s[0] = 1) instanceof Integer o2 && Integer.valueOf(s[1] = 2) instanceof Integer o3
            && IntStream.rangeClosed(1, t).filter(i -> (s[i + 1] = s[i] + a[i]) < 0).count() >= 0
            && new StringBuilder().append(n).append('\n') instanceof StringBuilder sb
            && IntStream.range(0, t).filter(i -> IntStream.range(0, a[i + 1]).filter(j -> sb.append(s[i] + (j < p[i] ? j : 0)).append(' ').append(s[i + 1] + j).append('\n') == null).count() < 0).count() >= 0
            ? sb : "-1");
    }
}
