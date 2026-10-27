import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> w
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, (int) Math.pow(n, n)).mapToObj(c -> IntStream.range(0, n).map(i -> (int) (c / Math.pow(n, i)) % n).toArray())
                .filter(p -> Arrays.stream(p).distinct().count() == n).toList() instanceof List<int[]> perms
            ? IntStream.rangeClosed(1, m).mapToObj(idx -> Integer.valueOf(s.nextInt()) instanceof Integer k
                && IntStream.range(0, k).mapToObj(i -> s.next()).toList() instanceof List<String> pw
                ? new int[]{idx, perms.stream().filter(p -> new int[]{0} instanceof int[] ptr
                        && pw.stream().allMatch(x -> ptr[0] >= n || !x.equals(w.get(p[ptr[0]])) || ++ptr[0] > 0) && ptr[0] >= n)
                    .mapToInt(p -> n * (n - 1) / 2 - (int) IntStream.range(0, n).flatMap(i -> IntStream.range(i + 1, n).filter(j -> p[i] > p[j])).count() + 1).max().orElse(0)} : null)
                .filter(r -> r[1] > 0).max(Comparator.<int[]>comparingInt(r -> r[1]).thenComparingInt(r -> -r[0]))
                .map(r -> r[0] + "\n[:" + "|".repeat(r[1]) + ":]").orElse("Brand new problem!") : "");
    }
}

