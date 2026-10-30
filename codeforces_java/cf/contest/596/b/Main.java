import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new long[]{0} instanceof long[] prev
            ? IntStream.range(0, n).mapToLong(i -> (Long) Long.parseLong(tk.nextToken()) instanceof Long b ? Math.abs(b - prev[0]) + 0 * (prev[0] = b) : 0).sum() : 0);
    }
}
