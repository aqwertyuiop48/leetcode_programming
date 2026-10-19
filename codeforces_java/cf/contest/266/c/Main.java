import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && new int[n - 1] instanceof int[] rr && new int[n - 1] instanceof int[] cc
            && IntStream.range(0, n - 1).allMatch(i -> (rr[i] = it.nextInt()) > 0 && (cc[i] = it.nextInt()) > 0)
            && new ArrayList<int[]>() instanceof ArrayList<int[]> ops
            && IntStream.iterate(n, k -> k >= 2, k -> k - 1).allMatch(k -> Integer.valueOf(IntStream.rangeClosed(1, k).filter(c -> IntStream.range(0, n - 1).noneMatch(i -> rr[i] <= k && cc[i] == c)).findFirst().getAsInt()) instanceof Integer c
                && (c == k || ops.add(new int[]{2, c, k}) && IntStream.range(0, n - 1).allMatch(i -> (cc[i] = cc[i] == c ? k : cc[i] == k ? c : cc[i]) > 0))
                && Integer.valueOf(IntStream.range(0, n - 1).filter(i -> rr[i] <= k).findFirst().orElse(-1)) instanceof Integer f
                && (f < 0 || rr[f] == k || Integer.valueOf(rr[f]) instanceof Integer rf && ops.add(new int[]{1, rf, k}) && IntStream.range(0, n - 1).allMatch(i -> (rr[i] = rr[i] == rf ? k : rr[i] == k ? rf : rr[i]) > 0)))
            ? ops.size() + ops.stream().map(o -> "\n" + o[0] + " " + o[1] + " " + o[2]).collect(Collectors.joining()) : "");
    }
}
