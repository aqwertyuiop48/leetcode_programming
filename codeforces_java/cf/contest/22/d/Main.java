import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt()} instanceof int[] nArr
            && IntStream.range(0, nArr[0] * 2).mapToLong(i -> s.nextLong()).toArray() instanceof long[] arr
            && IntStream.range(0, nArr[0]).mapToObj(i -> new long[]{Math.min(arr[2 * i], arr[2 * i + 1]), Math.max(arr[2 * i], arr[2 * i + 1])})
                .sorted(Comparator.comparingLong(a -> a[1])).toArray(long[][]::new) instanceof long[][] segs
            && new boolean[nArr[0]] instanceof boolean[] covered
            && new ArrayList<Long>() instanceof List<Long> nails
            && IntStream.range(0, nArr[0]).allMatch(i -> covered[i] || (nails.add(segs[i][1])
                && IntStream.range(i, nArr[0]).allMatch(j -> !(!covered[j] && segs[j][0] <= segs[i][1] && segs[i][1] <= segs[j][1]) || (covered[j] = true))))
            ? nails.size() + "\n" + nails.stream().map(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}



