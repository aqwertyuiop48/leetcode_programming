import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new int[n] instanceof int[] tails && new int[]{0} instanceof int[] len
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(Integer.parseInt(it.next())) instanceof Integer x && it.next() != null
                && Integer.valueOf((int) Arrays.stream(tails, 0, len[0]).filter(y -> y <= x).count()) instanceof Integer pos
                && (tails[pos] = x) >= 0 && (pos < len[0] || ++len[0] > 0))
            ? n - len[0] : "");
    }
}
