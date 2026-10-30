import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> (Long) Long.parseLong(tk.nextToken()) instanceof Long l && (Long) Long.parseLong(tk.nextToken()) instanceof Long r ? (r << 31) | l : 0L).sorted().toArray() instanceof long[] k
            && new long[]{-1} instanceof long[] last
            ? Arrays.stream(k).filter(v -> (v & 2147483647L) > last[0] && (last[0] = v >>> 31) >= 0).count() : 0);
    }
}
