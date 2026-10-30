import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t && (Integer) t[0] instanceof Integer n && new int[n + 1] instanceof int[] ps && IntStream.rangeClosed(1, n).map(i -> ps[t[n + i]] = i).sum() >= 0 && new int[n + 1] instanceof int[] d && IntStream.rangeClosed(1, n).map(i -> d[i] = ps[t[i]]).sum() >= 0 && new StringBuilder() instanceof StringBuilder sb && new long[2] instanceof long[] cc && IntStream.range(0, n).map(q -> n - q).map(k -> (Integer) IntStream.rangeClosed(1, k).filter(i -> d[i] == k).findFirst().getAsInt() instanceof Integer p && new int[]{p} instanceof int[] cur && IntStream.rangeClosed(p + 1, k).filter(j -> d[j] <= cur[0] && sb.append(cur[0]).append(' ').append(j).append('\n') != null && (cc[0] += j - cur[0]) >= 0 && (cc[1]++) >= 0 && ((d[cur[0]] ^= d[j]) + (d[j] ^= d[cur[0]]) + (d[cur[0]] ^= d[j])) >= 0 && (cur[0] = j) > 0).count() >= 0 ? 1 : 0).sum() >= 0 ? cc[0] + "\n" + cc[1] + "\n" + sb.toString().stripTrailing() : "");
    }
}
