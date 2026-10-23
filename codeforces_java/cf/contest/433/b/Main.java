import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] v
            && LongStream.concat(LongStream.of(0), LongStream.of(v)).toArray() instanceof long[] p0 && new long[n + 1] instanceof long[] p1 && new long[n + 1] instanceof long[] p2
            && IntStream.rangeClosed(1, n).allMatch(i -> (p1[i] = p1[i - 1] + v[i - 1]) > 0)
            && LongStream.of(v).sorted().toArray() instanceof long[] sv && IntStream.rangeClosed(1, n).allMatch(i -> (p2[i] = p2[i - 1] + sv[i - 1]) > 0)
            ? IntStream.range(0, Integer.parseInt(tk.nextToken())).mapToObj(q -> (Boolean) tk.nextToken().equals("1") instanceof Boolean t && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer r
                ? String.valueOf((t ? p1 : p2)[r] - (t ? p1 : p2)[l - 1]) : "").collect(Collectors.joining("\n")) : "");
    }
}
