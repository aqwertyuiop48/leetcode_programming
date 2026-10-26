import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray() instanceof int[] a
            && new ArrayList<Long>() instanceof ArrayList<Long> pairs && new int[]{0} instanceof int[] i
            && Stream.generate(() -> 0).takeWhile(z -> i[0] + 1 < n).allMatch(z -> a[i[0]] - a[i[0] + 1] <= 1 ? pairs.add((long) a[i[0] + 1]) && (i[0] += 2) > 0 : ++i[0] > 0)
            ? IntStream.range(0, pairs.size() / 2).mapToLong(j -> pairs.get(2 * j) * pairs.get(2 * j + 1)).sum() : 0);
    }
}
