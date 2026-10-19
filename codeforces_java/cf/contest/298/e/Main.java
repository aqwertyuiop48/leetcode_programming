import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] s
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> s[i])).toList() instanceof List<Integer> o && Integer.valueOf((n + 2) / 3) instanceof Integer k
            && new int[n] instanceof int[] a && new int[n] instanceof int[] b
            && IntStream.range(0, n).allMatch(r -> o.get(r) instanceof Integer id && (r < k ? (a[id] = r) >= 0 && (b[id] = s[id] - r) >= 0 : r < 2 * k ? (b[id] = r) >= 0 && (a[id] = s[id] - r) >= 0 : (b[id] = n - 1 - r) >= 0 && (a[id] = s[id] - b[id]) >= 0))
            ? "YES\n" + Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n" + Arrays.stream(b).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
