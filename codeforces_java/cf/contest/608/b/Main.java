import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && t.nextToken() instanceof String a && t.nextToken() instanceof String b
            && Integer.valueOf(a.length()) instanceof Integer n && Integer.valueOf(b.length()) instanceof Integer m && new int[m + 1] instanceof int[] pre
            && IntStream.range(0, m).filter(i -> (pre[i + 1] = pre[i] + b.charAt(i) - 48) >= 0).count() >= 0
            ? IntStream.range(0, n).mapToLong(i -> Long.valueOf(pre[i + m - n + 1] - pre[i]) instanceof Long ones ? (a.charAt(i) == 48 ? ones : (m - n + 1) - ones) : 0L).sum() : "");
    }
}
