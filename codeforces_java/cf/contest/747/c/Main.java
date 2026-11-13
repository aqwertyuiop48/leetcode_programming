import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer q
            && new long[n] instanceof long[] until
            ? IntStream.range(0, q).mapToObj(z -> Long.valueOf(Long.parseLong(tk.nextToken())) instanceof Long t && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer k && Long.valueOf(Long.parseLong(tk.nextToken())) instanceof Long d
                && IntStream.range(0, n).filter(i -> until[i] < t).limit(k).toArray() instanceof int[] f && f.length == k
                && Arrays.stream(f).filter(i -> (until[i] = t + d - 1) < 0).count() >= 0
                ? String.valueOf(Arrays.stream(f).map(i -> i + 1).sum()) : "-1").collect(Collectors.joining("\n")) : "");
    }
}
