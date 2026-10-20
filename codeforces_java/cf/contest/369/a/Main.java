import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && Integer.valueOf((int) Arrays.stream(a).filter(x -> x == 1).count()) instanceof Integer c1
            ? Math.max(0, c1 + Math.max(0, n - c1 - k) - m) : "");
    }
}
