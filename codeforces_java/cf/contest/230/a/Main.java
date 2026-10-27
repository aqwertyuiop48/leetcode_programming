import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer s && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{sc.nextInt(), sc.nextInt()}).sorted(Comparator.comparingInt(d -> d[0])).toList() instanceof List<int[]> ds
            && new int[]{s} instanceof int[] cur
            ? ds.stream().allMatch(d -> cur[0] > d[0] && (cur[0] += d[1]) > 0) ? "YES" : "NO" : "");
    }
}

