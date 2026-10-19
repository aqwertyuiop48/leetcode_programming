import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> -a[i]).thenComparingInt(i -> i)).limit(k).toList() instanceof List<Integer> pick
            ? pick.stream().mapToInt(i -> a[i]).min().getAsInt() + "\n" + pick.stream().sorted().map(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}
