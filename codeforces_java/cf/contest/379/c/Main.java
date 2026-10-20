import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> (long) t[i + 1] << 20 | i).sorted().toArray() instanceof long[] k
            && new int[n] instanceof int[] r && new int[]{0} instanceof int[] prev
            && Arrays.stream(k).allMatch(x -> (r[(int) (x & 1048575)] = prev[0] = Math.max((int) (x >> 20), prev[0] + 1)) > 0)
            ? Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
