import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> t[3 + i]).thenComparingInt(i -> i)).mapToInt(i -> i).toArray() instanceof int[] ord
            && new int[n] instanceof int[] rank
            && IntStream.range(0, n).allMatch(p -> (rank[ord[p]] = p) >= 0)
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(t[1] == t[2] ? (i < t[1] ? 1 : 2) : rank[i] >= n - Math.min(t[1], t[2]) ? (t[1] < t[2] ? 1 : 2) : (t[1] < t[2] ? 2 : 1))).collect(Collectors.joining(" ")) : "");
    }
}
