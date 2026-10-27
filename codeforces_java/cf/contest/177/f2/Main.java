import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Long) Long.parseLong(tk.nextToken()) instanceof Long t
            && IntStream.range(0, k).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken())}).toArray(int[][]::new) instanceof int[][] e
            && IntStream.range(0, k).mapToLong(j -> (1L << (10 + e[j][0])) | (1L << e[j][1])).toArray() instanceof long[] add
            ? Stream.iterate(new long[]{0L}, f -> f.length > 0, f -> Arrays.stream(f).parallel().flatMap(s -> IntStream.range((int) (s >>> 20 & 127), k).filter(j -> (s & add[j]) == 0)
                    .mapToLong(j -> (s & ((1L << 20) - 1)) | add[j] | ((long) (j + 1) << 20) | ((s >>> 27) + e[j][2] << 27))).toArray())
                .flatMapToLong(Arrays::stream).map(s -> s >>> 27).sorted().skip(t - 1).findFirst().getAsLong()
            : "");
    }


}
