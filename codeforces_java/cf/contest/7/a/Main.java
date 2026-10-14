import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.range(0, 8).mapToObj(i -> s.next()).toArray(String[]::new)).ifPresent(g ->
            System.out.println(
                new long[]{IntStream.range(0, 8).filter(r -> g[r].chars().allMatch(c -> c == 'B')).count()} instanceof long[] rows
                && new long[]{IntStream.range(0, 8).filter(c -> IntStream.range(0, 8).allMatch(r -> g[r].charAt(c) == 'B')).count()} instanceof long[] cols
                ? (rows[0] == 8 && cols[0] == 8 ? 8 : rows[0] + cols[0])
                : 0)));
    }
}
