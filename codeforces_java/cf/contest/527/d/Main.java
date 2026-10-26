import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong(tk.nextToken()), Long.parseLong(tk.nextToken())}).sorted(Comparator.comparingLong(p -> p[0] + p[1])).toList() instanceof List<long[]> pts
            && new long[]{Long.MIN_VALUE} instanceof long[] last
            ? pts.stream().filter(p -> p[0] - p[1] >= last[0] && (last[0] = p[0] + p[1]) > Long.MIN_VALUE).count() : 0);
    }
}
