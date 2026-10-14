import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt()} instanceof int[] tArr
            ? IntStream.range(0, tArr[0]).mapToObj(tc ->
                new int[]{s.nextInt()} instanceof int[] nArr
                && new int[]{2 * nArr[0] - 1} instanceof int[] totalArr
                && IntStream.range(0, totalArr[0]).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), i + 1})
                    .sorted(Comparator.comparingLong(a -> a[0])).toArray(long[][]::new) instanceof long[][] box
                && new long[]{
                        IntStream.range(0, totalArr[0]).mapToLong(i -> i % 2 == 0 ? box[i][1] : 0).sum(),
                        Arrays.stream(box).mapToLong(b -> b[1]).sum()
                   } instanceof long[] sums
                && (2 * sums[0] >= sums[1]
                        ? IntStream.iterate(0, i -> i + 2).limit((totalArr[0] + 1) / 2).mapToLong(i -> box[i][2]).toArray()
                        : LongStream.concat(
                            IntStream.iterate(1, i -> i + 2).limit((totalArr[0] - 1) / 2).mapToLong(i -> box[i][2]),
                            LongStream.of(box[totalArr[0] - 1][2])).toArray())
                    instanceof long[] chosen
                ? "YES\n" + Arrays.stream(chosen).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                : "NO").collect(Collectors.joining("\n"))
            : "");
    }
}

