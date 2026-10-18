import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in).next() instanceof String s
            && (Integer) s.length() instanceof Integer n
            && IntStream.rangeClosed(1, n).filter(p -> p != 1 && !(p * 2 > n && IntStream.rangeClosed(2, (int) Math.sqrt(p)).noneMatch(d -> p % d == 0))).toArray() instanceof int[] grp
            && s.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
                .max(Map.Entry.<Integer, Long>comparingByValue().thenComparing(Map.Entry.<Integer, Long>comparingByKey().reversed())).get() instanceof Map.Entry<Integer, Long> best
            && best.getValue() >= grp.length
            && new int[]{grp.length} instanceof int[] skip
            && s.chars().sorted().filter(ch -> ch != best.getKey() || skip[0]-- <= 0).toArray() instanceof int[] rest
            && new int[]{0} instanceof int[] ri
            ? "YES\n" + IntStream.rangeClosed(1, n)
                .mapToObj(p -> String.valueOf((char) (Arrays.binarySearch(grp, p) >= 0 ? best.getKey() : rest[ri[0]++])))
                .collect(Collectors.joining())
            : "NO");
    }
}
