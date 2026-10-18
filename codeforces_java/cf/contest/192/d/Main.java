import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer n
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer k
            && Long.valueOf(Long.parseLong((String) it.next())) instanceof Long b
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong((String) it.next())).toArray() instanceof long[] a
            && Arrays.stream(a, 0, n - 1).boxed().sorted(Comparator.reverseOrder()).mapToLong(x -> x).toArray() instanceof long[] srt
            && Long.valueOf(Arrays.stream(srt, 0, Math.min(k, srt.length)).sum()) instanceof Long topK
            && Long.valueOf(Arrays.stream(srt, 0, Math.min(k - 1, srt.length)).sum()) instanceof Long topK1
            ? IntStream.range(0, n - 1).filter(i -> (k > srt.length || a[i] >= srt[k - 1] ? topK : topK1 + a[i]) > b).map(i -> i + 1).findFirst().orElse(n)
            : 0);
    }
}
