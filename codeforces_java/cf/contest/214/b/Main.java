import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[10] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> ++cnt[s.nextInt()] > 0)
            && Integer.valueOf(IntStream.range(0, 10).map(d -> d * cnt[d]).sum() % 3) instanceof Integer r
            && (r == 0 || IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(d -> d % 3 == r && cnt[d] > 0).findFirst() instanceof OptionalInt o && o.isPresent() && --cnt[o.getAsInt()] >= 0
                || IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(d -> d % 3 == 3 - r).flatMap(d -> IntStream.range(0, cnt[d]).map(k -> d)).limit(2).toArray() instanceof int[] two
                    && two.length == 2 && Arrays.stream(two).allMatch(d -> --cnt[d] >= 0))
            ? cnt[0] == 0 ? "-1" : IntStream.iterate(9, d -> d >= 0, d -> d - 1).mapToObj(d -> String.valueOf(d).repeat(cnt[d])).collect(Collectors.joining()) instanceof String res
                ? res.startsWith("0") ? "0" : res : ""
            : "-1");
    }
}
