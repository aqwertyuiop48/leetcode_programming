import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new long[]{s.nextLong(), s.nextLong(), s.nextLong()} instanceof long[] nmv
            && new int[]{(nmv[2] == 1 ? 2 : 1)} instanceof int[] aArr
            && IntStream.rangeClosed(1, (int) nmv[0]).filter(i -> i != (int) nmv[2] && i != aArr[0]).toArray() instanceof int[] b
            && new long[]{nmv[0] - 1, (long) b.length * (b.length - 1) / 2 + (nmv[0] - 1)} instanceof long[] minmax
            ? (nmv[1] < minmax[0] || nmv[1] > minmax[1]
                ? "-1"
                : new ArrayList<int[]>() instanceof List<int[]> edges
                    && edges.add(new int[]{(int) nmv[2], aArr[0]})
                    && (b.length == 0 || edges.add(new int[]{(int) nmv[2], b[0]}))
                    && IntStream.range(1, b.length).allMatch(i -> edges.add(new int[]{b[i - 1], b[i]}))
                    && new long[]{nmv[1] - edges.size()} instanceof long[] remArr
                    && new long[]{Math.min(remArr[0], (long) b.length * (b.length - 1) / 2 - Math.max(0, b.length - 1))} instanceof long[] take1Arr
                    && IntStream.range(0, b.length).boxed()
                        .flatMap(i -> IntStream.range(i + 1, b.length).filter(j -> j - i != 1).mapToObj(j -> new int[]{b[i], b[j]}))
                        .limit(take1Arr[0])
                        .allMatch(edges::add)
                    && new long[]{remArr[0] - take1Arr[0]} instanceof long[] take2Arr
                    && IntStream.range(1, b.length).limit(take2Arr[0]).mapToObj(i -> new int[]{(int) nmv[2], b[i]}).allMatch(edges::add)
                ? edges.stream().map(e -> e[0] + " " + e[1]).collect(Collectors.joining("\n"))
                : "-1")
            : "-1");
    }
}

