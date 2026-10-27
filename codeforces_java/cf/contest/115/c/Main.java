import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).split("\r?\n") instanceof String[] ln
            && Arrays.stream(ln[0].trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] nm
            && Arrays.stream(ln, 1, 1 + nm[0]).map(String::trim).toArray(String[]::new) instanceof String[] g
            ? LongStream.concat(
                IntStream.range(0, nm[0]).mapToLong(i -> IntStream.range(0, nm[1]).filter(c -> g[i].charAt(c) != '.')
                    .map(c -> ((g[i].charAt(c) >= '3' ? 1 : 0) - c) & 1).summaryStatistics() instanceof IntSummaryStatistics st
                    ? (st.getCount() == 0 ? 2 : st.getMin() == st.getMax() ? 1 : 0) : 0),
                IntStream.range(0, nm[1]).mapToLong(c -> IntStream.range(0, nm[0]).filter(r -> g[r].charAt(c) != '.')
                    .map(r -> ((g[r].charAt(c) == '2' || g[r].charAt(c) == '3' ? 1 : 0) - r) & 1).summaryStatistics() instanceof IntSummaryStatistics st
                    ? (st.getCount() == 0 ? 2 : st.getMin() == st.getMax() ? 1 : 0) : 0))
                .reduce(1L, (a, b) -> a * b % 1000003)
            : 0);
    }
}

