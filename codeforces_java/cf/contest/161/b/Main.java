import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.rangeClosed(1, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), i}).toList() instanceof List<int[]> items
            && Stream.concat(items.stream().filter(it -> it[1] == 1).sorted(Comparator.comparingInt((int[] it) -> -it[0])),
                items.stream().filter(it -> it[1] == 2)).toList() instanceof List<int[]> ord
            && Stream.concat(ord.subList(0, k - 1).stream().map(it -> List.of(it)), Stream.of(ord.subList(k - 1, n))).toList() instanceof List<List<int[]>> carts
            ? String.format(Locale.ROOT, "%.1f", carts.stream().mapToDouble(c -> c.stream().mapToLong(it -> it[0]).sum() - (c.stream().anyMatch(it -> it[1] == 1) ? c.stream().mapToLong(it -> it[0]).min().getAsLong() / 2.0 : 0)).sum())
                + "\n" + carts.stream().map(c -> c.size() + " " + c.stream().map(it -> String.valueOf(it[2])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
            : "");
    }
}
