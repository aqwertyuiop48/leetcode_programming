import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).mapToObj(i -> new int[]{it.nextInt(), it.nextInt()}).toArray(int[][]::new) instanceof int[][] p
            && new int[1002] instanceof int[] cnt && Arrays.stream(p).allMatch(q -> ++cnt[q[1]] > 0)
            ? String.valueOf(Arrays.stream(p).filter(q -> cnt[q[0]] - (q[0] == q[1] ? 1 : 0) == 0).count()) : "");
    }
}
