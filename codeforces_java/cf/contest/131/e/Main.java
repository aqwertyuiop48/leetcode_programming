import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm -> Optional.of(IntStream.range(0, nm[1]).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new)).ifPresent(q -> Optional.of(new int[nm[1]]).ifPresent(t -> System.out.print(IntStream.range(0, 4).allMatch(k -> IntStream.range(0, nm[1]).mapToLong(i -> ((long) (k == 0 ? q[i][1] : k == 1 ? q[i][0] : k == 2 ? q[i][0] - q[i][1] + nm[0] : q[i][0] + q[i][1]) << 34) | ((long) (k == 1 ? q[i][1] : q[i][0]) << 17) | i).sorted().toArray() instanceof long[] c && IntStream.range(0, nm[1]).allMatch(p -> (t[(int) (c[p] & 131071)] += (p > 0 && (c[p - 1] >> 34) == (c[p] >> 34) ? 1 : 0) + (p + 1 < nm[1] && (c[p + 1] >> 34) == (c[p] >> 34) ? 1 : 0)) >= 0)) ? IntStream.rangeClosed(0, 8).mapToObj(v -> String.valueOf(Arrays.stream(t).filter(x -> x == v).count())).collect(Collectors.joining(" ")) : ""))))); 
    }
}
