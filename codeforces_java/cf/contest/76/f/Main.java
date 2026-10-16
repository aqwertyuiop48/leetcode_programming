import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toList() instanceof List<long[]> raw
                && Long.valueOf(s.nextLong()) instanceof Long v
                && raw.stream().map(g -> new long[]{v * g[1] - g[0], v * g[1] + g[0]}).toList() instanceof List<long[]> pts
                ? Stream.of(pts.stream().filter(q -> q[0] >= 0 && q[1] >= 0).toList(), pts)
                    .map(list ->
                        list.stream().sorted(Comparator.<long[]>comparingLong(q -> q[0]).thenComparingLong(q -> q[1])).toList() instanceof List<long[]> srt
                        && new long[srt.size() + 1] instanceof long[] tl
                        && new int[]{0} instanceof int[] len
                        && srt.stream().allMatch(q ->
                            new int[]{0, len[0]} instanceof int[] lh
                            && IntStream.range(0, 20).allMatch(z -> lh[0] >= lh[1] || (tl[(lh[0] + lh[1]) / 2] > q[1] ? (lh[1] = (lh[0] + lh[1]) / 2) : (lh[0] = (lh[0] + lh[1]) / 2 + 1)) >= 0)
                            && (tl[lh[0]] = q[1]) == q[1]
                            && (len[0] += lh[0] == len[0] ? 1 : 0) >= 0)
                        ? len[0]
                        : 0)
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "))
                : ""));
    }
}



